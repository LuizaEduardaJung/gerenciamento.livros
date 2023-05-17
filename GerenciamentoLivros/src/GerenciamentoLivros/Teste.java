/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciamentoLivros;

import static GerenciamentoLivros.GeneroLivro.ROMANCE;

/**
 *
 * @author Escola
 */
public class Teste {
    public static void main(String[] args) {
        Livro livro1 = new LivroFisico(600,"A Vida Invisivel de Addie LaRue","V. E. Schwab",GeneroLivro.ROMANCE);
        Livro livro2 = new Ebook(130, "Mentirosos","E. Lockhart",GeneroLivro.SUSPENSE);
        
        System.out.println(livro1.calcularPreco());
        System.out.println(livro2.calcularPreco());
    }
}
