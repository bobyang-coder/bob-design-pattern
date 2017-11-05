package demo3.refactor1;

/**
 * Created by bob on 2017/11/5.
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/5
 */
public class WinnerState implements State {
    /**
     * 糖果机
     */
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("🎉🎉恭喜你中奖了!获得两个糖果🎉🎉");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            System.out.println("哦,糖果已售罄,没糖果喽!");
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("哦,糖果已售罄,没糖果喽!");
                gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
            }
        }
    }
}
