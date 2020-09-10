package exercicios.classesExercicio3;

/**
 * @author  Markson Arguello <marksonva@dcc.ufrj.br>
 *
 *
 * Classe para representar um trapézio.
 */


public class Trapezio {
    public Ponto[] pontos;

    /**
     * Construtor do trapézio
     * @param pontos
     */

    public Trapezio(Ponto[] pontos){
        this.pontos = pontos;

    }

    /**
     * Calcula a área do trapézio
     * @return área
     */

    public double calculaArea(){
        Ponto[] ponto1 = {pontos[0], pontos[1], pontos[2]};
        Triangulo triangulo1 = new Triangulo(ponto1);
        Ponto[] ponto2 = {pontos[2], pontos[3], pontos[0]};
        Triangulo triangulo2 = new Triangulo(ponto2);

        return triangulo1.calculaArea() + triangulo2.calculaArea();
    }

    /**
     * Calcula o perímetro do trapézio
     * @return perímetro
     */

    public double calcularPerimetro(){
        double perimetro = Ponto.distanciaEntreDoisPontos(pontos[0], pontos[1]);
        perimetro += Ponto.distanciaEntreDoisPontos(pontos[1], pontos[2]);
        perimetro += Ponto.distanciaEntreDoisPontos(pontos[2], pontos[3]);
        perimetro += Ponto.distanciaEntreDoisPontos(pontos[3], pontos[0]);
        return perimetro;
    }

    /**
     *  Retorna uma string com informações do trapézio
     * @return String com área e perímetro
     */
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A área do trapézio é ");
        stringBuilder.append(String.format("%.3f ", this.calculaArea()));
        stringBuilder.append("e o perímetro do trapézio é ");
        stringBuilder.append(String.format("%.3f.", this.calcularPerimetro()));
        return stringBuilder.toString();
    }
}
