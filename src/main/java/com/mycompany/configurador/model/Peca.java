package com.mycompany.configurador.model;


    /**
 * Representa um componente de hardware no sistema.
 * Utilizada como base de dados em memória para os JComboBoxes.
 */
public class Peca {
    private String nome;
    private double preco;
    private int tdp; 
    private int score; 
    private String detalhe1;
    private String detalhe2;

    public Peca(String nome, double preco, int tdp, int score, String detalhe1, String detalhe2) {
        this.nome = nome;
        this.preco = preco;
        this.tdp = tdp;
        this.score = score;
        this.detalhe1 = detalhe1;
        this.detalhe2 = detalhe2;
    }

    // Getters para acesso aos atributos pela View
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getTdp() { return tdp; }
    public int getScore() { return score; }
    public String getDetalhe1() { return detalhe1; }
    public String getDetalhe2() { return detalhe2; }

    /**
     * Sobrescrita essencial para que o JComboBox exiba o nome da peça
     * em vez do endereço de memória do objeto.
     */
    @Override
    public String toString() {
        return nome; 
    }
}
