/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author yuril
 */
public class Autor {
    //ATRIBUTOS
    private String nome;
    private int anoNasc;
    private String email;
    private Livro obra;
    private ArrayList <Livro> obras = new ArrayList<>();
    
    //CONSTRUTORES
    //VAZIO
    public Autor() {
    }
    //CHEIO
    public Autor(String nome, int anoNasc, String email, Livro obra) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.email = email;
        this.obra = obra;
    }
    
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Livro getObra() {
        return obra;
    }

    public void setObra(Livro obra) {
        this.obra = obra;
    }
    
    //MÉTODOS
    public void addObras(Livro objLivro){
        obras.add(objLivro);
    }
    
    public void listarObras(){
        for(int i = 0; i < obras.size(); i++){
            System.out.println("\nTítulo: " + obras.get(i).getTitulo() + "\nEditora: " + obras.get(i).getEditora() +
                               "\nAno : " + obras.get(i).getAno() + "\nEscritor: " + obras.get(i).getEscritor().nome);
        }
    }
}
