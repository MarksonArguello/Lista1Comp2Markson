package exercicios.classesExercicio3;

public class Triangulo {
    public Vertice[] vertices;

    public Triangulo(Vertice[] vertices){
        this.vertices = vertices;
    }

    public double calculaArea(){
        double det = 0;
        double diagPrin1, diagPrin2, diagPrin3, diagSec1, diagSec2, diagSec3;
        double[][] mat = {{vertices[0].getX(), vertices[0].getY(), 1.0}, {vertices[1].getX(), vertices[1].getY(), 1.0}, {vertices[2].getX(), vertices[2].getY(), 1.0}};


        diagPrin1 = mat[0][0] * mat[1][1] * mat[2][2];
        diagPrin2 = mat[0][1] * mat[1][2] * mat[2][0];
        diagPrin3 = mat[0][2] * mat[1][0] * mat[2][1];

        diagSec1 = mat[2][0] * mat[1][1] * mat[0][2];
        diagSec2 = mat[2][1] * mat[1][2] * mat[0][0];
        diagSec3 = mat[2][2] * mat[1][0] * mat[0][1];

        det = -(diagSec1 + diagSec2 + diagSec3) + (diagPrin1 + diagPrin2 + diagPrin3);
        return Math.abs(det)/2.0;
    }

    public double calcularPerimetro(){
        double perimetro = Vertice.distanciaEntreDoisPontos(vertices[0], vertices[1]);
        perimetro += Vertice.distanciaEntreDoisPontos(vertices[1], vertices[2]);
        perimetro += Vertice.distanciaEntreDoisPontos(vertices[2], vertices[0]);
        return perimetro;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A área do triangulo é ");
        stringBuilder.append(String.format("%.3f ", this.calculaArea()));
        stringBuilder.append("e o perímetro do triangulo é ");
        stringBuilder.append(String.format("%.3f.", this.calcularPerimetro()));
        return stringBuilder.toString();
    }
}
