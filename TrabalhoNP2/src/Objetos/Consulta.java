/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author guilherme
 */
public class Consulta {

    /**
     * @return the data
     */
    public GregorianCalendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(GregorianCalendar data) {
        this.data = data;
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

    /**
     * @return the urgencia
     */
    public int getUrgencia() {
        return urgencia;
    }

    /**
     * @param urgencia the urgencia to set
     */
    public void setUrgencia(int urgencia) {
        this.urgencia = urgencia;
    }
    private GregorianCalendar data;
    private String hora; //ta pegando a hora no construtor
    private int situacao;//0 - fechado, 1 - em andamento e 2- aberto
    private int urgencia;
    Diagnostico diagnostico;
    
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