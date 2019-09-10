/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaluno;

/**
 *
 * @author Ricardo Trintin
 */
public class Aluno {
    
    private String nome;
    private String cpf;
    private int matricula;
    private int idade;
    private double notas[];
    
    public Aluno(){
        this.nome = "";
        this.cpf = "00.000.000-00";
        this.matricula = 0;
        this.idade = 0;
        this.notas = new double [4];
    }
    
    
    public void alteraNome(String nome){
        this.nome = nome;
    }
    
    //Function média 
    public double media(){
        double soma = 0;
        
        for(double nota: this.notas){
            soma += nota;
        }
        double media = soma / this.notas.length;
        
        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    
    
}