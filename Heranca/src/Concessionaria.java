/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para instanciar objetos do tipo Carro
 * @author Augusto Andrade da Silva
 * @since {$date}
 */
public class Concessionaria {
    public static void main (String[] args){
        Carro carro;
        Caminhao caminhao;
        
        //---------->Instanciação por Interface Grafica
        //carro = new Carro();
        //caminhao = new Caminhao();
        
        //----------> Instanciação por Parametro
        carro = new Carro("Mercedes", "CLA250", "Rosa", 2026, (float) 345000, 250, true);
        caminhao = new Caminhao("Mercedes", "RDO300", "Amarelo", 2024, (float) 400000, "Quadrada",(float) 1.24, 2);
        
        //Funções de exibição em console
        //carro.exibirDadosCarro();
        //caminhao.exibirDadosCaminhao();
        
        //Funções de exibição com Interface Grafica
        carro.exibirDadosCarroGUI();
        caminhao.exibirDadosCaminhaoGUI();
    }
}
