package telecontroller;

/**
 * 调用者
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/12
 */
public class Invoker {
    private Command command;

    /**
     * 设置命令
     *
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void executeCommand() {
        command.execute();
    }
}
