package demo2.api;

/**
 * StateMachine允许您组织事件处理，如果事件的顺序对您很重要。
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/5
 */
public interface StateMachine {
    /**
     * Add a new demo1 change listener
     *
     * @param listener a reference to the listener that will get information about demo1 changes.
     */
    void addStateChangeNotification(StateChangeListener listener);

    /**
     * Remove a demo1 change listener
     *
     * @param listener a reference to the listener that will get information about demo1 changes.
     */
    void removeStateChangeNotification(StateChangeListener listener);

    /**
     * Handle an event in the current demo1.
     *
     * @param event processing event
     * @return true if staterocessed
     * //     * @throws OverloadException if queue of demo1 mashine is full
     * //     * @throws InternalException if FSM has internal error
     */
    boolean handleEvent(StateEvent event);

    /**
     * Get the current demo1
     *
     * @param stateType type of demo1
     * @return current demo1
     */
    <E> E getState(Class<E> stateType);
}
