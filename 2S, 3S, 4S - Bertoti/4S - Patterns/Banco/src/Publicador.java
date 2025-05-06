import java.util.ArrayList;
import java.util.List;

public class Publicador {
    private List<OrderObserver> observers = new ArrayList<>();

    public List<OrderObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<OrderObserver> observers) {
        this.observers = observers;
    }

    public void sub(OrderObserver ob) {
        observers.add(ob);
    }

    public void unsub(OrderObserver ob){
        observers.remove(ob);
    }

    public void notificar(Produto p){
        for(OrderObserver ob : observers){
            ob.atualizar("Produto: " + p + ", disponivel!");
        }
    }

}
