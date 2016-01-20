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
public class Ponto {

    private double x;
    private double y;
    private double z;
    

    /**
     * 3D point constructor
     *
     * @param x
     * @param y
     * @param z
     */
    public Ponto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * 2d point constructor
     *
     * @param x
     * @param y
     */
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * get xx cordinate
     * @return 
     */
    public double getX() {
        return x;
    }

    /**
     * get yy cordinate
     * @return 
     */
    public double getY() {
        return y;
    }

    /**
     * get zz cordinate
     * @return 
     */
    public double getZ() {
        return z;
    }
    
    
    
}
