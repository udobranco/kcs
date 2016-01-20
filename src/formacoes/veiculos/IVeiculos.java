/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formacoes.veiculos;

/**
 *
 * @author Udo Branco <udobranco@gmail.com>
 */

/**
 * interface que estipula as acoes basicas de um veiculo
 */
public interface IVeiculos {

    /**
     * metodo para o veiculo andar
     */
    public abstract void andar();

    /**
     * metodo para o veiculo travar();
     */
    public abstract void travar();

    /**
     * metodo para o veiculo ligar
     */
    public abstract void on();

    /**
     * metodo para o veiculo desligar
     */
    public abstract void off();
    
}
