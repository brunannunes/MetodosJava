package Exercicio2;

public class Validacao {

    public boolean validar(double salario){
        return !(salario <= 500) || !(salario > 30000);
    }
}
