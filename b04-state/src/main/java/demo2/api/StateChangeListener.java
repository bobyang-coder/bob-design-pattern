package demo2.api;

/**
 * 接口用于通知FSM状态的变化
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/5
 */
public interface StateChangeListener<T> {
    /**
     * @param oldState Old demo1 of FSM
     * @param newState New demo1 of FSM
     * @deprecated A change of demo1 has occurred for a FSM.
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    void stateChanged(Enum oldState, Enum newState);

    /**
     * A change of demo1 has occurred for a FSM.
     *
     * @param source   the App Session that generated the change.
     * @param oldState Old demo1 of FSM
     * @param newState New demo1 of FSM
     */
    @SuppressWarnings("unchecked")
    void stateChanged(T source, Enum oldState, Enum newState);
}
