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
public abstract class ValueNode<T> implements INode {

    public ValueNode(String value) {
    }
    public ValueNode() {
    }
    
    //public ValueNode(T val){}

    public abstract T getValue();

    @Override
    public void Exec() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
