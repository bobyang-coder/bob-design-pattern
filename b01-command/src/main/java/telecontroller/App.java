package telecontroller;

/**
 * 场景：遥控器
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/12
 */
public class App {

    public static void main(String[] args) {
        LightReceiver receiver = new LightReceiver();
        Command command = new LightOffCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();

    }
}
