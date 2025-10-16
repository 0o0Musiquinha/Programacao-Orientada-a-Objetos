/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Padaria;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 * Classe Criada para representar a Padaria
 * @author Augusto Andrade da Silva
 * @since CLasse criada em 16/10/2025
 */
public class Padaria {
    public static void main(String[] args) {
        int quantidade = 0;
        int horas = 0;
        String aux;
        Pao pao = new Pao(false);
        
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH");
        aux = horaAtual.format(formato);
        horas = Integer.parseInt(aux);
        
        
        
        try{
            
            expediente(horas);
            
            aux = JOptionPane.showInputDialog("Quantidade de pães: ");
            
            quantidade = Integer.parseInt(aux);
            
            System.out.println(vender(quantidade, pao));
        } catch(NumberFormatException ex){
            System.out.println("Digite apenas números!!!");
        } catch(PadariaException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println("Ocorreu uma exceção do tipo: "+ ex.toString());
        }
    } //Fim do programa
    
    private static String vender(int quantidade, Pao pao) throws PadariaException {
        if(quantidade > 50)
            throw new PadariaException();
        
        if(pao.getPassado())
            throw new PadariaException(pao.getPassado());
            
        
        return "Compra realizada com Sucesso!!!\n"+ (quantidade >1?"Foram vendidos ":"Foi vendido ") + quantidade +" "+ (quantidade > 1?"pães fresquinhos!!!":"pão fresquinho!!!");
    }
    
    private static void expediente(int horas) throws PadariaException{
        if(horas >= 18)
            throw new PadariaException(horas);
    }
}// Fim da classe
