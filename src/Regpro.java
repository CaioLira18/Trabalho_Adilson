public class Regpro {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private int qtd;
    private int categoria; // Exercicio 2: Criar o campo categoria junto com seus construtores
    public int setDescricao;

    public Regpro(int codigo, String descricao, double preco, int qtd) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.qtd = qtd;
       
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public int getCategoria() {
        return categoria;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSetDescricao() {
        return setDescricao;
    }
    public void setSetDescricao(int setDescricao) {
        this.setDescricao = setDescricao;
    }


    
    
}
