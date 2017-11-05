package demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 普通状态
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/1
 */
public class CommonState implements State {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonState.class);


    /**
     * 普通状态改变仅更新订单状态而已
     *
     * @param order
     */
    @Override
    public void changeState(Order order) {
        LOGGER.info("[[orderNo:{}]-[{}]-[更新数据库]", order.getOrderNo(), Order.StatusEnum.getName(order.getStatus()));
    }
}
