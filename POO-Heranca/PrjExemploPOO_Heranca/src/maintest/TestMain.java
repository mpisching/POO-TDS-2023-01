/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maintest;

import domain.Fornecedor;
import domain.Internacional;
import domain.Nacional;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author mpisc
 */
public class TestMain {
    public static void main(String[] args) {
        //Fornecedor f = new Fornecedor();
        List<Fornecedor> lista = new ArrayList<>();
        
        Fornecedor fornecedor = new Nacional();
        fornecedor.setDataCadastro(LocalDate.now());
        fornecedor.setId(10);
        fornecedor.setNome("Faber Castel");
        fornecedor.setEmail("faber@faber.castell.com.br");
        fornecedor.setFone("11-33239899");
        ((Nacional)fornecedor).setCnpj("11111111111");
        lista.add(fornecedor);
        
        fornecedor = new Nacional();
        fornecedor.setDataCadastro(LocalDate.now());
        fornecedor.setId(1444);
        fornecedor.setNome("Outro");
        fornecedor.setEmail("outro@outro.com.br");
        fornecedor.setFone("11-2342345239");
        ((Nacional)fornecedor).setCnpj("12312312313");
        lista.add(fornecedor);
        
        Fornecedor fornecedor2 = new Internacional();
        fornecedor2.setDataCadastro(LocalDate.of(2023, 05, 03));
        fornecedor2.setId(13);
        fornecedor2.setNome("Vieira");
        fornecedor2.setEmail("vieira@vieira.com.br");
        fornecedor2.setFone("11-2342399");
        ((Internacional)fornecedor2).setNif("2342342342");
        ((Internacional)fornecedor2).setPais("China");
        //if (fornecedor2 instanceof Nacional) {
        lista.add(fornecedor2);
        //}
        
        //print(lista);
        
        printAprimorado(lista);
        
        
        //print(fornecedor);
        
        
//        fornecedor = new Internacional();
//        fornecedor.setEmail("novoforn@ifsc.edu.br");
//        fornecedor.setFone("23423");
//        fornecedor.setNome("Novo Fornecedor");
//        fornecedor.setId(11);
//        ((Internacional)fornecedor).setNif("34343");
//        ((Internacional)fornecedor).setPais("Paraguai");
//        
//        print(fornecedor);
        
    }
    
    public static void print(Fornecedor fornecedor) {
        System.out.println(fornecedor);
    }
    
    public static void print(List<Fornecedor> lista) {
        for (Fornecedor f : lista) {
            System.out.println(f);
        }
    }
    
    public static void printAprimorado(List<Fornecedor> lista) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (Fornecedor f: lista) {
            System.out.println("Tipo de fornecedor --> " + 
                    f.getClass().getSimpleName());
            System.out.println("Nome..............: " + f.getNome());
//            System.out.println("Data de cadastro..: " + f.getDataCadastro());
            
            System.out.println("Data de cadastro..: " + f.getDataCadastro().format(formatador));
            if (f instanceof Nacional) {
                System.out.println("CNPJ..........: " + ((Nacional)f).getCnpj());
            } else {
                System.out.println("NIF...........: " + ((Internacional)f).getNif() 
                    + " - " + ((Internacional)f).getPais());
            }
        }
    }
    
//    public static void print(Nacional nacional) {
//        System.out.println("Fornecedor Nacional: " + nacional.toString());
//    }
//    
//    public static void print(Internacional internacional) {
//        System.out.println("Fornecedor Internacional: " + internacional.toString());
//    }
}
