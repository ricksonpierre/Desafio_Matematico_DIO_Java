package DesafioMatematicoDio;

import java.io.IOException;
import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
// "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

public class CalculoDeMultiplos {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int valor1 = leitor.nextInt();
        int valor2 = leitor.nextInt();
        // Quando os dois são positivos
        if (valor1 > 0 && valor2 > 0) {
            if (valor2 % valor1 == 0 || valor1 % valor2 == 0) {
                System.out.println("Sao Multiplos");
            } else if (valor2 % valor1 != 0 || valor1 % valor2 != 0) {
                System.out.println("Nao sao Multiplos");
            }
            // Quando os dois não são positivos
        } else if (valor1 < 0 && valor2 < 0) {
            if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
                System.out.println("Sao Multiplos");
            } else if (valor2 % valor1 != 0 || valor1 % valor2 != 0) {
                System.out.println("Nao sao Multiplos");
            }
            // Quando os sinais são invertidos
        } else if (valor1 < 0 && valor2 > 0 || valor1 > 0 && valor2 < 0) {
            if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
                System.out.println("Sao Multiplos");
            } else if (valor2 % valor1 != 0 || valor1 % valor2 != 0) {
                System.out.println("Nao sao Multiplos");
            }
        }
    }
}