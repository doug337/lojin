/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojinha;

/**
 *
 * @author aluno
 */
public class Banco {

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the contacorrente
     */
    public int getContacorrente() {
        return contacorrente;
    }

    /**
     * @param contacorrente the contacorrente to set
     */
    public void setContacorrente(int contacorrente) {
        this.contacorrente = contacorrente;
    }

    /**
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }
    private String banco;
    private int agencia;
    private int contacorrente;
    
}
