import java.util.List;

public class Aluno {
    private String nome;
    private int matricula;
    private List<Double> notas;
    private final int maximoprovas = 4;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String nome, int matricula, List<Double> notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    } 

    public void setNotasEspecifica(int prova, Double nota) {
        if (prova > maximoprovas) {
            System.out.println("Numero maximo de provas");
            return;
        }
        this.notas.set(prova, nota);
    } 

}
