
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Augusto Andrade da Silva
 */
public class Veiculo {
    String marca;
    String modelo;
    String cor;
    int ano;
    float valor;

    // Método contrutor responsavel por criar um objeto na mémoria
    public Veiculo(String marca, String modelo, String cor, int ano, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    } // FIM do construtor
    
    //Método construtor paraa entrada de dados por meio de GUI
    public Veiculo(){
        this.marca = JOptionPane.showInputDialog("Marca: ");
        this.modelo = JOptionPane.showInputDialog("Modelo: ");
        this.cor = JOptionPane.showInputDialog("Cor: ");
        this.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        this.valor = Float.parseFloat(JOptionPane.showInputDialog("Valor:" ));
    }
    
    // Método comum para exibir os dados de veiculo
    public void exibirDadosVeiculo(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Cor: "+ cor);
        System.out.println("Ano de Fabricação: "+ ano);
        System.out.println("Valor em Reais: "+ valor);
        
    } //FIM do método "exibirDadosVeiculo"
    
    public String exibirDadosVeiculoGUI(){
        return
                "Marca: "+ marca + "\n"+
                "Modelo: "+ modelo+ "\n"+
                "Cor: " + cor+ "\n"+
                "Ano de Fabricação: "+ ano + "\n"+
                "Valor em Reais: "+ valor + "\n"
        ;
    } //FIM do método "exibirDadosVeiculo"
    
}
