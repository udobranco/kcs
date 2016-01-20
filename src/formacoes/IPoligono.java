/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formacoes;

/**
 *
 * @author Udo Branco <udobranco@gmail.com>
 */
public interface IPoligono {
    
    public abstract void getPerimetro();
    public abstract Ponto[] getPontos();
    public abstract void pointsToString();
    
}
