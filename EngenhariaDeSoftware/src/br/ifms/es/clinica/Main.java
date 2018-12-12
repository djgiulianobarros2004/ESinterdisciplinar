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
public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rênny");
        cachorro.setRaca("Pastor Alemão");
        cachorro.setDataNasc("15/12/2010");

        Cliente cliente = new Cliente();
        cliente.setAnimal(cachorro);
        cliente.setNome("Giuliano");
        cliente.setCpf("59534575100");
        cliente.setEmail("djgiulianoBarros@hotmail");
        cliente.setRua("Vale da Esperança");
        cliente.setBairro("Jardim das Acácias");
        cliente.setNumero(68);

        Medico medico = new Medico();
        medico.setNome("Dr. Rafael Almeida");
        medico.setCrm("456897123");
        medico.setCpf("82190964523");
        medico.setEmail("rafael@gmail.com");
        medico.setTelefone("6732913234");
        medico.setBairro("Santa Maria");
        medico.setRua("Projetada 2");
        medico.setNumero(100);

        Funcionario func = new Funcionario();
        func.setNome("Jorge Fonseca");
        func.setCpf("46231478900");
        func.setCarteiraDeTrabalho("789562314756");
        func.setEmail("jorge@hotmail.com");
        func.setTelefone("67999845612");
        func.setBairro("Piracema");
        func.setRua("Marambaia");
        func.setNumero(156);

        MarcarConsulta mc = new MarcarConsulta();
        mc.setFunc(func);
        mc.setCliente(cliente);
        mc.setMedico(medico);
        mc.setAnimal(cachorro);
        mc.setData(new Date());

        AtenderConsulta atendCons = new AtenderConsulta();
        atendCons.setCliente(cliente);
        atendCons.setFunc(func);
        atendCons.setAnimal(cachorro);
        atendCons.setMedico(medico);
        atendCons.setHistorico("Animal com Leishmaniose canina");
        atendCons.setData(new Date());
        atendCons.setTipoDeExame("Leishmaniose");      

        System.out.println("------------ATENDER CONSULTA-------------");
        System.out.println("");
        System.out.println("Cliente: " + atendCons.getCliente());
        System.out.println("Medico: " + atendCons.getMedico());
        System.out.println("Funcionário: " + atendCons.getFunc());
        System.out.println("Animal: " + atendCons.getAnimal());
        System.out.println("Data: " + atendCons.getData());
        System.out.println("Histórico: " + atendCons.getHistorico());
        System.out.println("Tipo de Exame: " + atendCons.getTipoDeExame());
        
    }

}
