import java.util.ArrayList;
import java.util.List;

public class Publicador {

    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o) {
        observers.add(o);
    }

    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void publish(String message) {
        System.out.println("Publicando: " + message);
        notifyObservers(message);
    }

}
