/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.es.trabalho.interdisciplinar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author djgiu
 */
public class LerArquivo {

    Usuario usuario;
    List<Usuario> lista;
    FileReader arquivo;
    BufferedReader br;
    UsuarioDAO usuarioDAO;
    String dados[] = null;

    public LerArquivo(String caminhoArquivo, Integer departamento, String senha) throws FileNotFoundException, IOException, SQLException {

        arquivo = new FileReader(caminhoArquivo);
        br = new BufferedReader(arquivo);
        usuarioDAO = new UsuarioDAO();
        String linha = br.readLine();

        while (linha != null) {
            dados = linha.split(";");
            usuario = new Usuario();
            usuario.setNome(dados[0]);
            usuario.setSobrenome(dados[1]);
            usuario.setEmail(dados[2]);
            usuario.setDepartamento(departamento);
            usuario.setSenha(senha);
            linha = br.readLine();
            usuarioDAO.inserir(usuario);
        }
    }
}
