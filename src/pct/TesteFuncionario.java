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
        //f.numMatricula= (33);
        f.setNumMatricula(33);
        //f.nome="Roberta";
        f.setNome("Roberta");
        //f.nivel='P';
        f.setNivel('P');
        //f.salario=3500.00;
        f.setSalario(3500.00);
        //f.afastado=false;
        f.setAfastado(false);
        
        //testando o metodo imprimirDados
            System.out.println("\n\t\t\t CLASSE FUNCIONÁRIO \n");
            f.imprimirDados();
            
            //imprimir desconto INSS
            f.calcularInss();
            
            //teste do metodo calcularINSS
            System.out.println("\n\t\t\t DESCONTO INSS \n");
            f.imprimirDados();
        
            //outroFuncionario - criacao instancia e construcao do outro funcionario
            Funcionario outroFuncionario = new Funcionario(21, "Mônica", 'S', 4700.00, false);
            
            //imprimindo outroFuncionario
            System.out.println("\n\t\t\t OUTRO FUNCIONÁRIO \n");
            outroFuncionario.imprimirDados();
        
    }
    
}
