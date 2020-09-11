package exercicios.classesExercicio3;

/**
 * @author  Markson Arguello - marksonva@dcc.ufrj.br
 *
 *
 * Classe para representar um retângulo.
 */


public class Retangulo {
    public Ponto[] pontos;

    /**
     * Construtor de um retângulo
     * @param pontos pontos do retângulo
     */

    public Retangulo(Ponto[] pontos){
        this.pontos = pontos;
    }

    /**
     * Calcula a área de um retângulo
     * @return Area do retângulo
     */

    public double calculaArea(){
        Ponto[] ponto1 = {pontos[0], pontos[1], pontos[2]};
        Triangulo triangulo1 = new Triangulo(ponto1);
        Ponto[] ponto2 = {pontos[2], pontos[3], pontos[0]};
        Triangulo triangulo2 = new Triangulo(ponto2);

        return triangulo1.calculaArea() + triangulo2.calculaArea();
    }
    /**
     * Calcula o perimetro de um retângulo
     * @return perimetro
     */
    public double calcularPerimetro(){
        double perimetro = Ponto.distanciaEntreDoisPontos(pontos[0], pontos[1]);
        perimetro += Ponto.distanciaEntreDoisPontos(pontos[1], pontos[2]);
        perimetro += Ponto.distanciaEntreDoisPontos(pontos[2], pontos[3]);
        perimetro += Ponto.distanciaEntreDoisPontos(pontos[3], pontos[0]);
        return perimetro;
    }

    /**
     * Retorna uma string com informações do retângulo
     * @return String com área e perímetro
     */

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A área do retângulo é ");
        stringBuilder.append(String.format("%.3f ", this.calculaArea()));
        stringBuilder.append("e o perímetro do retângulo é ");
        stringBuilder.append(String.format("%.3f.", this.calcularPerimetro()));
        return stringBuilder.toString();
    }
}
