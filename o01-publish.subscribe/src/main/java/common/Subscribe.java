package common;

import message.subscribe.MessageSubscribe;

/**
 * 订阅者
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/30
 */
public interface Subscribe {

    String getHostAndPort();

    MessageSubscribe subscribe(String topic);

    boolean callback(String message);
}
