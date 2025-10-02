/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe Criada para instanciar objetos do tipo Pessoa e Professor
 * @author Augusto Andrade da Silva
 * @since CLasse criada em 25/09/2025
 */
public class Cadastro {
    public static void main(String[] args){
        //Pessoa p = new Pessoa("Manuela", 32, 1.65f);
        Professor prof = new Professor("Tetsuo", 54, 1.74f, 98765, "Mátematica Discreta", 7500f);
        Aluno a = new Aluno("Augusto", 18, 1.78f, 1234567890123L, 8.5f, 4, true);
        a.exibirDados(true);
        //p.exibirDados();
        //prof.exibirDados(1);
        
        prof.exibirDados();
        prof.salario = 9500f;
        prof.exibirDados();
        //FALHA NO ENCAPSULAMENTO
        
        /*
        *Public
        *Private
        *Protected
        *Package
        */
        
    }

}// Fim da classe
