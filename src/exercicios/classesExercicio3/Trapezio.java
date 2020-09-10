package exercicios.classesExercicio3;

/**
 * @author  Markson Arguello <marksonva@dcc.ufrj.br>
 *
 *
 * Classe para representar um trapézio.
 */


public class Trapezio {
    public Vertice[] vertices;

    public Trapezio(Vertice[] vertices){
        this.vertices = vertices;

    }

    public double calculaArea(){
        Vertice[] vertice1 = {vertices[0], vertices[1], vertices[2]};
        Triangulo triangulo1 = new Triangulo(vertice1);
        Vertice[] vertice2 = {vertices[2], vertices[3], vertices[0]};
        Triangulo triangulo2 = new Triangulo(vertice2);

        return triangulo1.calculaArea() + triangulo2.calculaArea();
    }

    public double calcularPerimetro(){
        double perimetro = Vertice.distanciaEntreDoisPontos(vertices[0], vertices[1]);
        perimetro += Vertice.distanciaEntreDoisPontos(vertices[1], vertices[2]);
        perimetro += Vertice.distanciaEntreDoisPontos(vertices[2], vertices[3]);
        perimetro += Vertice.distanciaEntreDoisPontos(vertices[3], vertices[0]);
        return perimetro;
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A área do trapézio é ");
        stringBuilder.append(String.format("%.3f ", this.calculaArea()));
        stringBuilder.append("e o perímetro do trapézio é ");
        stringBuilder.append(String.format("%.3f.", this.calcularPerimetro()));
        return stringBuilder.toString();
    }
}
