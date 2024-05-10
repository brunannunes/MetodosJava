package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double nota1, nota2,peso1 = 0, peso2 = 0;

        Scanner leia = new Scanner(System.in);

        EntradaSaida entradaSaida = new EntradaSaida();

        System.out.println("Informe o valor da primeria nota:");
        nota1 = leia.nextDouble();

        System.out.println("Informe o valor da segunda nota:");
        nota2 = leia.nextDouble();

        entradaSaida.recebeNota(nota1,nota2);
        entradaSaida.recebePeso(peso1,peso2);

        System.out.println("A sua nota foi aprovada!");

        Resultado resultado = new Resultado();
        resultado.resultadoAritmetica();




    }
}