
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe Criada para demonstrar o recurso de linguagem chamado Tratamento de Exceção
 * @author Augusto Andrade da Silva
 * @since CLasse criada em 16/10/2025
 */
public class Divisao {
    public static void main(String[] args) {
        int a, b, divi = 0;
        String numa, numb;
        
        numa = JOptionPane.showInputDialog("Digite o valor de A:");
        numb = JOptionPane.showInputDialog("Digite o valor de B:");
        
        try{
            a = Integer.parseInt(numa);
            b = Integer.parseInt(numb);
            
            divi = dividir(a, b);
            System.out.println("Divisão: "+ divi);
        } catch(NumberFormatException ex){
            System.out.println("Digite apenas números!!!");
        } catch(ArithmeticException ex){
            System.out.println("Não existe divisão por zero!!!");
        } catch(DivisaoExcecao ex){
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println("Ocorreu uma excessão do tipo: "+ ex.toString());
        }
        
        
        
        
    } //Fim do programa

    private static int dividir(int a, int b) throws DivisaoExcecao {
        if(a < b)
            throw new DivisaoExcecao();
        
        if(b > 500)
            throw new DivisaoExcecao(b);
        
        if(a < 0)
            throw new DivisaoExcecao("a");
        
        return a / b;
    }
}// Fim da classe
