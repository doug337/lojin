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
public class Venda {

    /**
     * @return the cod_venda
     */
    public int getCod_venda() {
        return cod_venda;
    }

    /**
     * @param cod_venda the cod_venda to set
     */
    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }

    /**
     * @return the num_nota_fiscal
     */
    public int getNum_nota_fiscal() {
        return num_nota_fiscal;
    }

    /**
     * @param num_nota_fiscal the num_nota_fiscal to set
     */
    public void setNum_nota_fiscal(int num_nota_fiscal) {
        this.num_nota_fiscal = num_nota_fiscal;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the infoproduto
     */
    public Produto getInfoproduto() {
        return infoproduto;
    }

    /**
     * @param infoproduto the infoproduto to set
     */
    public void setInfoproduto(Produto infoproduto) {
        this.infoproduto = infoproduto;
    }

    /**
     * @return the usaitem
     */
    public Item getUsaitem() {
        return usaitem;
    }

    /**
     * @param usaitem the usaitem to set
     */
    public void setUsaitem(Item usaitem) {
        this.usaitem = usaitem;
    }
    private Produto infoproduto;
    private Item usaitem;
    private int cod_venda;
    private int num_nota_fiscal;
    private float total;
    
}
