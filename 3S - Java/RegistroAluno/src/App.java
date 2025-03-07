import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
 List<Double> pesos = Arrays.asList(2.0, 3.0, 4.0, 1.0);
        Turma turma = new Turma(2, pesos);

        List<Double> notasAluno1 = Arrays.asList(8.0, 7.5, 9.0, 6.5);
        Aluno aluno1 = new Aluno("Mateus", 12345, notasAluno1);

        List<Double> notasAluno2 = Arrays.asList(9.0, 8.0, 8.5, 7.0);
        Aluno aluno2 = new Aluno("Lucas", 67890, notasAluno2);

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        System.out.println("Lista de alunos após adição:");
        turma.imprimirAlunos();
        System.out.println();

        System.out.println("Alterando dados do aluno com ID 12345...");
        turma.alterarDadosAluno(12345, "Mat", Arrays.asList(8.5, 7.0, 9.0, 6.0));

        System.out.println("Lista de alunos após alteração:");
        turma.imprimirAlunos();
        System.out.println();

        System.out.println("Excluindo aluno com nome Lucas...");
        turma.excluirAlunoPorNome("Lucas");

        System.out.println("Lista de alunos após exclusão:");
        turma.imprimirAlunos();

        double media = turma.calcularMediaAluno(aluno1.getMatricula());
        System.out.println("Aluno: " + aluno1.getNome() + " media: " + media);
    }
}
