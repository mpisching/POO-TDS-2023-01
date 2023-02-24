/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiroprojeto;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author mpisc
 */
public class PrimeiroProjeto {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome...........: ");
        String nome = entrada.nextLine();
        System.out.print("Idade..........: ");
        int idade = Integer.parseInt(entrada.nextLine());
        System.out.print("Peso...........: ");
        float peso = Float.parseFloat(entrada.nextLine());
        System.out.print("Altura.........: ");
        float altura = Float.parseFloat(entrada.nextLine());        
        
        //dado o peso e a altura do indivíduo 
        //calcular o seu IMC, logo, classificar o IMC.
        float imc = calcularImc(peso, altura);
        
        String classificacao = classificarImc(imc);
        
        imprimir(nome, idade, peso, altura, imc, classificacao);        
    }
    
    /**
     * Rotina para calcular o IMC
     * @param peso
     * @param altura
     * @return float que é imc calculado
     */
    public static float calcularImc(float peso, float altura) {
        float imc = (float)(peso / Math.pow(altura, 2.0));
        return imc;
    }
    
    /**
      * Rotina para classificar o IMC
     * @param imc
     * @return String que é a classificação do imc
      */
//<editor-fold defaultstate="collapsed" desc="Método classificaImc">
    public static String classificarImc(float imc) {
        if (imc < 18.5) {
            return "Magreza - grau de obesidade 0";
        } else if (imc < 25) {
            return "Normal - grau de obesidade 0";
        } else if (imc < 30) {
            return "Sobrepeso - grau de obesidade I";
        } else if (imc < 40) {
            return "Obesidade - grau de obesidade II";
        } else {
            return "Obesidade grave - grau de obesidade III";
        }
    }
//</editor-fold>
    
    /**
     * Método para imprimir os dados do individuo, seu IMC e sua classificação
     * @param nome String
     * @param idade int
     * @param peso float
     * @param altura float
     * @param imc float 
     * @param classificacao String
     */
    private static void imprimir(String nome, int idade, float peso, float altura, float imc, String classificacao) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Nome............: " + nome + "\n" +
                           "Idade...........: " + idade + "\n" +
                           "Peso............: " + peso + "\n" +
                           "Altura..........: " + altura + "\n" + 
                           "IMC.............: " + df.format(imc) + "\n" +
                           "Classificação...: " + classificacao + "\n");
        
    }
}
