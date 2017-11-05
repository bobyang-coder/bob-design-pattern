package demo3.refactor1;

import java.util.Random;

/**
 * 已投币状态
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/5
 */
public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());//幸运数
    /**
     * 糖果机
     */
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已投币，请勿重复投!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退款成功!");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("你转动了曲柄......");
        int winner = randomWinner.nextInt(10);
        if ((winner == 1) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setCurrentState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setCurrentState(gumballMachine.getSoldState());
        }
        return true;
    }

    @Override
    public void dispense() {
        System.out.println("无糖果可发放!");
    }
}
