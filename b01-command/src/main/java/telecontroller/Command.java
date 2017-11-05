package telecontroller;

/**
 * 命令
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/12
 */
public interface Command {

    /**
     * 执行
     */
    void execute();

//    /**
//     * 撤销
//     */
//    void undo();
//
//    /**
//     * 重做
//     */
//    void redo();
}
