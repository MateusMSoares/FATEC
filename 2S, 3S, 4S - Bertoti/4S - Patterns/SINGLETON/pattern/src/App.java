public class App {
    public static void main(String[] args) throws Exception {
        Banco banco1 = Banco.getInstancia();
        Banco banco2 = Banco.getInstancia();

        System.out.println("URL do banco: " + banco1.getUrl());

        // Verifica se são a mesma instância
        if (banco1 == banco2) {
            System.out.println("banco1 e banco2 são a mesma instância (Singleton confirmado)");
        } else {
            System.out.println("São instâncias diferentes");
        }
    }
}
