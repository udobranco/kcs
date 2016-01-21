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
public class Operation implements IOperations {

    private String name;
    private int[] list; 
    
    @Override
    public int sum2val(int val1,int val2) {
        return val1+val2;
    }

    @Override
    public int sub(int val1, int val2) {
        return val1-val2;
    }

    @Override
    public int mult(int val1, int val2) {
        return val1*val2;
    }

    @Override
    public int sum3val(int val1, int val2, int val3) {
        /**
         * nao usei return sum2val(val1+val2)+val3 porque 
         * em termos de compilador era introduzir esforço desnecessario
         */
        return val1+val2+val3;
    }


}
