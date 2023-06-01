/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class Janela implements IAbertura, IFechadura {
    public void fechar() {
        System.out.println("Fechando a janela " + this.getClass().getSimpleName());
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo a janela " +  this.getClass().getSimpleName());
    }

    @Override
    public void travar() {
        System.out.println("Travando a janela " +  this.getClass().getSimpleName());
    }

    @Override
    public void destravar() {
        System.out.println("Destravando a janela " +  this.getClass().getSimpleName());
    }    
}
