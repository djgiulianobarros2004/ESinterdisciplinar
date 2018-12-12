/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.es.passagens;

import java.math.BigDecimal;

/**
 *
 * @author djgiu
 */
public class Passagem {
    
    private String origem;
    private String destino;
    private BigDecimal valor;
    private BigDecimal valorEmMilhas;

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValorEmMilhas() {
        return valorEmMilhas;
    }

    public void setValorEmMilhas(BigDecimal valorEmMilhas) {
        this.valorEmMilhas = valorEmMilhas;
    }
    
}
