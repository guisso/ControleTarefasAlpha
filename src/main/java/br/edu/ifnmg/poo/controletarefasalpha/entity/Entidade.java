/* 
 * Material didático destinado ao curso
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.controletarefasalpha.entity;

/**
 * Modelo geral para entidades.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.0.1, 29/11/2020
 */
public abstract class Entidade {

    /**
     * Identidade da entidade (chave primária mapeada para o banco de dados)
     */
    private Long id;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    /**
     * Construtor padrão.
     */
    public Entidade() {
    }

    /**
     * Construtor sobrecarregado.
     *
     * @param id Identidade da entidade
     */
    public Entidade(Long id) {
        this.id = id;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //</editor-fold>

}
