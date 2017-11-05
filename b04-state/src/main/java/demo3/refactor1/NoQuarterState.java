package demo3.refactor1;

/**
 * 未投币状态
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/5
 */
public class NoQuarterState implements State {

    /**
     * 糖果机
     */
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投币成功!");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("未投币,不可退款!");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("未投币,不能转动曲柄!");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("未投币,请先投币!");
    }
}
