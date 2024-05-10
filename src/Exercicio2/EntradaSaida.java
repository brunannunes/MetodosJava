package Exercicio2;

import java.util.Scanner;

public class EntradaSaida {

    public void SalarioBruto(double salario){
        Scanner ler = new Scanner(System.in);
        Validacao validacao = new Validacao();

        System.out.println("Insira o seu salario");
        salario = ler.nextDouble();

        while (!validacao.validar(salario)){
            System.out.println("Por favor insira um salario valido");
        }

    }
}
