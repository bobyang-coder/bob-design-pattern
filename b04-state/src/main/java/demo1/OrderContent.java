package demo1;

/**
 * 执行环境类
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/1
 */
public class OrderContent {

    public void execute(Order order) {
        if (Order.StatusEnum.PAY_SUCC.getCode().equals(order.getStatus())) {
            new PaySuccState().changeState(order);
        } else if (Order.StatusEnum.REFUND_SUCC.getCode().equals(order.getStatus())) {
            new RefundSuccState().changeState(order);
        } else {
            new CommonState().changeState(order);
        }
    }

}
