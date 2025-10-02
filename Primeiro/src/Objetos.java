/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe Criada para instanciar objetos do tipo "Pessoa"
 * @author Augusto Andrade da Silva
 * @since CLasse criada em 04/09/2025
 */
public class Objetos {
    public static void main(String [] fatec){
        Pessoa pessoa, x;
        Analise analise;
        pessoa = new Pessoa();
        x = new Pessoa();
        
        
        
        analise = new Analise();
        //pessoa = new Pessoa("Augusto", 18, 1.78f, 105f);
        //x = new Pessoa("Jonh Silksong", 1, 0.2f, 0.12f);
        
        pessoa.exibirDadosPessoa();
        pessoa.exibirDadosPessoaGUI();
        x.exibirDadosPessoa();
        
        System.out.println("Classificação: "+ analise.analisarIdadePessoa(pessoa));
        
        System.out.println(analise.compararIdade(pessoa, x));
                
    } //Fim do Main
    
}// Fim da classe
