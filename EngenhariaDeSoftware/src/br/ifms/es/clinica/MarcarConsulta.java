/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.es.clinica;

import java.util.Date;

/**
 *
 * @author djgiu
 */
public class MarcarConsulta extends Exame {
    
    private Cliente cliente;
    private Medico medico;
    private Funcionario func;
    private Animal animal;
    private Date data;

    public String getCliente() {
        return cliente.getNome();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMedico() {
        return medico.getNome();
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getFunc() {
        return func.getNome();
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public String getAnimal() {
        return animal.getNome();
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
