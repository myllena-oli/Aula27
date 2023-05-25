package Exercicio2;

public class Retangulo extends Forma{
    private float lado, altura;

    public Retangulo(float lado, float altura){
        this.lado = lado;
        this.altura = altura;
    }
    @Override
    public float calcularArea() {
        return lado * altura;
    }

    @Override
    public float calcularPerimetro() {
        return (lado+altura)*2;
    }

    public float getLado() {
        return lado;
    }
}
