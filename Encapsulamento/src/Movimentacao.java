
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para ...
 * @author Augusto Andrade da Silva
 * @since Classe criada em 02/10/2025
 */
public class Movimentacao {
    public static void main(String[] args) {
    //               var de referencia(cc)  
        ContaCorrente cc = new ContaCorrente(123, "John Silksong", 3000000.00f, 123456);
        ContaCorrente hk = new ContaCorrente(123, "Hollow Knight", 2.00f, 9876);
        //cc.exibirDadosContaCliente();
        //cc.realizarSaque();
        //cc.exibirDadosContaCliente();
        /*if(cc.getBloqueado()){
            JOptionPane.showMessageDialog(null, "Segura esse bloqueio");
        }*/
        cc.exibirSaldo();
        
        cc.realizarDeposito();
    }
}
