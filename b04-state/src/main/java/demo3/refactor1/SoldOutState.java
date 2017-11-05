package demo3.refactor1;

/**
 * 售罄状态
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/5
 */
public class SoldOutState implements State {

    /**
     * 糖果机
     */
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("暂不可投币,糖果已售罄!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("未投币,不能退款!");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("你转动了曲柄,但是没有糖果喽!");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("无糖果可发放!");
    }
}
