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
public class TesteFuncionario {
    
        //criacao do metodo main
        public static void main(String[] args) {
        
        //criacao e instancia do objeto funcionario
        Funcionario f = new Funcionario();
        
        //criacao do objeto
        f.numMatricula=10;
        f.nome="Roberta";
        f.nivel='P';
        f.salario=3500.00;
        f.afastado=false;
        
        //testando o metodo imprimirDados
            System.out.println("\n\t\t\t CLASSE FUNCIONÁRIO \n");
            f.imprimirDados();
            
            //imprimir desconto INSS
            f.calcularInss();
            
            //teste do metodo calcularINSS
            System.out.println("\n\t\t\t DESCONTO INSS \n");
            f.imprimirDados();
        
        
    }
    
}
