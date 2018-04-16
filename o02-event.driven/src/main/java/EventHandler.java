/**
 * 事件处理器
 *
 * @author haibo.yang
 * @since 16 四月 2018
 */
public interface EventHandler {


    /**
     * 判断是否支持该事件
     *
     * @param event 事件
     * @return
     */
    boolean supportType(Event event);

    /**
     * 处理事件
     */
    void handle();
}
