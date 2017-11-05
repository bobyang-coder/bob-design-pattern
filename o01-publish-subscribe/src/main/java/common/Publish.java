package common;

import message.publish.MessagePublish;

/**
 * 发布者
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/30
 */
public interface Publish {

    MessagePublish publish(String topic, String message);
}
