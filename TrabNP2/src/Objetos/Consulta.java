/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author guilherme
 */
public class Consulta {

    /**
     * @return the urgente
     */
    public int getUrgente() {
        return urgente;
    }

    /**
     * @param urgente the urgente to set
     */
    public void setUrgente(int urgente) {
        this.urgente = urgente;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the situacao
     */
    public int getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }
    
    //private GregorianCalendar data;
    private Date data;
    private String hora; //ta pegando a hora no construtor
    private int situacao;//0 - fechado, 1 - em andamento e 2- aberto
    private int urgente;
    private int numero;
    
    public Consulta(){
        //--*
        //pegando a hora atual
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat();
        Calendar cal = Calendar.getInstance();
        
        //esses numeros eu peguei da internet nao sei o que significam
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 23);
        cal.set(Calendar.SECOND,15);
        
        this.hora = sdf.format(cal.getTime());
        //*--
        
    }
    
}