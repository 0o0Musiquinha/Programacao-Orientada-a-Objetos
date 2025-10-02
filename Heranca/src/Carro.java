
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para herdar TODOS os atributos e métodos da superclasse veiculo
 * @author Augusto Andrade da Silva
 * @since {$date}
 */
public class Carro extends Veiculo{
    int volPortaMalas;
    boolean conversivel;
    //Construtor para um objeto do tipo Carro
    public Carro(String marca, String modelo, String cor, int ano, float valor, int volPortaMalas, boolean conversivel) {
        super(marca, modelo, cor, ano, valor);
        this.volPortaMalas = volPortaMalas;
        this.conversivel = conversivel;
    
    }
    
    //Construtor para a entrada de dados com o GUI
    public Carro(){
        this.volPortaMalas = Integer.parseInt(JOptionPane.showInputDialog("Volume do Porta Malas: "));
        this.conversivel = JOptionPane.showInputDialog("É conversivel? ").equalsIgnoreCase("Sim");
    }
    
    //Método comum para exibir dados de Carro
    public void exibirDadosCarro(){
        super.exibirDadosVeiculo();
        System.out.println("Volume do porta malas: "+ volPortaMalas);
        System.out.println("É Conversivel: "+ (conversivel?"Sim" :"Não"));
        System.out.println("\n\n");
    }
    
    public void exibirDadosCarroGUI(){
        String msg = super.exibirDadosVeiculoGUI();
        msg = msg +"\n"+
             "Volume do porta malas: "+ volPortaMalas + "\n"+
             "É Conversivel: "+ (conversivel?"Sim" :"Não") + "\n";
        
        JOptionPane.showMessageDialog(null, msg, "Dados do Carro", -1);
                
    }
    
}
