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
public class Triangulo extends Poligono {

    /**
     * Construts a trianguls.
     *
     * @param pontos[] - group of Points data type that defines a triangul
     */
    public Triangulo(Ponto2D[] pontos) {
        if (pontos.length == 3) {
            super.nLados = 3;
            System.arraycopy(pontos, 0, super.pontos, 0, 3);
        } else {
            System.out.println("O conjunto de pontos não define um triangulo");
        }
    }

}
