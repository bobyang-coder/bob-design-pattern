package demo3.primordial;

/**
 * 测试糖果机
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/5
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gm = new GumballMachine(5);
        System.out.println(gm);//打印机器状态

        gm.insertQuarter();//投币
        gm.turnCrank();//转动曲柄

        System.out.println(gm);//打印机器状态

        gm.insertQuarter();//投币
        gm.ejectQuarter();//退币
        gm.turnCrank();//转动曲柄

        System.out.println(gm);//打印机器状态

        gm.insertQuarter();//投币
        gm.turnCrank();//转动曲柄
        gm.insertQuarter();//投币
        gm.turnCrank();//转动曲柄
        gm.ejectQuarter();//退币

        System.out.println(gm);//打印机器状态

        gm.insertQuarter();//投币
        gm.insertQuarter();//投币
        gm.turnCrank();//转动曲柄
        gm.insertQuarter();//投币
        gm.turnCrank();//转动曲柄
        gm.insertQuarter();//投币
        gm.turnCrank();//转动曲柄

        System.out.println(gm);//打印机器状态
    }

}
