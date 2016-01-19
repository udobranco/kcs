/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formacoes;

/**
 *
 * @author Tropa
 */
public class Mota extends Veiculos{

    /**
     * construtor da classe mota
     * @param cilindrada
     * @param abs
     * @param startUpType 
     */
    public Mota( int cilindrada,boolean abs,char startUpType) {
    
    super.nRodas=2;
    super.cilindrada=cilindrada;
    super.abs=abs;
    super.startUpType=startUpType;
    }

    @Override
    public void andar() {
    }

    @Override
    public void travar() {
    }

    @Override
    public void on() {
    }

    @Override
    public void off() {
    }
    
    
}
