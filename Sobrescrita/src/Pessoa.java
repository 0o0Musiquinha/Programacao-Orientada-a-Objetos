/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe Criada para demonstar o recurso de Sobreescrita de métodos
 * @author Augusto Andrade da Silva
 * @since CLasse criada em 25/09/2025
 */
public class Pessoa {
    String nome;
    int idade;
    float altura;

    // Construtor do objeto Pessoa em memoria
    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    //Método para exibir os dados de Pessoa
    public void exibirDados(){
        System.out.println("Nome da pessoa: "+ nome);
        System.out.println("Idade da pessoa: "+ idade);
        System.out.println("Altura da pessoa: "+ altura);
    }

}// Fim da classe
