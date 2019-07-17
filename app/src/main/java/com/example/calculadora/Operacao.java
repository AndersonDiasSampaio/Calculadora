package com.example.calculadora;

public class Operacao {
     private float a=0, b=0, soma, subtracao, divisao, multiplicacao;

    public Operacao(float c, float g) {
        this.a = c;
        this.b = g;
    }

    public float getA() {
        return a;
    }


    public float getB() {
        return b;
    }


    public float getSoma() {
        return soma;
    }

    public void setSoma() {
        this.soma = this.a+this.b;
    }

    public float getSubtracao() {
        return subtracao;
    }

    public void setSubtracao() {
        this.subtracao = this.a-this.b;
    }

    public float getDivisao() {
        return divisao;
    }

    public void setDivisao() {
        this.divisao = this.a/this.b;
    }

    public float getMultiplicacao() {
        return multiplicacao;
    }

    public void setMultiplicacao() {
        this.multiplicacao = this.a*this.b;
    }
}
