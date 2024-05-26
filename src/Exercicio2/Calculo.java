package Exercicio2;

public class Calculo {

    double salario;
    double descontoINSS = 0, descontoImposto = 0, descontoSaude = 0, acrescimo = 0;

    public Calculo(double salario) {
        this.salario = salario;
    }

    public void calcularINSS(){
        descontoINSS = 0.2 * this.salario;

        System.out.printf("O desconto do inss é de: %.2f\n", descontoINSS);
    }

    public void calcularImpostoRenda() {
        descontoImposto = 0.1 * this.salario;

        System.out.printf("O desconto do imposto de rende é de: %.2f\n", descontoImposto);
    }

    public void calcularPlanoSaude() {
        descontoSaude = 0.05 * this.salario;
        System.out.printf("O desconto do plano de saúde será de: %.2f\n", descontoSaude);
    }

    public void acrescimoHoras(int horas, double salarioBruto){
        double hora = salarioBruto / 160;
        acrescimo = hora + (hora * 0.5);

        System.out.printf("O acréscimo será de: %.2f\n", acrescimo);
    }

    public void calcularSalarioLiquido(){
        this.salario = this.salario - (descontoINSS + descontoImposto + descontoSaude) + acrescimo;
        System.out.printf("O salario liquido é de: %.2f\n", this.salario);
    }
}