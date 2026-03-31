package Gestao;
public abstract class Produto {

    protected String nome;
    protected int codigoBarras;
    protected double precoBase;
    protected Fornecedor fornecedor;

    public Produto(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor) {
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.precoBase = precoBase;
        this.fornecedor = fornecedor;
    }

    public abstract double calcularPrecoFinal();

    public void exibirResumo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço base: " + precoBase);
    }
}