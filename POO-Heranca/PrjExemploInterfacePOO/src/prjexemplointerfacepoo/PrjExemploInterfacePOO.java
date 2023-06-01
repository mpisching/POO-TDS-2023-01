/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjexemplointerfacepoo;

import domain.IAbertura;
import domain.Janela;
import domain.Porta;
import domain.PortaCorrer;
import domain.PortaGiratoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mpisc
 */
public class PrjExemploInterfacePOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Porta p1 = new PortaGiratoria();
        Porta p2 = new PortaCorrer();
        
        List<IAbertura> portas = new ArrayList<>();
        
        portas.add(p1);
        portas.add(p2);
        
        List<IAbertura> janelas = new ArrayList<>();
        janelas.add(new Janela());
        janelas.add(new Janela());
        janelas.add(new Janela());
        
        realizarAbertura(portas);
        realizarAbertura(janelas);
        //realizarFechamento(portas);
    }
    
//    public static void realizarAbertura(List<Porta> portas) {
//        for (Porta p: portas) {
//            p.abrir();
//        }
//    }
//    public static void realizarAbertura(List<Janela> janelas) {
//        for (Janela j: janelas) {
//            j.abrir();
//        }
//    }    
    
    public static void realizarAbertura(List<IAbertura> aberturas) {
        for (IAbertura a: aberturas) {
            a.abrir();
        }
    }    
    
    public static void realizarFechamento(List<Porta> portas) {
        for (Porta p: portas) {
            p.fechar();
        }
    }
    
    
}
