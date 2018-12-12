/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.es.trabalho.interdisciplinar;

import java.sql.SQLException;

/**
 *
 * @author djgiu
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        JanelaCadastroUsuario janCadUsu = new JanelaCadastroUsuario();
        janCadUsu.setVisible(true);
    }
}
