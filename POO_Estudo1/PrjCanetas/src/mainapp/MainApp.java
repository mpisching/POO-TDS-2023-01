/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

import entity.Caneta;

/**
 *
 * @author mpisc
 */
public class MainApp {
    
    public static void main(String[] args) {
        System.out.println("Executando programa...");
        Caneta c1; 
        
        c1 = new Caneta();
        //aluno2.matricula = Integer.parseInt(args[0]);
        //c1.setCor(args[0]);
        c1.cor = "preta";
        //c1.setMarca(args[1]);
        c1.setModelo("");
        c1.escrever("Programação orientada a objetos");
        c1.pintar();
        System.out.println(c1);
        
        mostrarDados(c1);
        
        Caneta c2 = new Caneta("Bic", "Esferográfica", "Preta", 100);
        Caneta c3 = new Caneta();
        
    }
    
    public static void outroMetodo() {
        Caneta c1 = new Caneta();
    }

    private static void mostrarDados(Caneta c1) {
        System.out.println(c1);
    }
}
