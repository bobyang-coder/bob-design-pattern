package demo3.refactor1;

/**
 * 糖果机
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/5
 */
public class GumballMachine {

    /**
     * 状态对象
     * <p>
     * (所有的状态对象都是在构造器中创建并赋值的)
     */
    State soldOutState;//售罄
    State noQuarterState;//未投币
    State hasQuarterState;//已投币
    State soldState;//售出
    State winnerState;//优惠状态

    /**
     * 初始状态
     */
    State currentState = soldOutState;
    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            currentState = noQuarterState;
        }
    }


    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        if (currentState.turnCrank()) {
            currentState.dispense();
        }
    }

    /**
     * 释放糖果
     */
    void releaseBall() {
        System.out.println("一个糖果正在滚出槽!");
        if (count != 0) {
            --count;
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "count=" + count +
                '}';
    }
}


