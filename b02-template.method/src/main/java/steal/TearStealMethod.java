package steal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bob on 2017/9/24.
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/24
 */
public class TearStealMethod extends StealMethod {

    private static final Logger LOGGER = LoggerFactory.getLogger(TearStealMethod.class);

    protected String selectTarget() {
        return "老年人or学生";
    }

    protected void confuseTarget(String target) {

        LOGGER.info("用眼泪博取同情!");
    }

    protected void stealTarget(String target) {

        LOGGER.info("让目标自愿贡献money!");
    }
}
