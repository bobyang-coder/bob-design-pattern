package message.subscribe;


import common.IdentityInfo;
import common.RegisterCenter;
import common.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 消息订阅者
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/30
 */
public class MessageSubscribe extends IdentityInfo implements Subscribe {
    private static final Logger logger = LoggerFactory.getLogger(MessageSubscribe.class);

    private RegisterCenter registerCenter;

    private MessageSubscribe() {
    }

    public static MessageSubscribe init(String host, String port, RegisterCenter registerCenter) {
        MessageSubscribe subscribe = new MessageSubscribe();
        subscribe.setHost(host);
        subscribe.setPort(port);
        subscribe.registerCenter = registerCenter;
        return subscribe;
    }

    public String getHostAndPort() {
        return this.getHost() + ":" + this.getPort();
    }

    public MessageSubscribe subscribe(String topic) {
        registerCenter.subscribe(topic, this);
        return this;
    }

    public boolean callback(String message) {
        logger.info("[{}]-[收到消息:{}]", getHostAndPort(), message);
        return true;
    }
}
