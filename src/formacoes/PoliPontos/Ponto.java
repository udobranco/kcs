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
    private String color;
    /**
     * True for 3D
     * false for 2D
     */
    private boolean type;

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
        this.type = true;
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
        this.z = 0;
        this.type = false;
    }

    /**
     * 3D point constructor
     *
     * @param x
     * @param y
     * @param z
     * @param color
     */
    public Ponto(double x, double y, double z, String color) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
    }

    /**
     * 2d point constructor
     *
     * @param x
     * @param y
     * @param color
     */
    public Ponto(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.z = 0;
        this.color = color;
        this.type = true;

    }

    /**
     * get xx cordinate
     *
     * @return
     */
    public double getX() {
        return x;
    }

    /**
     * get yy cordinate
     *
     * @return
     */
    public double getY() {
        return y;
    }

    /**
     * get zz cordinate
     *
     * @return
     */
    public double getZ() {
        return z;
    }

    /**
     * function to calculate the distance between two 3d points
     *
     * @param p point to calculate the distance to.
     * @return
     */
    public double distance(Ponto p) {

        double dx = this.getX() - p.getX();
        double dy = this.getY() - p.getY();
        double dz = this.getZ() - p.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

}
