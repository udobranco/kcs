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
public class Quadrilatero extends Poligono {

    public Quadrilatero(Ponto[] pontos) {
        if (pontos.length == 4) {
            super.nLados = 4;
            System.arraycopy(pontos, 0, super.pontos, 0, 4);
        } else {
            System.out.println("O conjunto de pontos não define um quadrilátero");
        }
    }
}
