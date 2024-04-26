package br.edu.up.modelos;

public class Triangulo19 {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo19(int lado1Param, int lado2Param, int lado3Param) {
        lado1 = lado1Param;
        lado2 = lado2Param;
        lado3 = lado3Param;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1Param) {
        lado1 = lado1Param;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2Param) {
        lado2 = lado2Param;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3Param) {
        lado3 = lado3Param;
    }

    public boolean formaTriangulo() {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public String tipoTriangulo() {
        if (formaTriangulo()) {
            if (lado1 == lado2 && lado2 == lado3) {
                return "equilátero";
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                return "isósceles";
            } else {
                return "escaleno";
            }
        } else {
            return "não é um triângulo";
        }
    }
}
