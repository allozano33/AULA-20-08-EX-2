package com.company;

import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner keyPad = new Scanner(System.in);
        double salario, salario1;
        int percentual;
        System.out.println("Atualização Salarial");
        System.out.println("Salário Atual  (Para Finalizar tecle 0): ");
        salario = keyPad.nextInt();
        while (salario > 0d) {
            if (salario <= 20000d) {
                percentual = 20;
                salario1 = 1.2 * salario;
            } else if (salario > 20000d && salario <= 45000d) {
                percentual = 10;
                salario1 = 1.1 * salario;
            } else {
                percentual = 5;
                salario1 = 1.05 * salario;
            }
            System.out.println("Aumento de " + percentual + "% sendo o novo salário de: RS " + salario1);
            System.out.println("Informe o salário do funcionário (Caso deseje encerrar a consulta, digite 0): ");
            salario = keyPad.nextInt();



        }
    }
}
