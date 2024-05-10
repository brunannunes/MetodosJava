package Exercicio2;

public class Calculo {

    public void DescontoINSS(double salario){
        double desconto;

        desconto = (salario * 0.20) - salario;
    }

    public void DescontoIRPF(double salario){
        double desconto;

        desconto = (salario * 0.10) - salario;
    }

    public void DescontoPlano(double salario){
        double desconto;

        desconto = (salario * 0.05) - salario;
    }

    
}
