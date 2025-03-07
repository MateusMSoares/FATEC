package com.fatec.strategy;

public class IPI implements Imposto{
    private final String NOME = "IPI";
    private Double aliquota;


    @Override
    public Double calcular(Double valor){
        return valor * aliquota;
    }

    public String getNOME() {
        return NOME;
    }   

    public Double getAliquota() {
        return aliquota;
    }


    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }
    
}
