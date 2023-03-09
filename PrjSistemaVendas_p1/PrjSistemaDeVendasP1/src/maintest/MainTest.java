/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maintest;

import entity.Categoria;
import entity.Produto;

/**
 *
 * @author mpisc
 */
public class MainTest {
    public static void main(String[] args) {

        Produto p1 = new Produto(1);
        Produto p2 = new Produto(2, "Sapato");
        Produto p3 = new Produto(3, "Celular", "Celular Android", 1000.0);
        Categoria c1 = new Categoria();
        c1.setId(1);
        c1.setDescricao("Calçado");
        p1.setCategoria(c1);
        p2.setCategoria(c1);
        Categoria c2 = new Categoria();
        c2.setId(2);
        c2.setDescricao("Eletrônicos");
        p3.setCategoria(c2);
        
        
        p1.setNome("Tenis");
//        p.descricao = "Tenis Run";
        //p.preco = -200.00;
        p1.setPreco(200);
//        if (p.preco < 0.0) {
//            p.preco = 0.0;
//        }
        double precoAux = p1.getPreco();
        System.out.println("Produto 1: " + p1);
        System.out.println("Produto 2: " + p2);
        System.out.println("Produto 3: " + p3);
        
        
    }
    
}
