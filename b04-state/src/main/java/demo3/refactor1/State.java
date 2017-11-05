package demo3.refactor1;

/**
 * Created by bob on 2017/11/5.
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/5
 */
public interface State {
    /**
     * 投币
     */
    void insertQuarter();

    /**
     * 退币
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    boolean turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
