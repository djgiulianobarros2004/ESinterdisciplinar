/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.es.passagens;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author djgiu
 */
public class Main {
    
    public static void main (String[] args){
        
        Usuario usuario = new Usuario();
        usuario.setLogin("djgiulianobarros@hotmail.com");
        usuario.setSenha("*******");
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Giuliano");
        cliente1.setEmail("djgiulianobarros@hotmail.com");
        cliente1.setTelefone("999557710");
        
        Funcionario func1 = new Funcionario();
        func1.setNome("Tássio");
        
        Passagem pass1 = new Passagem();
        pass1.setOrigem("Campo Grande");
        pass1.setDestino("São Paulo");
        pass1.setValor(new BigDecimal(856.00));
        pass1.setValorEmMilhas(new BigDecimal(1256));
        
        PedidoDePassagem pp = new PedidoDePassagem();      
        pp.setCliente(cliente1);
        pp.setFuncionario(func1);
        pp.setData(new Date());
        pp.setValor(pass1);
        pp.setValorEmMilhas(pass1);
        
        System.out.println("----------LOGIN E SENHA-----------------");
        System.out.println("");
        System.out.println("Login: " + usuario.getLogin());
        System.out.println("Senha: " + usuario.getSenha());
        
        System.out.println("----------PEDIDO DE PASSAGEM------------");
        System.out.println("");        
        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("Funcionário: " + func1.getNome());
        System.out.println("Data: " + pp.getData());
        System.out.println("Origem: " + pass1.getOrigem());
        System.out.println("Destino: " + pass1.getDestino());
        System.out.println("Valor: R$" + pass1.getValor());
        System.out.println("Valor em milhas: " + pass1.getValorEmMilhas());
        
    }
    
}
