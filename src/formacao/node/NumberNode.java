/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formacao.node;

/**
 *
 * @author Udo Branco <udobranco@gmail.com>
 */
public class NumberNode extends ValueNode<int>{
    
private int value;
    
    public NumberNode(int value){
    this.value=value;
    }

    @Override
    public int getValue() {
        return value;
    }

    
    
}
