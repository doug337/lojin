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
public class Funcionario extends Pessoa {

    /**
     * @return the cart_trab
     */
    public String getCart_trab() {
        return cart_trab;
    }

    /**
     * @param cart_trab the cart_trab to set
     */
    public void setCart_trab(String cart_trab) {
        this.cart_trab = cart_trab;
    }

    /**
     * @return the tipo_sangue
     */
    public String getTipo_sangue() {
        return tipo_sangue;
    }

    /**
     * @param tipo_sangue the tipo_sangue to set
     */
    public void setTipo_sangue(String tipo_sangue) {
        this.tipo_sangue = tipo_sangue;
    }

    /**
     * @return the plano_saude
     */
    public String getPlano_saude() {
        return plano_saude;
    }

    /**
     * @param plano_saude the plano_saude to set
     */
    public void setPlano_saude(String plano_saude) {
        this.plano_saude = plano_saude;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the banco
     */
    public Banco getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    
    private String cart_trab;
    private String tipo_sangue;
    private String plano_saude;
    private float salario;
    private Banco banco;
    
    
    
    
}
    