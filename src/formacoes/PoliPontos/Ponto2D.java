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
public class Ponto2D extends Ponto {

    private String color;
    
    public Ponto2D(double x, double y) {
        super(x, y);
    }

    public Ponto2D(double x, double y, String color) {
        super(x, y);
        this.color=color;
    }
    
    /**
     * function to calculate the distance between two 2d points
     * @param p point to calculate the distance to.
     * @return 
     */
    public double distance (Ponto p){
    
    return Math.sqrt((this.getX()-p.getX())*(this.getX()-p.getX()) + 
            (this.getY()-p.getY())*(this.getY()-p.getY()));
    }
}
