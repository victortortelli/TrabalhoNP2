/*
INACABADA
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author guilherme
 */
public class Paciente extends Pessoas{

    /**
     * @return the dificiencia
     */
    public String getDificiencia() {
        return dificiencia;
    }

    /**
     * @param dificiencia the dificiencia to set
     */
    public void setDificiencia(String dificiencia) {
        this.dificiencia = dificiencia;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the cartaoSUS
     */
    public String getCartaoSUS() {
        return cartaoSUS;
    }

    /**
     * @param cartaoSUS the cartaoSUS to set
     */
    public void setCartaoSUS(String cartaoSUS) {
        this.cartaoSUS = cartaoSUS;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the escola
     */
    public String getEscola() {
        return escola;
    }

    /**
     * @param escola the escola to set
     */
    public void setEscola(String escola) {
        this.escola = escola;
    }

    /**
     * @return the consultas
     */
    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
    private String cartaoSUS;
    private String endereco;
    private String bairro;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String ddd;
    private String telefone;
    private String escola;
    private String dificiencia;
    private String cor;
    private String sexo;
    private ArrayList<Consulta> consultas;
    
    public void listarConsultas(){
        //fazer dps
    }

    /**
     * @return the ddd
     */
    public String getDdd() {
        return ddd;
    }

    /**
     * @param ddd the ddd to set
     */
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
