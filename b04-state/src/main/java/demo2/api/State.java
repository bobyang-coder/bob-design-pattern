package demo2.api;

/**
 * 这个接口必须由任何应该在状态机中实现某个状态的类扩展。
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/5
 */
public interface State {
    /**
     * 每次进入该状态时应采取的操作
     */
    void entryAction();

    /**
     * 每次退出该状态时应采取的操作
     */
    void exitAction();

    /**
     * 此方法处理接收到的事件
     *
     * @param event 要处理的事件
     * @return 如果已处理返回true
     */
    boolean processEvent(StateEvent event);
}
