package steal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 暴力偷盗
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/24
 */
public class ForceStealMethod extends StealMethod {
    private static final Logger LOGGER = LoggerFactory.getLogger(TearStealMethod.class);

    protected String selectTarget() {
        return "社会女青年";
    }

    protected void confuseTarget(String target) {
        //不许迷惑，因此无需实现
    }

    protected void stealTarget(String target) {
        LOGGER.info("抢过钱包，撒腿儿就跑.....");
    }

    @Override
    protected boolean skipConfuse() {
        return true;
    }
}
