/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.es.passagens;

import java.util.Date;

/**
 *
 * @author djgiu
 */
public class PedidoDePassagem {

    private Passagem passagem;
    private Cliente cliente;
    private Funcionario funcionario;
    private Date data;
    private Passagem valor;
    private Passagem valorEmMilhas;

    
    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Passagem getValor() {
        return valor;
    }

    public void setValor(Passagem valor) {
        this.valor = valor;
    }

    public Passagem getValorEmMilhas() {
        return valorEmMilhas;
    }

    public void setValorEmMilhas(Passagem valorEmMilhas) {
        this.valorEmMilhas = valorEmMilhas;
    }
    
}
