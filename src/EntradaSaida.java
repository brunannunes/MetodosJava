import java.util.Scanner;

public class EntradaSaida {
    double nota1, nota2, nota3;
    double peso1, peso2, peso3;

    public EntradaSaida(double nota1, double nota2, double nota3, double peso1, double peso2, double peso3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.peso1 = peso1;
        this.peso2 = peso2;
        this.peso3 = peso3;
    }

    public void recebeNota(double nota1, double nota2,double nota3){
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o valor da primeria nota:");
        nota1 = leia.nextDouble();

        System.out.println("Informe o valor da segunda nota:");
        nota2 = leia.nextDouble();

        System.out.println("Informe o valor da terceira nota:");
        nota3 = leia.nextDouble();
    }

    public void recbePeso(double peso1, double peso2, double peso3){
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o peso da primeria nota:");
    }
}
