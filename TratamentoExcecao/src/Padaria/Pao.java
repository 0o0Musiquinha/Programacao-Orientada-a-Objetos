/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Padaria;

/**
 * Classe Criada para representar o pão
 * @author Augusto Andrade da Silva
 * @since CLasse criada em 16/10/2025
 */
public class Pao {
    private boolean passado;
    
    public Pao(boolean passado){
        this.passado = passado;
    }
    
    public boolean getPassado(){
        return passado;
    }
    
    public void setPassado(boolean passado){
        this.passado = passado;
    }
    
}// Fim da classe
