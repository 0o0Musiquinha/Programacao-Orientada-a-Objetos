/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Padaria;

/**
 * Classe Criada para capturar as Exceções da Padaria 
 * @author Augusto Andrade da Silva
 * @since CLasse criada em 16/10/2025
 */
public class PadariaException extends Exception{
    
    public PadariaException(int horas) {
        super("Já passou das 18h. Está na hora da padaria fechar.");
    }
    
    public PadariaException(boolean passado) {
        super("Pão está passado do ponto, portanto nao pode ser vendido");
    }
    
    public PadariaException() {
        super("Não é permitido vender mais do que 50 pães por cliente");
    }

}// Fim da classe
