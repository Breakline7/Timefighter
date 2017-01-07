import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by David Biggs on 1/5/2017.
 */
public class MainApp {
    private List<Action> options = new ArrayList<>();

    private void init() {
        options.add(new VideoAction("video.net"));
    }
    public Action getAction() {
        int index = ThreadLocalRandom.current().nextInt(options.size());
        return options.get(index);
    }
    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.init();
        Action action = app.getAction();
        System.out.println("Suggestion: " + action.label());
    }
}