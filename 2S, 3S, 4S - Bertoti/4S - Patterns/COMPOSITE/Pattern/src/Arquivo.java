public class Arquivo implements Componente {
    private String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void display(String identacao) {
        System.out.println(identacao + " - Arquivo: " + nomeArquivo);
    }

}
