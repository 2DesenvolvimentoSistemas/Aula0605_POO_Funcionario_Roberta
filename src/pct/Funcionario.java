/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author ROBERTA
 */
public class Funcionario {

    public Funcionario(int numMatricula, String nome, char nivel, double salario, boolean afastado) {
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.nivel = nivel;
        this.salario = salario;
        this.afastado = afastado;
    }

    public Funcionario() {
    }
    
    
           //atributos da classe Funcionario
    private int numMatricula;
    private String nome;
    private char nivel; // T | J | P | S
    private double salario;
    private boolean afastado;
    
    public void imprimirDados (){
        
        //métodos
        System.out.println("Número de matrícula: "+ numMatricula);
        System.out.println("Nome: "+ nome);
        System.out.println("Nível: "+nivel);
        System.out.println("Salário: "+salario);
        System.out.println(afastado? "Afastado" : "Ativo");
        
    }
    
    public void calcularInss (){

        //calculo do desconto de 10%
        this.salario *= 0.9;

    
}

    public int getNumMatricula() {
        return numMatricula;
    }

    public String getNome() {
        return nome;
    }

    public char getNivel() {
        return nivel;
    }

    public double getSalario() {
        return salario;
    }

    public boolean isAfastado() {
        return afastado;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAfastado(boolean afastado) {
        this.afastado = afastado;
    }
    
}
