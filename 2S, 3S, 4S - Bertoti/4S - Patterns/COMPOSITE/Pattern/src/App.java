public class App {
    public static void main(String[] args) throws Exception {
        Componente arquivo1 = new Arquivo("Arquivo1.txt");
        Componente arquivo2 = new Arquivo("Arquivo2.txt");
        Componente arquivo3 = new Arquivo("Arquivo3.txt");

        Diretorio diretorio1 = new Diretorio("Diretorio1");
        diretorio1.adicionarComponente(arquivo1);
        diretorio1.adicionarComponente(arquivo2);

        Diretorio diretorio2 = new Diretorio("Diretorio2");
        diretorio2.adicionarComponente(arquivo3);
        diretorio2.adicionarComponente(diretorio1);

        diretorio1.display(" ");
        diretorio2.display(" ");
    }
}
