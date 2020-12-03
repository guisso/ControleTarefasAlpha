/* 
 * Material didático destinado ao curso
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.controletarefasalpha.entity;

import java.util.Objects;

/**
 * Representação da tarefa a ser persistida.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.0.1, 29/11/2020
 */
public class Tarefa extends Entidade {

    /**
     * Descrição da tarefa a ser executada.
     */
    private String descricao;

    /**
     * Estado de conclusão da tarefa.
     */
    private Boolean concluida;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    /**
     * Construtor padrão.<br>
     * <i>OBS.: experimente comentar o construtor padrão da superclasse e
     * verifique o que ocorre com este construtor.</i>
     */
    public Tarefa() {
    }

    /**
     * Construtor sobrecarregado.
     *
     * @param id Identidade da tarefa.
     * @param descricao Descrição da tarefa.
     * @param concluida Estado de conclusão da tarefa.
     */
    public Tarefa(Long id, String descricao, Boolean concluida) {
        super(id);
        this.descricao = descricao;
        this.concluida = concluida;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }
    //</editor-fold>

    /**
     * Cômputo do <i>hash</i> do objeto em seu estado atual.
     *
     * @return Código <i>hash</i> do objeto.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(getId());
        return hash;
    }

    /**
     * Verifica identidade entre tarefas.<br>
     * <i>OBS.: São permitidas tarefas com descrições e estado de conclusão duplicadas,
     * mas a chave de identidade deve ser única.</i>
     * 
     * @param obj Tarefa a ser comparada com o objeto atual
     * @return Estado de igualdade entre tarefas.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }

        if (hashCode() != obj.hashCode()) {
            return false;
        }
        
        return true;
    }

    /**
     * Gera representação textual do objeto atual.
     * 
     * @return Texto representativo do objeto atual
     */
    @Override
    public String toString() {
        return descricao + (concluida ? " [Concluída]" : " [Pendente]");
    }

}
