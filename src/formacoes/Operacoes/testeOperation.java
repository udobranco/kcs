/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formacoes.Operacoes;

/**
 *
 * @author Udo Branco <udobranco@gmail.com>
 */
public class testeOperation {

    public static void main(String[] args) {

        Operation op = new Operation();

        int v1 = 10, v2 = 5, v3 = 1;

        System.out.println("Testing sum2val: " + op.sum2val(v1, v2));
        System.out.println("Testing sub: " + op.sub(v1, v2));
        System.out.println("Testing mul: " + op.mult(v1, v2));
        System.out.println("Testing sum3val: " + op.sum3val(v1, v2, v3));
    }

}
