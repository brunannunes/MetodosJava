package Exercicio1;

public class Resultado {


    public void resultadoAritmetica(){
        EntradaSaida entradaSaida = new EntradaSaida();
        Calculo calculo = new Calculo();

        if (!calculo.calcularAritmetica(entradaSaida.getNota1(), entradaSaida.getNota2()) || calculo.calcularPonderada(entradaSaida.getNota1(), entradaSaida.getNota2(), entradaSaida.getPeso1(), entradaSaida.getPeso2())){
            System.out.println("Voce foi reprovado");
        }
        else {
            System.out.println("Voce foi aprovado");
        }

    }



}
