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
public abstract class  Veiculos implements IVeiculos{
    
    /**
     * nRodas - define o numero de rodas de um veiculo
     */
    protected int nRodas;
    
    /**
     * cilindrada - define a cilindrada de um veiculo
     */
    protected int cilindrada;
    
    /**
     * abs - define se um veiculo tem ou nao abs 
     */
    protected boolean abs;
    
    /**
     * startUpType - define o tipo de arranque do veiculo
     *              0 ignicao normal
     *              1 start and stop
     */
    protected char startUpType;
    
    
}
