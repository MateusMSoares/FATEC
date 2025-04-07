public class BadZap implements ObserverBad {
    
    private String name;
    BadPublicador publicador;

    public BadZap(String name, BadPublicador publicador) {
        this.name = name;
        this.publicador = publicador;
        publicador.subscribe(this);
    }

    @Override
    public void update(String message) {
        System.out.println(name + " nova mensagem:  " + message);
        publicador.publish("Looping");
    }
    
}
