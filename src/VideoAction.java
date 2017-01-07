/**
 * Created by David Biggs on 1/7/2017.
 */
public class VideoAction implements Action{
    private final String url;

    public VideoAction(String url) {
        this.url = url;
    }
    @Override
    public void doAction() {
        System.out.println("Watch this " + url);
    }

    @Override
    public String label() {
        return "Watch this video!";
    }
}
