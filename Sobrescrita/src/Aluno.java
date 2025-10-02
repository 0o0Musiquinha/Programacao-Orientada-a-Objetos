/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe Criada para...
 * @author Augusto Andrade da Silva
 * @since CLasse criada em 25/09/2025
 */
public class Aluno extends Pessoa{
    long ra;
    float media;
    int faltas;
    boolean dependencia;
    
    public Aluno(String nome, int idade, float altura, long ra, float media, int faltas, boolean dependencia) {
        super(nome, idade, altura);
        this.ra = ra;
        this.media = media;
        this.faltas = faltas;
        this.dependencia = dependencia;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("O aluno "+ nome 
                + " possui média "+ media 
                +" e "+ (dependencia?"possui dependencia com a faculdade":"não possui dependencia com a faculdade")
        );
    }
    
    public void exibirDados(boolean resp){
        System.out.println("RA: "+ ra
                    +"\nFaltas: "+ faltas
        );
    }
    
    public void exibirDados(int x){
        System.out.println("Media: "+ media
                    +"\nFaltas: "+ faltas
                    +"\nDependencia: "+ (dependencia?"possui dependencia com a faculdade":"não possui dependencia com a faculdade")
        );
    }

}// Fim da classe
