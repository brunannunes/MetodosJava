package Exercicio1;

import java.util.Scanner;

public class EntradaSaida {
    double nota1, nota2, peso1, peso2;


    public void recebeNota(double nota1, double nota2){
        Scanner leia = new Scanner(System.in);

        Validacao validacao = new Validacao();
        while (!Validacao.validar(nota1,nota2)){
            System.out.println("por favor insira as notas novamente:");
            nota1 = leia.nextDouble();
            System.out.println("por favor insira as notas novamente:");
            nota2 = leia.nextDouble();
        }



    }

    public void recebePeso(double peso1, double peso2){
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o peso da primeria nota:");
        peso1 = leia.nextDouble();
        System.out.println("informe o peso da segunda nota:");
        peso2 = leia.nextDouble();



    }


    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getPeso1() {
        return peso1;
    }

    public double getPeso2() {
        return peso2;
    }
}

