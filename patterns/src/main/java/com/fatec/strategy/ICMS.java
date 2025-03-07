package com.fatec.strategy;

public class ICMS implements Imposto{
    private final String NOME = "ICMS";
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
