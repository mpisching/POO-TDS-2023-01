/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjexemplomembrosdeclasseseestaticos;

import javax.swing.JOptionPane;

/**
 *
 * @author mpisc
 */
public class PrjExemploMembrosDeClassesEEstaticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Funcionario f1 = new Funcionario(100, "Fulano de Tal", 12000, 1000);
//        Funcionario f2 = new Funcionario(101, "Ciclano de Tal", 14000, 1200);
//        Funcionario f3 = new Funcionario(102, "Beltrano de Tal", 18000, 5000);
//        Funcionario f1 = new Funcionario(100, "Fulano de Tal", 12000);
//        Funcionario f2 = new Funcionario(101, "Ciclano de Tal", 14000);
//        Funcionario f3 = new Funcionario(102, "Beltrano de Tal", 18000);
        
        Funcionario.setAuxilioAlimentacao(2300);
        
        System.out.println("Auxilio Alimentacao: " + Funcionario.getAuxilioAlimentacao());

//        print(f1);
//        print(f2);
//        print(f3);
    }

    private static void print(Funcionario f) {
        System.out.println("Funcionario: " + f);
    }
    
}
