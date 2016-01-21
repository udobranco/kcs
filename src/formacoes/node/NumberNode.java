/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formacoes.node;

/**
 *
 * @author Udo Branco <udobranco@gmail.com>
 */
public class NumberNode extends ValueNode<Integer> {

    private int value;

    public NumberNode(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }

}


