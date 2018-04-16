package steal;

/**
 * Created by bob on 2017/9/24.
 *
 * @author bob   <bobyang_coder@163.com>
 * @version v1.0
 * @since 2017/9/24
 */
public class App {

    public static void main(String[] args) {
        Thief thief = new Thief(new TearStealMethod());
        thief.steal();
        thief.changeStealMethod(new ForceStealMethod());
        thief.steal();
    }
}
