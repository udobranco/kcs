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
public class StringNode extends ValueNode<String>{
    
    private String value;
    
    public StringNode(String value){
    this.value=value;
    }

    @Override
    public String getValue() {
        return value;
    }
    
}
