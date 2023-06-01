/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class PortaGiratoria extends Porta {
    private String eixo;
    
    public void fechar() {
        System.out.println("Fechando a porta " + this.getClass().getSimpleName());
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo a porta " +  this.getClass().getSimpleName());
    }

    @Override
    public void travar() {
        System.out.println("Travando a porta " +  this.getClass().getSimpleName());
    }

    @Override
    public void destravar() {
        System.out.println("Destravando a porta " +  this.getClass().getSimpleName());
    }
}
