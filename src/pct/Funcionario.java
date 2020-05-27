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
    
           //atributos da classe Funcionario
    int numMatricula;
    String nome;
    char nivel; // T | J | P | S
    double salario;
    boolean afastado;
    
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
    
}
