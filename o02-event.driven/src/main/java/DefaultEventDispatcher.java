import java.util.ArrayList;
import java.util.List;

/**
 * TODO 又忘写注释啦!!!
 *
 * @author haibo.yang
 * @since 16 四月 2018
 */
public class DefaultEventDispatcher implements EventDispatcher {

    private List<EventHandler> handlers = new ArrayList<EventHandler>();


    public void register(EventHandler handler) {
        handlers.add(handler);
    }

    public void remove(EventHandler handler) {

    }

    public void handle() {

    }
}
