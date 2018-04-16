package common;

/**
 * 注册中心接口
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/30
 */
public interface RegisterCenter {

    /**
     * 发布
     *
     * @param topic   主题
     * @param message 消息
     */
    void publish(String topic, String message);

    /**
     * 订阅
     *
     * @param topic 主题
     */
    void subscribe(String topic, Subscribe subscribe);

}
