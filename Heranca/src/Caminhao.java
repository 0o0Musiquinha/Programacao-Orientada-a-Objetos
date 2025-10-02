
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Augusto Andrade da Silva
 * @since {$date}
 */
public class Caminhao extends Veiculo{
    String carroceria;
    float tara;
    int eixos;
    
    public Caminhao(String marca, String modelo, String cor, int ano, float valor, String carroceria, float tara, int eixos){
        super(marca, modelo, cor, ano, valor);
        this.carroceria = carroceria;
        this.tara = tara;
        this.eixos = eixos;
    }// FIM do construtor
    
    //Construtor para a entrada de dados com o GUI
    public Caminhao(){
        this.carroceria = JOptionPane.showInputDialog("Volume do Porta Malas: ");
        this.tara = Float.parseFloat(JOptionPane.showInputDialog("Tara: "));
        this.eixos = Integer.parseInt(JOptionPane.showInputDialog("Eixos: "));
    }
    
    public void exibirDadosCaminhao(){
        super.exibirDadosVeiculo();
        System.out.println("Tipo da Carroceria: "+ carroceria);
        System.out.println("Tara: "+ tara);
        System.out.println("eixos: "+ eixos);
        System.out.println("\n\n");
    }
    
    public void exibirDadosCaminhaoGUI(){
        String msg = super.exibirDadosVeiculoGUI();
        msg = msg + "\n" +
             "Carroceria: "+ carroceria + "\n" +
             "Tara: "+ tara + "\n" + 
             "Eixos: "+ eixos + "\n"
        ;
        
        JOptionPane.showMessageDialog(null, msg, "Dados do Carro", -1);
                
    }
}
