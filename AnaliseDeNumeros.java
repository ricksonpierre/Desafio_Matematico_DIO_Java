package DesafioMatematicoDio;

import java.io.IOException;
import java.util.Scanner;
//Você deve fazer a leitura de 5 valores inteiros.
// Em seguida mostre quantos valores informados são pares,
// quantos valores informados são ímpares,
// quantos valores informados são positivos e quantos valores informados são negativos.
public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
// Declaração das variáveis
        int valor;
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int i;
// Loop de repetição para passar o valor 5 vezes e fazer as análises
        for (i = 0;i<=4; i++) {
            valor = leitor.nextInt();
            if (valor%2 == 0){
                pares++;
            } else {
                impares++;
            }
            if (valor > 0){
                positivos++;
            } else if (valor < 0){
                negativos++;
            }
        }
// Impressão dos resultados no console
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}


