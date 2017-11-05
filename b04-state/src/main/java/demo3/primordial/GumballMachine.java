package demo3.primordial;

/**
 * 糖果机
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/5
 */
public class GumballMachine {

    /**
     * 状态
     */
    final static int SOLD_OUT = 0;//售罄
    final static int NO_QUARTER = 1;//未投币
    final static int HAS_QUARTER = 2;//已投币
    final static int SOLD = 3;//糖果正在出

    /**
     * 状态机初始值
     */
    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }


    /**
     * 投币
     */
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("已投币，请勿重复投!");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("投币成功!");
        } else if (state == SOLD_OUT) {
            System.out.println("暂不可投币,糖果已售罄!");
        } else if (state == SOLD) {
            System.out.println("请稍后再试,你已经领取过一个糖果!");
        }
    }

    /**
     * 退币
     */
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("硬币已退回!");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("你还未投币!");
        } else if (state == SOLD_OUT) {
            System.out.println("未投币,不能退款!");
        } else if (state == SOLD) {
            System.out.println("sorry,糖果正在出,不可退款!");
        }
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("投一次币只能转动一次!");
        } else if (state == NO_QUARTER) {
            System.out.println("你转动了曲柄,但是你还未投币!");
        } else if (state == HAS_QUARTER) {
            System.out.println("你正在转动曲柄......");
            state = SOLD;
            dispense();
        } else if (state == SOLD_OUT) {
            System.out.println("你转动了曲柄,但是没有糖果喽!");
        }
    }

    /**
     * 发放糖果
     */
    private void dispense() {
        if (state == SOLD) {
            System.out.println("正在出糖果......");
            count--;
            if (count == 0) {
                System.out.println("哦,糖果已售罄,没糖果喽!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("请先投币!");
        } else if (state == SOLD_OUT) {
            System.out.println("无糖果可发放!");
        } else if (state == HAS_QUARTER) {
            System.out.println("无糖果可发放!");
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}


