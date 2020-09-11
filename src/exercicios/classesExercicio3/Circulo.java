package exercicios.classesExercicio3;

/**
 * @author  Markson Arguello - marksonva@dcc.ufrj.br
 *
 *
 * Classe para representar um círculo.
 */


public class Circulo {
    public Ponto[] pontos;

    private double raio;
    private double pi = 3.1415;

    /**
     * Construtor de um objeto do tipo Circulo
     * <p>
     *     Contrutor de um círculo e calcula o raio do círculo
     * </p>
     * @param pontos Pontos do circulo
     */

    public Circulo(Ponto[] pontos){
        this.pontos = pontos;
        raio = Ponto.distanciaEntreDoisPontos(pontos[0], pontos[1]);
    }

    /**
     * Calcula a área do círculo
     * @return area Area do circulo
     */

    public double calculaArea() {
        double area = pi * raio * raio;
        return area;
    }
    /**
     * Calcula o perímetro do círculo
     * @return Perímetro do circulo
     */
    public double calcularPerimetro() {
        return pi * 2 * raio;
    }

    /**
     * Retorna uma string com informações do círculo
     * @return String com área e perímetro
     */
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A área do círculo é ");
        stringBuilder.append(String.format("%.3f ", this.calculaArea()));
        stringBuilder.append("e o perímetro do círculo é ");
        stringBuilder.append(String.format("%.3f.", this.calcularPerimetro()));
        return stringBuilder.toString();
    }
}
