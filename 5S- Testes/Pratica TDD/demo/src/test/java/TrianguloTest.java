
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.Triangulo;

// Exercício 1 - Triângulo - Especifique um conjunto de casos de teste para testar o programa a seguir:

// "O programa lê três valores inteiros que representam os lados de um triângulo. O programa informa se os lados formam um triângulo isósceles, escaleno ou equilátero."

// Condição: a soma de dois lados tem que ser maior que o terceiro lado.

// Defina o esqueleto de uma classe Java|TypeScript|Python que resolva o problema acima.
// Escreva os casos de teste para a linguagem de programação adotada, para as seguintes situações:
// Triângulo escaleno válido
// Triângulo isósceles válido
// Triângulo equilatero válido
// Pelo menos 3 casos de teste (CTs) para isósceles válido contendo a permutação dos mesmos valores
// Um valor zero
// Um valor negativo
// A soma de 2 lados é igual ao teceiro lado
// Para o item acima, um CT para cada permutação de valores
// CT em que a soma de 2 lados é menor que o terceiro lado
// Para o item acima, um CT para cada permutação de valores
// Um CT para os três valores iguais a zero

public class TrianguloTest {

    
    @Test
    public void testTrianguloEscalenoValido(){
        Triangulo t = new Triangulo(3.0, 4.0, 5.0);
        assertEquals(true, t.isTriangulo());
        assertEquals(true, t.isEscaleno());
        assertEquals(false, t.isIsosceles());
        assertEquals(false, t.isEquilatero());
    }

    @Test
    public void testTrianguloIsoscelesValido(){
        Triangulo t = new Triangulo(5.0, 5.0, 8.0);
        assertEquals(true, t.isTriangulo());
        assertEquals(false, t.isEscaleno());
        assertEquals(true, t.isIsosceles());
        assertEquals(false, t.isEquilatero());
    }
    
    @Test
    public void testTrianguloEquilateroValido(){
        Triangulo t = new Triangulo(5.0, 5.0, 5.0);
        assertEquals(true, t.isTriangulo());
        assertEquals(false, t.isEscaleno());
        assertEquals(false, t.isIsosceles());
        assertEquals(true, t.isEquilatero());
    }

    
    @Test
    public void testTrianguloIsoscelesPermutacao1(){
        Triangulo t = new Triangulo(5.0, 5.0, 8.0);
        assertEquals(true, t.isTriangulo());
        assertEquals(true, t.isIsosceles());
    }
    
    @Test
    public void testTrianguloIsoscelesPermutacao2(){
        Triangulo t = new Triangulo(5.0, 8.0, 5.0);
        assertEquals(true, t.isTriangulo());
        assertEquals(true, t.isIsosceles());
    }
    
    @Test
    public void testTrianguloIsoscelesPermutacao3(){
        Triangulo t = new Triangulo(8.0, 5.0, 5.0);
        assertEquals(true, t.isTriangulo());
        assertEquals(true, t.isIsosceles());
    }

    
    @Test
    public void testTrianguloComUmValorZero(){
        Triangulo t = new Triangulo(0.0, 5.0, 5.0);
        assertEquals(false, t.isTriangulo());
        assertEquals(false, t.isEscaleno());
        assertEquals(false, t.isIsosceles());
        assertEquals(false, t.isEquilatero());
    }
    
    @Test
    public void testTrianguloComUmValorNegativo(){
        Triangulo t = new Triangulo(-1.0, 5.0, 5.0);
        assertEquals(false, t.isTriangulo());
        assertEquals(false, t.isEscaleno());
        assertEquals(false, t.isIsosceles());
        assertEquals(false, t.isEquilatero());
    }
    
    @Test
    public void testTrianguloComTresValoresZero(){
        Triangulo t = new Triangulo(0.0, 0.0, 0.0);
        assertEquals(false, t.isTriangulo());
        assertEquals(false, t.isEscaleno());
        assertEquals(false, t.isIsosceles());
        assertEquals(false, t.isEquilatero());
    }

    @Test
    public void testSomaDoisLadosIgualTerceiroPermutacao1(){
        Triangulo t = new Triangulo(2.0, 3.0, 5.0);
        assertEquals(false, t.isTriangulo());
        assertEquals(false, t.isEscaleno());
        assertEquals(false, t.isIsosceles());
        assertEquals(false, t.isEquilatero());
    }
    
    @Test
    public void testSomaDoisLadosIgualTerceiroPermutacao2(){
        Triangulo t = new Triangulo(2.0, 7.0, 5.0);
        assertEquals(false, t.isTriangulo());
        assertEquals(false, t.isEscaleno());
        assertEquals(false, t.isIsosceles());
        assertEquals(false, t.isEquilatero());
    }
    
    @Test
    public void testSomaDoisLadosIgualTerceiroPermutacao3(){
        Triangulo t = new Triangulo(7.0, 3.0, 4.0);
        assertEquals(false, t.isTriangulo());
        assertEquals(false, t.isEscaleno());
        assertEquals(false, t.isIsosceles());
        assertEquals(false, t.isEquilatero());
    }

    @Test
    public void testSomaDoisLadosMenorTerceiroPermutacao1(){
        Triangulo t = new Triangulo(1.0, 2.0, 5.0);
        assertEquals(false, t.isTriangulo());
        assertEquals(false, t.isEscaleno());
        assertEquals(false, t.isIsosceles());
        assertEquals(false, t.isEquilatero());
    }
    
    @Test
    public void testSomaDoisLadosMenorTerceiroPermutacao2(){
        Triangulo t = new Triangulo(1.0, 6.0, 2.0);
        assertEquals(false, t.isTriangulo());
        assertEquals(false, t.isEscaleno());
        assertEquals(false, t.isIsosceles());
        assertEquals(false, t.isEquilatero());
    }
    
    @Test
    public void testSomaDoisLadosMenorTerceiroPermutacao3(){
        Triangulo t = new Triangulo(8.0, 2.0, 3.0);
        assertEquals(false, t.isTriangulo());
        assertEquals(false, t.isEscaleno());
        assertEquals(false, t.isIsosceles());
        assertEquals(false, t.isEquilatero());
    }
}