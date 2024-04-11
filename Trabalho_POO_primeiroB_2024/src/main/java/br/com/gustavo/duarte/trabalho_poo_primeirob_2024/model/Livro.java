
package br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model;


public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private String editora;
    private int anoLancamento;
    private int numPaginas;
    private double precoVenda;
    private String idioma;
    private String isbn;
    private int quantidadeEstoque;
    private String codigoLocalizador;
    public Livro(){};

    public Livro(String titulo, String autor, String genero, String editora, int anoLancamento, int numPaginas, double precoVenda, String idioma, String isbn, int quantidadeEstoque, String codigoLocalizador) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
        this.anoLancamento = anoLancamento;
        this.numPaginas = numPaginas;
        this.precoVenda = precoVenda;
        this.idioma = idioma;
        this.isbn = isbn;
        this.quantidadeEstoque = quantidadeEstoque;
        this.codigoLocalizador = codigoLocalizador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCodigoLocalizador() {
        return codigoLocalizador;
    }

    public void setCodigoLocalizador(String codigoLocalizador) {
        this.codigoLocalizador = codigoLocalizador;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", editora=" + editora + ", anoLancamento=" + anoLancamento + ", numPaginas=" + numPaginas + ", precoVenda=" + precoVenda + ", idioma=" + idioma + ", isbn=" + isbn + ", quantidadeEstoque=" + quantidadeEstoque + ", codigoLocalizador=" + codigoLocalizador + '}';
    }
}
