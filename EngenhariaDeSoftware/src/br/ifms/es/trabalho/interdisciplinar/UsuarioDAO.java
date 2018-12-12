/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.es.trabalho.interdisciplinar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author djgiu
 */
public class UsuarioDAO {

    Connection conexao;
    String url = "jdbc:mysql://localhost:3306/empresarial";
    String usu = "root";
    String senha = "root";

    public UsuarioDAO() throws SQLException {
        conexao = DriverManager.getConnection(url, usu, senha);
    }

    public void inserir(Usuario usuario) throws SQLException {

        String sql = "INSERT INTO TB_USUARIO "
                + "(USU_NOME, USU_SOBRENOME, USU_SENHA, USU_DEPARTAMENTO_ID)"
                + " VALUES (?,?,?,?)";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getSobrenome());
        ps.setString(3, usuario.getSenha());
        ps.setInt(4, usuario.getDepartamento());
        ps.execute();

    }
}
