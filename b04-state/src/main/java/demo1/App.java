package demo1;

/**
 * Created by bob on 2017/11/1.
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/1
 */
public class App {

    public static void main(String[] args) {
        Order order = new Order();
        order.setDesc("小白");
        order.setOrderNo("110");
        OrderContent content = new OrderContent();
        order.setStatus(Order.StatusEnum.WAIT_PAY.getCode());
        content.execute(order);

        order.setStatus(Order.StatusEnum.PAY_SUCC.getCode());
        content.execute(order);

        order.setStatus(Order.StatusEnum.REFUND_SUCC.getCode());
        content.execute(order);

    }
}
