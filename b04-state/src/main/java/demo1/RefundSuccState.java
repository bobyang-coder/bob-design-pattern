package demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 退款成功的处理逻辑
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/1
 */
public class RefundSuccState implements State {

    private static final Logger LOGGER = LoggerFactory.getLogger(RefundSuccState.class);

    /**
     * 订单支付成功后具体逻辑：
     * 1.更新数据库
     * 2.退款走账
     * 3.异步通知商户(可通过mq消息异步化发送，解耦、提供系统响应速度)
     *
     * @param order
     */
    @Override
    public void changeState(Order order) {
        LOGGER.info("[[orderNo:{}]-[退款成功]-[更新数据库]", order.getOrderNo());
        LOGGER.info("[[orderNo:{}]-[退款成功]-[退款走账]", order.getOrderNo());
        LOGGER.info("[[orderNo:{}]-[退款成功]-[异步通知商户(可通过mq消息异步化发送，解耦、提供系统响应速度)]", order.getOrderNo());
    }
}
