package org.example;

public class Main {
    public static void main(String[] args){
        System.out.println(calcularArea(10,20));
    }

    private static double calcularArea(double ancho, double alto){
        Operacion operacion = (width, height) -> width * height;
        return operacion.calcular(ancho,alto);
    }

}