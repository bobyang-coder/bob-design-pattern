package message.publish;

import common.IdentityInfo;
import common.Publish;
import common.RegisterCenter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 消息发布者
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/30
 */
public class MessagePublish extends IdentityInfo implements Publish {
    private static final Logger logger = LoggerFactory.getLogger(MessagePublish.class);

    private RegisterCenter registerCenter;

    private MessagePublish() {
    }

    public static MessagePublish init(String host, String port, RegisterCenter registerCenter) {
        MessagePublish publish = new MessagePublish();
        publish.setHost(host);
        publish.setPort(port);
        publish.registerCenter = registerCenter;
        return publish;
    }

    public MessagePublish publish(String topic, String message) {
        registerCenter.publish(topic, message);
        return this;
    }
}
