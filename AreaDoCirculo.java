package DesafioMatematicoDio;

import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

     //   System.out.println("Digite o raio do cículo: ");

        double raio, area;

        raio = Double.parseDouble(leitor.next());

        area = 3.14159 * (Math.pow(raio,2));

        System.out.printf("A=%.4f\n", area);
    }
}
