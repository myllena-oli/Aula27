package Exercicio2;

import java.sql.Array;

public class Main
{
    public static void main(String[] args) {
        Forma[] lista = new Forma[5];

        lista[0] = new Retangulo(7.5F, 9.3F);
        lista[1] = new Circulo(9.0F);
        lista[2] = new Quadrado(6.0F);
        lista[3] = new Quadrado(5.2F);
        lista[4] = new Retangulo(2.0F, 4.0F);


        for (Forma percorrer:lista){
            if (percorrer instanceof Quadrado){
                System.out.println("Quadrado: ");
            } else if (percorrer instanceof Circulo){
                System.out.println("Círculo: ");
            } else if (percorrer instanceof Retangulo){
                System.out.println("Retângulo: ");
            }
            System.out.println("Área: " + percorrer.calcularArea());
            System.out.println("Perímetro: " + percorrer.calcularPerimetro());
            System.out.println();
        }

    }
}
