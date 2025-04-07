public class App {
    public static void main(String[] args) throws Exception {
        Publicador publicador = new Publicador();
        Zap zap1 = new Zap("Zap 1");
        Zap zap2 = new Zap("Zap 2");
        publicador.subscribe(zap1);
        publicador.subscribe(zap2);
        publicador.publish("Mensagem 1");
        publicador.publish("Mensagem 2");
        publicador.unsubscribe(zap1);
        publicador.unsubscribe(zap2);
    }
}
