package patterns.behavioral.observer;

public class NewsChannel implements Observer {

    @Override
    public void update(String message) {
        System.out.println("News Channel received news: " + message);
    }
}