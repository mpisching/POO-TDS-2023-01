/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author mpisc
 */
public class Caneta {
    
    private String marca;
    private String modelo;
    public String cor;
    private int qtdCarga;
    
    public Caneta() {
        System.out.println("Criando uma caneta...");
    }

    public Caneta(String marca, String modelo, String cor, int qtdCarga) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.qtdCarga = qtdCarga;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdCarga() {
        return qtdCarga;
    }

    public void setQtdCarga(int qtdCarga) {
        this.qtdCarga = qtdCarga;
    }
    
    public void escrever(String msg) {
        System.out.println("Caneta escreve ... " + msg);
    }
    
    public void desenhar(String figura) {
        System.out.println("Caneta desenhando..." + figura);
    }
    
    public void pintar() {
        System.out.println("Caneta está pintando...");
    }

    @Override
    public String toString() {
        return "Caneta{" + "marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", qtdCarga=" + qtdCarga + '}';
    }


    
    
}
