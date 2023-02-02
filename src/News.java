import java.util.ArrayList;
import java.util.List;

public class News implements Observable {
    private final List<Observer> observers = new ArrayList<>();
    private String title;
    private String body;
    private String image;

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this, null);
        }
    }

    public void setNews(String title, String body, String image) {
        this.title = title;
        this.body = body;
        this.image = image;
        notifyObservers();
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getImage() {
        return image;
    }
}
