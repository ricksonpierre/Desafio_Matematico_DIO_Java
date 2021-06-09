package DesafioMatematicoDio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FolhaDePagamento {
    public static void main(String[] args) throws IOException {
        // Essa linha realiza a leitura no meu console, através da biblioteca BufferedReader
        // InputStreamReader é o adaptador do que eu digito no console,
        // recebe bytes e converte em caracteres
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer é utilizado para quebrar a  em tokens, quando houver um espaço entre caracteres
        // st será minha variável auxiliar de leitura
        StringTokenizer st = new StringTokenizer(leitor.readLine());
        // Leitura do primeiro valor solicitado (número do funcionário)
        int numeroDoFuncionario = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(leitor.readLine());
        // Leitura do segundo valor solicitado (horas trabalhadas por esse funcionário)
        int horasTrabalhadas = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(leitor.readLine());
        // Leitura do terceiro valor solicitado (Valor da hora desse funcionário)
        double valorDaHoraTrabalhada = Double.parseDouble(st.nextToken());
        // Cálculo do salário = horas trabalhadas x valor da hora trabalhada
        double salario = horasTrabalhadas * valorDaHoraTrabalhada;
        // Impressão dos resultados no console
        System.out.println("NUMBER = " + numeroDoFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);
    }
}
