package demo2.api;

/**
 * 事件类保存有关状态机可以处理的不同事件的信息。事件的优先级取决于事件的重要性。
 * 优先级模型试图确保旧消息在任何新消息之前处理。
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/5
 */
public interface StateEvent extends Comparable {

    /**
     * This method should be adapted by any subclass
     * to return the type corresponding to the actual event.
     *
     * @return type of this StateEvent
     */
    <E> E encodeType(Class<E> enumType);

    /**
     * Return type of this StateEvent
     *
     * @return type of this StateEvent
     */
    Enum getType();

    /**
     * Returns a negative value if the priority for this object
     * is higher than the priority for the supplied object.
     * @param obj the Event to compare to.
     * @return compare result
     */

    /**
     * Set information object to this StateEvent
     *
     * @param data information object
     */
    void setData(Object data);

    /**
     * Return information object of this StateEvent
     *
     * @return information object of this StateEvent
     */
    Object getData();
}