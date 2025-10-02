/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe Criada para analisar um objeto do tipo pessoa
 * @author Augusto Andrade da Silva
 * @since CLasse criada em 04/09/2025
 */
public class Analise {
    //Método comum para analisar uma pessoa
    public String analisarIdadePessoa(Pessoa p){
        if(p.idade < 2){
            return "Bebê";
        } else if(p.idade < 13){
            return "Criança";
        } else if(p.idade < 20){
            return "Adolescente";
        } else if(p.idade <= 60){
            return "Adulto";
        } else if(p.idade <= 85){
            return "Idoso";
        } else{
            return "Matusalém";
        }
            
    }
    
    //Desafio 1)Escrever um método na classe analise que seja capaz de comparar dois objetos do tipo Pessoa para informar qual dos dois é mais velho.
    public String compararIdade(Pessoa p1, Pessoa p2){
        
        if (p1.idade > p2.idade){
            return p1.nome +" é o mais velho, tendo "+ p1.idade +" ano(s) de idade";
        } else if (p1.idade < p2.idade){
            return p2.nome +" é o mais velho, tendo "+ p2.idade +" ano(s) de idade";
        } else{
            return "Ambos possuem a mesma idade";
        }
        
    }
        

}// Fim da classe
