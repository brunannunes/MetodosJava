package Exercicio3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double emprestar = 0, valorParcelas = 0;

        EntradaSaida entradaSaida = new EntradaSaida();
        Calculo calculo = new Calculo(entradaSaida.getSalario(), entradaSaida.getEmprestar());

        valorParcelas = calculo.calcularParcelas(calculo.calcularTotalASerPago());
        Validacao validacao = new Validacao();


        if (validacao.validarEmprestimo(entradaSaida.getSalario(), valorParcelas)){
            System.out.println("nao foi possivel fazer o emprestimo pois o valor ultrapassa 15% do seu salario");
        }else{
            System.out.printf("emprestimo aprovado\n" +
                    "Valor das parcelas: R$%.2f\n" +
                    "Valor Total: R$%.2f", valorParcelas, calculo.calcularTotalASerPago());
        }

    }
}