/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author aluno.saolucas
 */
public class Usuario {
    private long pkUsuario;
    private String nomeDono;
    private String telefone;
    private String nomePet;
    private Date dataNasc;
    private boolean ativo;

    public Usuario(){};
    
    public Usuario(long pkUsuario, String nome, String email, 
            String senha, Date dataNasc, boolean ativo) {
        this.pkUsuario = pkUsuario;
        this.nomeDono = nomeDono;
        this.telefone = telefone;
        this.nomePet = nomePet;
        this.dataNasc = dataNasc;
        this.ativo = ativo;
    }
    
    public long getPkUsuario() {
        return pkUsuario;
    }

    public void setPkUsuario(long pkUsuario) {
        this.pkUsuario = pkUsuario;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nome) {
        this.nomeDono = nomeDono;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String email) {
        this.telefone = telefone;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String senha) {
        this.nomePet = nomePet;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public String ativoToString(){
        if(ativo == true){
            return "Ativo";
        }else{
            return "Inativo";
        }
    }
}
