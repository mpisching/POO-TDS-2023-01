/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import exception.SalarioException;

/**
 *
 * @author mpisc
 */
public class Funcionario {
    private int matricula;
    private String nome;
    private double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws SalarioException {
        if (salario > 0.0) {
            this.salario = salario; 
        } else  {
            throw new SalarioException("O salário não pode ser negativo.");
        }
    }
    
    
}
