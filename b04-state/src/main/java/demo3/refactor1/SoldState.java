package demo3.refactor1;

/**
 * 售出状态
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/5
 */
public class SoldState implements State {

    /**
     * 糖果机
     */
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("正在售出,不能投币!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,你已转动曲柄,不能退款!");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("投一次币只能转动一次!");
        return false;
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("哦,糖果已售罄,没糖果喽!");
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
        }
    }
}
