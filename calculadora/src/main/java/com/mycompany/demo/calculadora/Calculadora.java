package com.mycompany.demo.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        double valorDigitado = 0, resultado = 0;
        Scanner input = new Scanner(System.in);

        for (String i = ""; !"=".equals(i);) {
            System.out.println("Digite um valor: ");
            valorDigitado = input.nextDouble();

            
            if ("".equals(i)) {
                resultado = valorDigitado;
            } else if ("+".equals(i)) {
                resultado = resultado + valorDigitado;
            } else if ("-".equals(i)) {
                resultado = resultado - valorDigitado;
            } else if ("*".equals(i)) {
                resultado = resultado * valorDigitado;
            } else if ("/".equals(i)) {
                resultado = resultado / valorDigitado;
            }
            System.out.println("Digite a operação desejada +, -, * ou /, para encerrar digite =. ");
            i = input.next();
        }
        System.out.println("Resultado: " + resultado);
    }
}
