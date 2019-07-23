package com.example.calculadora;

public class Operaction {
    private float a=0, b=0, sum, subtraction, division, multiplication;

    public Operaction(float c, float g) {
        this.a = c;
        this.b = g;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getSum() {
        return sum;
    }

    public void setSum() {
        this.sum = this.a+this.b;
    }

    public float getSubtraction() {
        return subtraction;
    }

    public void setSubtraction() {
        this.subtraction = this.a-this.b;
    }

    public float getDivision() {
        return division;
    }

    public void setDivision(){

        this.division = this.a/this.b;
    }

    public float getmultiplication() {
        return multiplication;
    }

    public void setmultiplication() {
        this.multiplication = this.a*this.b;
    }
}
