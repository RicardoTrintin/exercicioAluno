/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaluno;

import java.util.ArrayList;

/**
 *
 * @author Ricardo Trintin
 */
public class Aluno {
    
    private String nome;
    private String cpf;
    private int matricula;
    private LocalDate dataNascimento;
    private ArrayList<NotaAluno>notas;
    
    public Aluno(ArrayList notas){
        this.nome = "";
        this.cpf = "00.000.000-00";
        this.matricula = 0;
        this.notas = notas;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<NotaAluno> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<NotaAluno> notas) {
        this.notas = notas;
    }
    
    
   
    
    
    
}
