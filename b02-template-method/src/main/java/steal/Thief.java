package steal;

/**
 * 盗贼
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/24
 */
public class Thief {

    private StealMethod stealMethod;

    public Thief(StealMethod stealMethod) {
        this.stealMethod = stealMethod;
    }

    public void steal() {
        stealMethod.steal();
    }

    /**
     * 改变偷盗技能
     */
    public void changeStealMethod(StealMethod stealMethod) {
        this.stealMethod = stealMethod;
    }


}
