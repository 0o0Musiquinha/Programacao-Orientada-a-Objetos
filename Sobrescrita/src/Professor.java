/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe Criada para herdar TODOS os atributos e métodos da superclasse Pessoa e promovendo a sobreescrita de alguns métodos
 * @author Augusto Andrade da Silva
 * @since CLasse criada em 25/09/2025
 */
public class Professor extends Pessoa{
    int codigo;
    String disciplina;
    float salario;
    
    //Construtor do objeto professor em memória
    public Professor(String nome, int idade, float altura, int codigo, String disciplina, float salario) {
        super(nome, idade, altura);
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.salario = salario;
    }
    
    /**
     *
     */
    @Override
    public void exibirDados(){
        System.out.println("O professor "+ nome 
                + " ministra a disciplina '"+ disciplina 
                +"' e tem o salário de R$ "+ salario
        );
    }
    
    public void exibirDados(boolean resp){
        super.exibirDados();
        System.out.println("Salário: "+ salario);
        System.out.println("Disiplina: "+ disciplina);
        System.out.println("Codigo de funcionario: "+ codigo);
    }
    
    public void exibirDados(int x){
        System.out.println("Professor: "+ nome);
        System.out.println("Salário: "+ salario);
    }

}// Fim da classe
