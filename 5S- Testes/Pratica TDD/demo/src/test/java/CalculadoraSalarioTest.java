import com.example.Cargo;
import com.example.Funcionario;
import com.example.CalculadoraSalario;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSalarioTest {

    private CalculadoraSalario calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new CalculadoraSalario();
    }

    // Testes para DESENVOLVEDOR
    @Test
    void testDesenvolvedorComSalarioMaiorOuIgual3000() {
        // Arrange
        Funcionario funcionario = new Funcionario("João", "joao@email.com", 5000.00, Cargo.DESENVOLVEDOR);
        
        // Act
        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);
        
        // Assert - Desconto de 20%
        assertEquals(4000.00, salarioLiquido, 0.01);
    }

    @Test
    void testDesenvolvedorComSalarioExatamente3000() {
        // Arrange
        Funcionario funcionario = new Funcionario("Maria", "maria@email.com", 3000.00, Cargo.DESENVOLVEDOR);
        
        // Act
        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);
        
        // Assert - Desconto de 20%
        assertEquals(2400.00, salarioLiquido, 0.01);
    }

    @Test
    void testDesenvolvedorComSalarioMenorQue3000() {
        // Arrange
        Funcionario funcionario = new Funcionario("Pedro", "pedro@email.com", 2500.00, Cargo.DESENVOLVEDOR);
        
        // Act
        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);
        
        // Assert - Desconto de 10%
        assertEquals(2250.00, salarioLiquido, 0.01);
    }

    // Testes para DBA
    @Test
    void testDBAComSalarioMaiorOuIgual2000() {
        // Arrange
        Funcionario funcionario = new Funcionario("Ana", "ana@email.com", 3000.00, Cargo.DBA);
        
        // Act
        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);
        
        // Assert - Desconto de 25%
        assertEquals(2250.00, salarioLiquido, 0.01);
    }

    @Test
    void testDBAComSalarioExatamente2000() {
        // Arrange
        Funcionario funcionario = new Funcionario("Carlos", "carlos@email.com", 2000.00, Cargo.DBA);
        
        // Act
        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);
        
        // Assert - Desconto de 25%
        assertEquals(1500.00, salarioLiquido, 0.01);
    }

    @Test
    void testDBAComSalarioMenorQue2000() {
        // Arrange
        Funcionario funcionario = new Funcionario("Lucia", "lucia@email.com", 1800.00, Cargo.DBA);
        
        // Act
        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);
        
        // Assert - Desconto de 15%
        assertEquals(1530.00, salarioLiquido, 0.01);
    }

    // Testes para TESTADOR
    @Test
    void testTestadorComSalarioMaiorOuIgual2000() {
        // Arrange
        Funcionario funcionario = new Funcionario("Roberto", "roberto@email.com", 2500.00, Cargo.TESTADOR);
        
        // Act
        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);
        
        // Assert - Desconto de 25%
        assertEquals(1875.00, salarioLiquido, 0.01);
    }

    @Test
    void testTestadorComSalarioExatamente2000() {
        // Arrange
        Funcionario funcionario = new Funcionario("Fernanda", "fernanda@email.com", 2000.00, Cargo.TESTADOR);
        
        // Act
        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);
        
        // Assert - Desconto de 25%
        assertEquals(1500.00, salarioLiquido, 0.01);
    }

    @Test
    void testTestadorComSalarioMenorQue2000() {
        // Arrange
        Funcionario funcionario = new Funcionario("Bruno", "bruno@email.com", 1900.00, Cargo.TESTADOR);
        
        // Act
        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);
        
        // Assert - Desconto de 15%
        assertEquals(1615.00, salarioLiquido, 0.01);
    }

    // Testes para GERENTE
    @Test
    void testGerenteComSalarioMaiorOuIgual5000() {
        // Arrange
        Funcionario funcionario = new Funcionario("Paulo", "paulo@email.com", 8000.00, Cargo.GERENTE);
        
        // Act
        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);
        
        // Assert - Desconto de 30%
        assertEquals(5600.00, salarioLiquido, 0.01);
    }

    @Test
    void testGerenteComSalarioExatamente5000() {
        // Arrange
        Funcionario funcionario = new Funcionario("Sandra", "sandra@email.com", 5000.00, Cargo.GERENTE);
        
        // Act
        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);
        
        // Assert - Desconto de 30%
        assertEquals(3500.00, salarioLiquido, 0.01);
    }

    @Test
    void testGerenteComSalarioMenorQue5000() {
        // Arrange
        Funcionario funcionario = new Funcionario("Ricardo", "ricardo@email.com", 4500.00, Cargo.GERENTE);
        
        // Act
        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);
        
        // Assert - Desconto de 20%
        assertEquals(3600.00, salarioLiquido, 0.01);
    }
}