package demo1;

/**
 * 订单类
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/11/1
 */
public class Order {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 净额
     */
    private long net;

    /**
     * 手续费
     */
    private long fee;

    /**
     * 订单描述
     */
    private String desc;

    /**
     * 备注
     */
    private String remark;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getNet() {
        return net;
    }

    public void setNet(long net) {
        this.net = net;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo='" + orderNo + '\'' +
                ", status='" + status + '\'' +
                ", net='" + net + '\'' +
                ", fee='" + fee + '\'' +
                ", desc='" + desc + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    /**
     * inner class 状态枚举类
     */
    public enum StatusEnum {
        WAIT_PAY("1", "待支付"),
        PAY_SUCC("2", "支付成功"),
        APPLY_REFUND("3", "申请退款"),
        REFUND_SUCC("4", "退款成功"),
        ORDER_CLOSED("9", "订单关闭");

        /**
         * 状态码
         */
        private String code;

        /**
         * 状态名称
         */
        private String name;

        StatusEnum(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getName(String code) {
            for (StatusEnum statusEnum : StatusEnum.values()) {
                if (statusEnum.getCode().equals(code)) {
                    return statusEnum.getName();
                }
            }
            return null;
        }
    }
}
