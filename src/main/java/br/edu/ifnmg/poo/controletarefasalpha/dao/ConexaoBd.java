/* 
 * Material didático destinado ao curso
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.controletarefasalpha.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Tratamento da conexão com o banco de dados.
 * 
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.0.1, 29/11/2020
 */
public class ConexaoBd {

    /**
     * URL de conexão com o banco de dados (protocolo/sgbd/ip/porta/banco/parâmetros).
     */
    public static final String URL;
    
    /**
     * Retém a conexão estabelecida com o banco de dados durante a operação do sistema.
     */
    private static Connection conexao;
    
    /**
     * Usuário para acesso ao banco de dados.
     */
    private static String usuario;
    
    /**
     * Senha para acesso ao banco de dados.
     */
    private static String senha;

    /**
     * Inicialização de valores estáticos.
     */
    static {
        URL = "jdbc:mysql://127.0.0.1:3306/tarefas?useUnicode=true&useJDBCCompliantTimezoneShift=true&serverTimezone=UTC";
        usuario = "root";
        senha = "";
    }

    //<editor-fold defaultstate="collapsed" desc="Construtor privado">
    /**
     * Construtor privado para forçar acesso à conexão pelo membro estático
     * <code>getConexao()</code> sem que sejam gerados novos objetos "ConexaoBd".
     */
    private ConexaoBd() {
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        ConexaoBd.usuario = usuario;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        ConexaoBd.senha = senha;
    }
    //</editor-fold>

    /**
     * Estabele e gera a retenção da conexão com o banco de dados.
     * 
     * @return Conexão com o banco de dados.
     */
    public static Connection getConexao() {

        // Se não há uma conexão estabelecida...
        if (conexao == null) {
            // ... tenta ...
            try {
                System.out.println(">> Nova conexão estabelecida com o banco de dados");
                // ... estabelecer e reter a conexão a partir da URL, 
                // do usuário e da senha fornecidos
                conexao = DriverManager.getConnection(URL, usuario, senha);
            } catch (SQLException ex) {
                // TODO Rever procedimento e encerrar o programa em caso de falha
                // Caso ocorra alguma falha, registra falha
                Logger.getLogger(ConexaoBd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // Devolve a conexão estabelecida
        return conexao;

    }

}
