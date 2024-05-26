package Exercicio3;

public class Calculo {

    final Double tempo = 24.0;
    final Double totalDeJuros = 0.35;

    double salario;
    double emprestar;

    public Calculo(double salario, double emprestar) {
        this.salario = salario;
        this.emprestar = emprestar;
    }

    public double calcularTotalASerPago(){
        double taxaJuros = (this.emprestar * this.totalDeJuros);
        return (this.emprestar + taxaJuros);

    }

    public double calcularParcelas(double totalPagar){

        return (totalPagar /this.tempo);
    }

}