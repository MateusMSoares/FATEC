package com.example;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Funcionario {
    private String nome;
    private String email;
    private double salarioBase;
    private Cargo cargo;
}