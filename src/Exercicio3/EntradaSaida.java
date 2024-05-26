package Exercicio3;


import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaSaida {
    double salario;
    double emprestar;

    public EntradaSaida() {
        this.salario =  salarioCliente();
        this.emprestar= emprestimoCliente();
    }

    Scanner ler = new Scanner(System.in);
    Validacao validacao = new Validacao();


    public double salarioCliente(){
        double salario = 0;

        while(true) {
            try {
                System.out.println("insira o valor do seu salrio");
                salario = ler.nextDouble();

                if(salario < 0 ){
                    System.out.println("por favor insira um numero maior ou igual a 0");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("por favor digite apenas numeros");
            }
            ler.nextLine();
        }

        return salario;

    }

    double getSalario(){
        return this.salario;
    }

    public double emprestimoCliente() {

        double emprestar = 0;

        while (true) {
            try {
                System.out.print("insira o valor que ira empresta");
                emprestar = ler.nextDouble();
                if (emprestar < 0 || !validacao.validarEmprestimo(emprestar)) {
                    System.out.println("O valor precisa ser entre 0 e 200.000");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("insira apenas numeros por favor");
            }
            ler.nextLine();
        }
        return emprestar;
    }

    double getEmprestar(){
        return this.emprestar;
    }
}