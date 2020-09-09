package exercicios.classesExercicio3;

import java.nio.channels.Pipe;

public class Circulo {
    public Vertice[] vertices;

    private double raio;
    private double pi = 3.1415;

    public Circulo(Vertice[] vertices){
        this.vertices = vertices;
        raio = Vertice.distanciaEntreDoisPontos(vertices[0], vertices[1]);
    }

    public double calculaArea() {
        double area = pi * raio * raio;
        return area;
    }

    public double calcularPerimetro() {
        return pi * 2 * raio;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A área do círculo é ");
        stringBuilder.append(String.format("%.3f ", this.calculaArea()));
        stringBuilder.append("e o perímetro do círculo é ");
        stringBuilder.append(String.format("%.3f.", this.calcularPerimetro()));
        return stringBuilder.toString();
    }
}
