import java.util.ArrayList;
import java.util.List;

public class BadPublicador {

    private List<ObserverBad> observers = new ArrayList<>();

    public void subscribe(ObserverBad o) {
        observers.add(o);
    }

    public void unsubscribe(ObserverBad o) {
        observers.remove(o);
    }

    public void notifyObservers(String message) {
        for (ObserverBad o : observers) {
            o.update(message);
        }
    }

    public void publish(String message) {
        System.out.println("Publicando: " + message);
        notifyObservers(message);
    }

}
