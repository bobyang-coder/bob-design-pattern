package steal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 偷盗方法
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/24
 */
public abstract class StealMethod {
    private static final Logger LOGGER = LoggerFactory.getLogger(StealMethod.class);

    //选取目标

    protected abstract String selectTarget();

    //迷惑目标
    protected abstract void confuseTarget(String target);


    /**
     * 是否跳过迷惑步骤
     * (钩子方法：可以让子类控制算法部分流程)
     *
     * @return
     */
    protected boolean skipConfuse() {
        return false;
    }

    //偷取目标
    protected abstract void stealTarget(String target);

    //偷盗
    public void steal() {
        String target = selectTarget();
        LOGGER.info("[选取的目标是:{}]", target);
        if (!skipConfuse()) {
            confuseTarget(target);
        } else {
            LOGGER.info("[跳过环节]-[迷惑目标]");
        }
        stealTarget(target);
    }

}
