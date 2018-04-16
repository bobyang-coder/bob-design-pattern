package message.register;

import common.RegisterCenter;
import common.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

/**
 * 消息注册中心
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/30
 */
public class MessageRegisterCenter implements RegisterCenter {

    private static final Logger logger = LoggerFactory.getLogger(MessageRegisterCenter.class);

    private boolean isNotify = true;//是否开启通知
    private ConcurrentMap<String, ConcurrentLinkedQueue<Subscribe>> subscribeerMap;//订阅者列表
    private ConcurrentMap<String, ConcurrentLinkedQueue<String>> messageMap;//消息列表


    public void publish(String topic, String message) {
        if (null == messageMap) {
            messageMap = new ConcurrentHashMap<String, ConcurrentLinkedQueue<String>>();
        }
        ConcurrentLinkedQueue<String> topicMessage = messageMap.get(topic);//主题小心list
        if (null == topicMessage) {
            topicMessage = new ConcurrentLinkedQueue<String>();
            messageMap.put(topic, topicMessage);
        }
        topicMessage.add(message);
        logger.info("[主题{}：发布消息：{}成功]", topic, message);
    }

    public void subscribe(String topic, Subscribe subscribe) {
        if (null == subscribeerMap) {
            subscribeerMap = new ConcurrentHashMap<String, ConcurrentLinkedQueue<Subscribe>>();
        }
        ConcurrentLinkedQueue<Subscribe> subscribeList = subscribeerMap.get(topic);//主题小心list
        if (null == subscribeList) {
            subscribeList = new ConcurrentLinkedQueue<Subscribe>();
            subscribeerMap.put(topic, subscribeList);
        }
        subscribeList.add(subscribe);
        logger.info("[{}订阅主题：{}成功]", subscribe.getHostAndPort(), topic);
    }

    public void startNotify() {
        new Thread(new Runnable() {
            public void run() {
                while (isNotify) {
                    if (null != messageMap && !messageMap.isEmpty()) {
                        for (Map.Entry<String, ConcurrentLinkedQueue<String>> entry : messageMap.entrySet()) {
                            String topic = entry.getKey();
                            ConcurrentLinkedQueue<String> messageList = entry.getValue();
                            if (null == messageList || messageList.isEmpty()) {
                                logger.debug("[主题：{},无可通知消息]", topic);
                                continue;
                            }
                            if (null == subscribeerMap || subscribeerMap.isEmpty()) {
                                logger.debug("[无小心订阅者]");
                                continue;
                            }
                            ConcurrentLinkedQueue<Subscribe> list = subscribeerMap.get(topic);
                            if (null == list || list.isEmpty()) {
                                logger.debug("[主题：{},无小心订阅者]", topic);
                                continue;
                            }
                            Iterator<String> iterator = messageList.iterator();
                            while (iterator.hasNext()) {
                                String message = iterator.next();
                                for (Subscribe subscribe : list) {
                                    subscribe.callback(message);
                                    logger.debug("[通知：{}消息：{}成功]", subscribe.getHostAndPort(), message);
                                }
                                iterator.remove();//删除消息
                            }
                        }
                    }
                    try {
                        Thread.sleep(500);
                        logger.debug("[线程休眠中.......]");
                    } catch (InterruptedException e) {
                        logger.error("[线程休眠异常]", e);
                    }
                }

            }
        }).start();
    }

    public void clostNotify() {
        isNotify = false;
    }
}
