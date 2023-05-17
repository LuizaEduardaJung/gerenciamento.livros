package GerenciamentoLivros;
public abstract class Livro {
    String titulo;
    String autor;
    GeneroLivro genero;

    public Livro(String titulo, String autor, GeneroLivro genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    
    public abstract double calcularPreco();
    

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

    public GeneroLivro getGenero() {
        return genero;
    }

    public void setGenero(GeneroLivro genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + '}';
    }
    
    
    
}
