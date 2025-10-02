
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe criada para exemplificar o principio do Encapsulamento
 * @author Augusto Andrade da Silva
 * @since Classe criada em 02/10/2025
 */
public class ContaCorrente {
    //ATRIBUTOS
    private int conta;
    private String cliente;
    private float saldo;
    private int senha;
    private boolean bloqueada;
    //Constrói um objeto em memória
    public ContaCorrente (int conta, String cliente, float saldo, int senha){
        this.conta = conta;
        this.cliente = cliente;
        this.saldo = saldo;
        this.senha = senha;
        this.bloqueada = false;
    }
    //Método comum para exibir os dados da conta do cliente
    public void exibirDadosContaCliente(){
        System.out.println("Número da conta: "+ getConta());
        System.out.println("Nome do cliente: " + getCliente());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Senha: " + getSenha());
    }
 
    //Método para modificar o saldo da conta do cliente  
    public void realizarSaque(){
        if(!validarSenha()){
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar saque!");
        }else{
            float valorSaque;
            valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Valor a sacar: "));
            setSaldo(getSaldo() - valorSaque);
        }
    }
    
    //Método para exibir o saldo da conta do cliente
    public void exibirSaldo(){
        if(!validarSenha()){
            
        } else{
            JOptionPane.showMessageDialog(null, "R$ "+ getSaldo(), "Saldo da conta corrente", 1);
        }
        
    }
    
    //Método para validar a senha a senha em diveras operações
    private boolean validarSenha(){
        if(isBloqueada()){
            JOptionPane.showMessageDialog(null, "Sua conta está bloqueada!!! \nNão é possivel utilizar está conta. \nPor favor contatar seu gerente de banco para mais informaçoes", "CONTA BLOQUEADA!", 2);
            return false;
        }
        
        int pwd;
        for(int i = 0; i < 3; i++){
            pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha: "));
            if(pwd != getSenha()){
                JOptionPane.showMessageDialog(null, "Senha inválida!");
            } else{
                return true;
            }
        }
        setBloqueada(true);
        JOptionPane.showMessageDialog(null, "Foi detectado uma tentativa de forçar o acesso. A conta será bloqueada");
        return false;
    }
    
    //Método para realizar deposito
    public void realizarDeposito(){
        float deposito = Float.parseFloat(JOptionPane.showInputDialog( "Valor do depósito: "));
        int conta;
        while(true){
            conta = Integer.parseInt(JOptionPane.showInputDialog("Digite '0' caso deseje cancelar o procedimento. \nNúmero da conta a receber o deposito: "));
            if(conta == 0){
                JOptionPane.showMessageDialog(null, "Como solicitado, a operação foi encerrada", "Fim da Operação", 1);
                break;
            } else if(conta != getConta()){
                JOptionPane.showMessageDialog(null, "Conta solicitada não encontrada!", "ERRO NA BUSCA!", 1);
            } else{
                setSaldo(getSaldo() + deposito);
                JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso");
                break;
            }
        }
    }
    
    //Métodos assessores
    //retorna o conteúdo do atributo
    public int getConta(){
        return this.conta;
    }
    private String getCliente(){
        return this.cliente;
    }
    private float getSaldo(){
        return this.saldo;   
    }
    private int getSenha(){
        return this.senha;   //retorna a senha
    }
    private boolean isBloqueada(){
        return this.bloqueada;
    }
    
    //Guarda a informação do atributo
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    private void setSaldo(float saldo){
        this.saldo = saldo;
    }
    private void setSenha(int senha){
        this.senha = senha;
    }
    private void setBloqueada(boolean bloqueado){
        this.bloqueada = bloqueado;
    }
}
