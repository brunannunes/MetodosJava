package Exercicio2;

import java.util.Scanner;

public class EntradaSaida {

    Scanner ler = new Scanner(System.in);
    Validacao validacao = new Validacao();

    public boolean recebeSalario(){
        while(true){
            System.out.println("Insira o salario bruto: ");
            double salario = Double.parseDouble(ler.nextLine());

            if (!validacao.validar(salario)) {
                System.out.println("o salario precisa ser entre 500 e 30.000");
                continue;
            }

            System.out.println("Informe quantas horas extras voce fez");
            int horas = Integer.parseInt(ler.nextLine());

            Calculo calculo = new Calculo(salario);

            calculo.calcularINSS();
            calculo.calcularImpostoRenda();
            calculo.calcularPlanoSaude();
            calculo.acrescimoHoras(horas, salario);
            calculo.calcularSalarioLiquido();

            return false;

        }

    }

}