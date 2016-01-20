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
public class BooleanNode extends ValueNode<Boolean>{
    
    private Boolean value;
    
    public BooleanNode(Boolean value){
    this.value=value;
    }

    @Override
    public Boolean getValue() {
        return value;
    }
    
}
