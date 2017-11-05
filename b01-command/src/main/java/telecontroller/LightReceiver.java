package telecontroller;

/**
 * 真正的命令执行者-灯
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/12
 */
public class LightReceiver {

    void on() {
        System.out.println("开灯");
    }

    void off() {
        System.out.println("关灯");
    }
}
