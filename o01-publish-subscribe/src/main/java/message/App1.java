package message;

import message.publish.MessagePublish;
import message.register.MessageRegisterCenter;
import message.subscribe.MessageSubscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bob on 2017/9/30.
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/30
 */
public class App1 {
    private static final Logger logger = LoggerFactory.getLogger(App1.class);

    public static void main(String[] args) {
        //创建消息注册中心
        final MessageRegisterCenter registerCenter = new MessageRegisterCenter();
        //发起消息通知
        registerCenter.startNotify();

        //创建消息
        final MessagePublish publish = MessagePublish.init("127.0.0.1", "1", registerCenter);
        publish.publish("p11", "p1发送消息p11")
                .publish("p12", "p1发送消息12");
        MessagePublish.init("127.0.0.2", "2", registerCenter)
                .publish("p21", "p2发送消息");

        //订阅消息
        MessageSubscribe.init("128.1.1.1", "1", registerCenter).subscribe("p11");
        MessageSubscribe.init("128.1.1.2", "2", registerCenter).subscribe("p12");
        MessageSubscribe.init("128.1.1.3", "3", registerCenter).subscribe("p21");

        new Thread(new Runnable() {
            public void run() {
                int i = 1;
                while (i < 10) {
                    publish.publish("p1", "" + i++);
                    logger.info("[生产消息：{}]", i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        logger.error("[程序休眠异常]", e);
                    }
                }
                registerCenter.clostNotify();
            }
        }).start();

    }
}
