public class Zap implements Observer {
    
    private String name;

    public Zap(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " nova mensagem:  " + message);
    }
    
}
