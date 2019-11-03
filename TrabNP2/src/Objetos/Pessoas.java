/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author guilherme
 */
public abstract class Pessoas {

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNasc
     */
    public Date getDataNasc() {
        Date d = Date.valueOf(this.dataNasc.toString());
        return d;
    }

    /**
     * @param dataNasc the dataNasc to set
     */
    public void setDataNasc(GregorianCalendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }
    private String cpf;
    private String nome;
    private GregorianCalendar dataNasc;
    private String rg;
    
    public int calculaIdade(){
        GregorianCalendar hoje;
        hoje = new GregorianCalendar();
        
        int diaHoje = hoje.get(Calendar.DAY_OF_YEAR);
        int diaAniversario = this.dataNasc.get(Calendar.DAY_OF_YEAR);
        int anoHoje = hoje.get(Calendar.YEAR);
        int anoNascimento = this.dataNasc.get(Calendar.YEAR);
        
        if(diaHoje>diaAniversario){
            //ainda não fez aniversario esse ano
            //então considera o ano anterior pro calculo de idade
            anoHoje--;
        }       
        
        
        return anoHoje - anoNascimento;
    }
    
}
