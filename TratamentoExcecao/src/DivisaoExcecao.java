/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe Criada para tratar as exceções para a classe 'Divisão'
 * @author Augusto Andrade da Silva
 * @since CLasse criada em 16/10/2025
 */
public class DivisaoExcecao extends Exception{
    public DivisaoExcecao(){
        super("O 'A' não pode ser menor que o 'B'");
    }

    DivisaoExcecao(int b) {
        super("O valor digitado para o 'B' ("+ b +") não pode ser superior à '500'");
    }
    
    DivisaoExcecao(String a){
        super("O valor de digitado para o 'A' não pode ser negativo");
    }
}// Fim da classe
