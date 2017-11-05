package telecontroller;

/**
 * 灯光打开
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/12
 */
public class LightOnCommand implements Command {

    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    public void execute() {
        lightReceiver.on();
    }
}
