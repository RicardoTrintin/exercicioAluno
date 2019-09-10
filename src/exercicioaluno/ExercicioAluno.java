/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaluno;

import java.util.Scanner;

/**
 *
 * @author Ricardo Trintin
 */
public class ExercicioAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Aluno aluno = new Aluno();
        Scanner read = new Scanner(System.in);
        int menu = 0;
        String nomeTurma = "";
        int qtdTurma = 0;
        
        
        System.out.println("1 - criar turma");
        System.out.println("2 - sair");
        System.out.println("");
        System.out.println("Escolha uma das opçoes");
        menu = read.nextInt();
        
        if (menu == 1){
            System.out.print("Digite o nome da turma: ");
            nomeTurma = read.next();
            System.out.print("Quantos alunos existitiram nesta turma: ");
            qtdTurma = read.nextInt();
            
            Turma turma = new Turma(qtdTurma, nomeTurma);
        }else {
            System.exit(0);
        }
        
    }
    
}
