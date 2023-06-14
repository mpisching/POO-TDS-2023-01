/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjexemploexcecoes;

import domain.Funcionario;
import exception.SalarioException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mpisc
 */
public class PrjExemploExcecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        //exceção não verificada
//        int x = 10;
//        int y = 5;
//        int r = 0;
//        try {
//            r = x / y;
//        } catch (ArithmeticException exc) {
//            System.out.println("Tentativa de divisão por zero - é impossível");
//            System.out.println("Error Message: " + exc.getMessage());
//            System.out.println("Causa: " + exc.getCause());
//            System.out.println(exc.toString());
//        } catch (Exception exc) {
//            System.out.println("Houve uma falha desconhecida.");
//        } finally {
//            System.out.println("Liberando recursos do sistema");
//        }
//        System.out.println("R: " + r);
//        
//        int[] v = new int[5];
//        for (int i = 0; i <= 5; i++) {
//            try {
//                v[i] = i;
//            } catch (ArrayIndexOutOfBoundsException exc) {
//                System.out.println("fora dos limites do vetor");
//            }
//        } 
//        
//        //Date now = new Date();
//        String dataInvalida = "45/42/2017"; // mês 42???
//        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
//        formatoData.setLenient(false);
//        try {
//            Date dataParseada = formatoData.parse(dataInvalida);
//        } catch (ParseException ex) {
//            Logger.getLogger(PrjExemploExcecoes.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Message: " + ex.getMessage());
//            System.out.println("Data invalida ... " + dataInvalida);
//        }

        Funcionario f = new Funcionario();
        f.setMatricula(1);
        f.setNome("Fulano");
        try {
            f.setSalario(-1200);
        } catch (SalarioException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
