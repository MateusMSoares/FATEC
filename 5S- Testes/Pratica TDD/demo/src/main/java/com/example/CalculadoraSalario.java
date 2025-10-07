package com.example;

public class CalculadoraSalario {
    
    public double calcularSalarioLiquido(Funcionario funcionario) {
        double salarioBase = funcionario.getSalarioBase();
        Cargo cargo = funcionario.getCargo();
        
        double percentualDesconto = calcularPercentualDesconto(cargo, salarioBase);
        double desconto = salarioBase * (percentualDesconto / 100);
        
        return salarioBase - desconto;
    }
    
    private double calcularPercentualDesconto(Cargo cargo, double salarioBase) {
        switch (cargo) {
            case DESENVOLVEDOR:
                return salarioBase >= 3000.00 ? 20.0 : 10.0;
                
            case DBA:
                return salarioBase >= 2000.00 ? 25.0 : 15.0;
                
            case TESTADOR:
                return salarioBase >= 2000.00 ? 25.0 : 15.0;
                
            case GERENTE:
                return salarioBase >= 5000.00 ? 30.0 : 20.0;
                
            default:
                throw new IllegalArgumentException("Cargo não reconhecido: " + cargo);
        }
    }
}