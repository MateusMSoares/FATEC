import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int maximoAlunos;
    private List<Aluno> alunos;
    private int numeroAtualDeAlunos;
    private List<Double> pesoNota;
    private final int maximoprovas = 4;
    
    public Turma() {
        this.alunos = new ArrayList<>();
        this.numeroAtualDeAlunos = 0;
    }

    public Turma(int maximoAlunos, List<Double> pesoNota) {
        this.maximoAlunos = maximoAlunos;
        this.alunos = new ArrayList<>();
        this.numeroAtualDeAlunos = 0;
        this.pesoNota = pesoNota;
    }


    public void alterarPesoNota(int prova, double peso){
        this.pesoNota.add(prova, peso);
    }

    public boolean adicionarAluno(Aluno aluno) {
        if (numeroAtualDeAlunos < maximoAlunos && !validarMatricula(aluno.getMatricula())) {
            alunos.add(aluno);
            return true;
        }
        return false;
    }

    public boolean alterarDadosAluno(int matricula, String novoNome, List<Double> notas) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            aluno.setNome(novoNome);
            aluno.setNotas(notas);
            return true;
        }
        return false;
    }

    public boolean alterarNotaAluno(int matricula, int prova, double novaNota ) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            aluno.setNotasEspecifica(prova, novaNota);
            return true;
        }
        return false;
    }

    public Aluno buscarAlunoPorNome(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno != null && aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public Aluno buscarAlunoPorMatricula(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno != null && aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    public boolean excluirAlunoPorNome(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome() == nome) {
                alunos.remove(aluno);
                return true;
            }
        }
        return false;
    }

    public void imprimirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }
    }

    public Double calcularMediaAluno(int matricula){
        Aluno alunoEscolhido = buscarAlunoPorMatricula(matricula);
        if (alunoEscolhido == null) {
            return -1.0;
        }
        double media = 0;
        double somaPeso = 0;
        List<Double> notasAluno = alunoEscolhido.getNotas();
        for(int i = 0; i < maximoprovas; i ++){
            media += notasAluno.get(i)* pesoNota.get(i);
            somaPeso += pesoNota.get(i);
        }

        return media / somaPeso ;
    }

    private boolean validarMatricula(int matricula) {
        return buscarAlunoPorMatricula(matricula) != null;
    }


}
