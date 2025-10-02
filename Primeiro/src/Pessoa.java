
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe Criada para...
 * @author Augusto Andrade da Silva
 * @since CLasse criada em 04/09/2025
 */
public class Pessoa {
    String nome;
    int idade;
    float altura;
    float peso;
    
    //Método construtor do objeto em memoria
    
    public Pessoa(String nome, int idade, float altura, float peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        
    }
    
    //Método construtor paraa entrada de dados por meio de GUI
    public Pessoa(){
        this.nome = JOptionPane.showInputDialog("Nome: ");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        this.altura = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
        this.peso = Float.parseFloat(JOptionPane.showInputDialog("Peso: "));
    }
    
    //Método comum para exibir dados de uma pessoa
    public void exibirDadosPessoa(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);
        System.out.println("Peso: "+ peso);
        System.out.println("IMC: "+ calcularIMC());
        System.out.println("condição: "+ classificarIMC());
    }
    
    //Método comum para calcular o IMC de uma Pessoa
    public float calcularIMC(){
        return peso / (altura*altura);
    }
    
    //Método comum para classificar o IMC
    public String classificarIMC(){
        float imc = calcularIMC();
        if(imc < 16.0){
            return "Muito abaixo do peso!!!!";
        } else if(imc < 18.0){
            return "Abaixo do peso.";
        } else if(imc < 25.0){
            return "peso ideal.";
        } else if(imc < 30){
            return "Sobrepeso";
        } else if(imc < 35){
            return "Obesidade I - leve";
        } else if(imc < 40){
            return "Obesidade II - Severa";
        } else{
            return "Obesidade III - Mórbida";
        }
    } //Fim do clasificarIMC()
    
    //Método comum para exibir os dados de uma pessoa por meio de GUI - Graphical User Interface
    public void exibirDadosPessoaGUI(){
        String msg;
        msg = "Nome " + this.nome;
        msg = msg +"\nIdade: "+ this.idade;
        msg = msg +"\nAltura: "+ this.altura;
        msg = msg +"\nPeso: "+ this.peso;
        msg = msg +"\nIMC: "+ calcularIMC() + " - "+ classificarIMC();
        JOptionPane.showMessageDialog(null, msg, "Dados Pessoais", -1);
    }
}// Fim da classe
