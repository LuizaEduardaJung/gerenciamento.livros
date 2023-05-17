/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Escola
 */
package GerenciamentoLivros;

import static GerenciamentoLivros.GeneroLivro.AUTOAJUDA;
import static GerenciamentoLivros.GeneroLivro.FICCAO_CIENTIFICA;
import static GerenciamentoLivros.GeneroLivro.ROMANCE;
import static GerenciamentoLivros.GeneroLivro.SUSPENSE;

public class LivroFisico extends Livro {

    int numeroPaginas;

    public LivroFisico(int numeroPaginas, String titulo, String autor, GeneroLivro genero) {
        super(titulo, autor, genero);
        this.numeroPaginas = numeroPaginas;
    }

    public LivroFisico(String titulo, String autor, GeneroLivro genero) {
        super(titulo, autor, genero);
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
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
        return "LivroFisico{" + "numeroPaginas=" + numeroPaginas + '}';
    }

    @Override
    public double calcularPreco() {
        double valor = 0.0;
            if (this.getGenero().equals(ROMANCE)) {
                valor = 30;
            }
            if (this.getGenero().equals(SUSPENSE)) {
                valor = 35;
            }
            if (this.getGenero().equals(AUTOAJUDA)) {
                valor = 40;
            }
            if (this.getGenero().equals(FICCAO_CIENTIFICA)) {
                valor = 25;
            }
            if (this.getNumeroPaginas() > 500) {
                valor += 10;
                
            }
    return valor;

    }

}
