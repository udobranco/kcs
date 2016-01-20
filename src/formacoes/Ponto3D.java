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
public class Ponto3D extends Ponto {

    private String color;

    public Ponto3D(double x, double y, double z) {
        super(x, y, z);
    }

    public Ponto3D(double x, double y, double z, String color) {
        super(x, y, z);
        this.color = color;
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
