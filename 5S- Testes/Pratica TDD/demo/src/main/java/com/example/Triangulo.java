package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Triangulo {
    private Double ladoA;
    private Double ladoB;
    private Double ladoC;


    public boolean isTriangulo(){
        // Verifica se os lados são válidos (não nulos, maiores que zero)
        if (ladoA == null || ladoB == null || ladoC == null || 
            ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            return false;
        }
        
        // Verifica a condição do triângulo: a soma de dois lados deve ser maior que o terceiro
        return (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);
    }

    public boolean isEscaleno(){
        // Só pode ser escaleno se for um triângulo válido
        if (!isTriangulo()) {
            return false;
        }
        
        // Triângulo escaleno: todos os lados diferentes
        return !ladoA.equals(ladoB) && !ladoB.equals(ladoC) && !ladoA.equals(ladoC);
    }

    public boolean isIsosceles(){
        // Só pode ser isósceles se for um triângulo válido
        if (!isTriangulo()) {
            return false;
        }
        
        // Triângulo isósceles: exatamente dois lados iguais
        return (ladoA.equals(ladoB) && !ladoA.equals(ladoC)) || 
               (ladoA.equals(ladoC) && !ladoA.equals(ladoB)) || 
               (ladoB.equals(ladoC) && !ladoB.equals(ladoA));
    }

    public boolean isEquilatero(){
        // Só pode ser equilátero se for um triângulo válido
        if (!isTriangulo()) {
            return false;
        }
        
        // Triângulo equilátero: todos os lados iguais
        return ladoA.equals(ladoB) && ladoB.equals(ladoC);
    }
}
