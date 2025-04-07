public class App {
    public static void main(String[] args) throws Exception {
        BadPublicador publicador = new BadPublicador();
        BadZap zap1 = new BadZap("Zap 1", publicador);
        BadZap zap2 = new BadZap("Zap 2", publicador);

        publicador.subscribe(zap1);
        publicador.subscribe(zap2);
        
        publicador.publish("Mensagem 1");
        publicador.publish("Mensagem 2");
        publicador.unsubscribe(zap1);
        publicador.unsubscribe(zap2);
    }
}
