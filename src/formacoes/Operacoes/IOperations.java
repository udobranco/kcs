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
public interface IOperations {

    /**
     * funtion to sum 2 values
     *
     * @param val1 1st value
     * @param val2 2nd value
     * @return result (int)
     */
    public abstract int sum2val(int val1, int val2);

    /**
     * function to subtract
     *
     * @param val1 1st value
     * @param val2 2nd value
     * @return result(int)
     */
    public abstract int sub(int val1, int val2);

    /**
     * function to multiply
     *
     * @param val1 1st value
     * @param val2 2nd value
     * @return result (int)
     */
    public abstract int mult(int val1, int val2);

    /**
     * function to sum 3 val();
     *
     * @param val1 1st value
     * @param val2 2nd value
     * @param val3 2nd value
     * @return result (int)
     */
    public abstract int sum3val(int val1, int val2, int val3);

}
