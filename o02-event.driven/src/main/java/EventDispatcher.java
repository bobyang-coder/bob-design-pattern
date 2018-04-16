/**
 * 事件调度器
 *
 * @author haibo.yang
 * @since 16 四月 2018
 */
public interface EventDispatcher {

    /**
     * 注册事件处理器
     *
     * @param handler
     */
    void register(EventHandler handler);

    /**
     * 移除事件处理器
     *
     * @param handler
     */
    void remove(EventHandler handler);

    /**
     * 处理事件
     */
    void handle();
}
