/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjsolucaoatividadea1ea2_sistemalavacao;

import entity.Cor;
import entity.Marca;
import entity.Modelo;
import entity.Veiculo;

/**
 *
 * @author mpisc
 */
public class PrjSolucaoAtividadeA1eA2_SistemaLavacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marca marca1 = new Marca();
        marca1.setId(1);
        marca1.setNome("Ford");
        Marca marca2 = new Marca("VW");
        marca2.setId(2);
        Marca marca3 = new Marca("GM");
        marca3.setId(3);
        
        exibir(marca1);
        exibir(marca2);
        
        Modelo modelo1 = new Modelo();
        modelo1.setId(1);
        modelo1.setDescricao("Fusca");
        modelo1.setMarca(marca2);
        
        Modelo modelo2 = new Modelo("Fusion", marca1);
        modelo2.setId(2);
        
        Modelo modelo3 = new Modelo("S10", marca3);
        modelo3.setId(3);
        
        Modelo modelo4 = new Modelo("Ranger", marca1);
        modelo4.setId(4);
        
        exibir(modelo1);
        exibir(modelo2);
        exibir(modelo3);
        exibir(modelo4);
        
        Cor cor1 = new Cor("Azul");
        cor1.setId(1);
        Cor cor2 = new Cor("Vermelho");
        cor2.setId(2);
        
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setId(1);
        veiculo1.setPlaca("aaa-1111");
        veiculo1.setObservacoes("Nenhuma");
        veiculo1.setModelo(modelo4);
        veiculo1.setCor(cor2);
        
        exibir(veiculo1);
    }
    
    public static void exibir(Marca m) {
        System.out.println("ID: " + m.getId());
        System.out.println("Nome: " + m.getNome());
    }

    public static void exibir(Modelo m) {
        System.out.println("ID: " + m.getId());
        System.out.println("Descricao: " + m.getDescricao());
        System.out.println("Marca: " + m.getMarca().getNome());
        //exibir(m.getMarca());
    } 
    
    public static void exibir(Veiculo v) {
        System.out.println("Dados do veículo");
        System.out.println("Id: " + v.getId());
        System.out.println("Placa: " + v.getPlaca());
        System.out.println("Observacoes: " + v.getObservacoes());
        System.out.println("Marca: " + v.getModelo().getMarca().getNome());
        System.out.println("Modelo: " + v.getModelo().getDescricao());
        System.out.println("Cor: " + v.getCor().getNome());
    }
            
}
