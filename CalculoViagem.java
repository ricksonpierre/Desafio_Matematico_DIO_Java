package DesafioMatematicoDio;

import java.util.Scanner;

public class CalculoViagem {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tempo em horas gasto na viagem e em seguida a velocidade média: ");
        int tempo, velocidade;
        tempo = Integer.parseInt(leitor.next());
        velocidade = Integer.parseInt(leitor.next());
        System.out.printf("%.3f\n", (tempo*velocidade)/12.0);
    }
}
// Bases para entendimento dos cálculos em função das unidades:
// tempo -> h
// velocidade -> km/h
// tempo x velocidade -> km (distancia percorrida) = x (variavel de controle)
// km / (12 L) x km/L -> x/12