package demo3.refactor1;

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
        System.out.println(gm);

        gm.insertQuarter();
        gm.turnCrank();

        System.out.println(gm);

        gm.insertQuarter();
        gm.turnCrank();
        gm.insertQuarter();
        gm.turnCrank();

        System.out.println(gm);
    }

}
