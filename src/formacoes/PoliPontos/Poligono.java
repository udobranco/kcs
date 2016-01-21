/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formacoes.PoliPontos;

/**
 *
 * @author Udo Branco <udobranco@gmail.com>
 */
public abstract class Poligono implements IPoligono {

    protected int nLados;
    protected Ponto[] pontos;

    /**
     * calculates the perimeter of a triangul
     *
     * @return
     */
    @Override
    public void getPerimetro() {
        double perimeter = 0;
        for (int i = 0; i < pontos.length - 1; i++) {
            perimeter += pontos[i].distance(pontos[i + 1]);
        }
        perimeter += pontos[0].distance(pontos[pontos.length - 1]);
        System.out.println("O perimetro é: " + perimeter);
    }

    /**
     * returns all the points of a poligon
     *
     * @return
     */
    @Override
    public Ponto[] getPontos() {
        return pontos;
    }

    /**
     * method to show all the points of a poligon
     */
    @Override
    public void pointsToString() {
        System.out.print("Os pontos da figura sao:");
        for (Ponto ponto : pontos) {
            System.out.print(" (" + ponto.getX() + "," + ponto.getY() + ")");
        }
    }
}
