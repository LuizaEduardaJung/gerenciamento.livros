
package GerenciamentoLivros;

import static GerenciamentoLivros.GeneroLivro.AUTOAJUDA;
import static GerenciamentoLivros.GeneroLivro.FICCAO_CIENTIFICA;
import static GerenciamentoLivros.GeneroLivro.ROMANCE;
import static GerenciamentoLivros.GeneroLivro.SUSPENSE;

public class Ebook extends Livro {
    double tamanhoArquivo;

    public Ebook(double tamanhoArquivo, String titulo, String autor, GeneroLivro genero) {
        super(titulo, autor, genero);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
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

    public GeneroLivro getGenero() {
        return genero;
    }

    public void setGenero(GeneroLivro genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Ebook{" + "tamanhoArquivo=" + tamanhoArquivo + '}';
    }

   
    @Override
    public double calcularPreco(){
          double valor = 0.0;
            if (this.getGenero().equals(ROMANCE)) {
                valor = 30;
            }
            if (this.getGenero().equals(SUSPENSE)) {
                valor = 40;
            }
            if (this.getGenero().equals(AUTOAJUDA)) {
                valor = 40;
            }
            if (this.getGenero().equals(FICCAO_CIENTIFICA)) {
                valor = 25;
            }
            if (this.getTamanhoArquivo() > 10) {
                valor += 5;
            }
    return valor;

    }
}

    
    


