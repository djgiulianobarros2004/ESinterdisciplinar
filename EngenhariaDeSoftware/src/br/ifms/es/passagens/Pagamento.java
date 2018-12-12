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
public class Pagamento {
    
    private BigDecimal cataoCredito;
    private Integer milhas;

    public BigDecimal getCataoCredito() {
        return cataoCredito;
    }

    public void setCataoCredito(BigDecimal cataoCredito) {
        this.cataoCredito = cataoCredito;
    }

    public Integer getMilhas() {
        return milhas;
    }

    public void setMilhas(Integer milhas) {
        this.milhas = milhas;
    }
    
}
