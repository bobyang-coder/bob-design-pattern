package telecontroller;

/**
 * 灯光关闭
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/12
 */
public class LightOffCommand implements Command {

    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    public void execute() {
        lightReceiver.off();
    }
}
