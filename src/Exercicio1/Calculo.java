package Exercicio1;

public class Calculo {


    public boolean calcularPonderada(double nota1, double nota2, double peso1, double peso2){
            double mediaPonderada;

            mediaPonderada = (nota1 * peso1 + nota2 * peso2) / nota1 + nota2;
        if (mediaPonderada < 7){
            return false;
        }
        else {
            return true;
        }

    }

    public boolean calcularAritmetica(double nota1, double nota2){
        double mediaAritmetica;

        mediaAritmetica = nota1 + nota2 / 2;
        if (mediaAritmetica < 7){
            return false;
        }
        else {
            return true;
        }

    }

}
