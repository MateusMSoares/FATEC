public class Banco {
    private static Banco instancia = new Banco();
    private final String URL = "http://localhost:8080/meuBanco/";



    public String getUrl() {
        return URL;
    } 


    public static Banco getInstancia() {
        return instancia;
    }   

}
