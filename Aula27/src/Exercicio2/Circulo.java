package Exercicio2;

public class Circulo extends Forma{
    private float raio;

    public Circulo(float raio){
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (float) (raio*raio* Math.PI);
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2*raio* Math.PI);
    }
}
