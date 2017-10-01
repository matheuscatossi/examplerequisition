package br.petrobras.com.hackathonpetrobras.model;

/**
 * Created by matheuscatossi on 01/10/17.
 */

public class Locale {

    private String _id;
    private String COD_CLIENTE;
    private String NUM_CNPJ;
    private String NOM_RAZAO_SOCIAL;
    private String NOM_APELIDO;
    private String DSC_TIP_POSTO;
    private String NUM_TEL;
    private String END_CLIENTE;
    private String SGL_UF;
    private String NOM_CIDADE;
    private String NOM_BAIRRO;
    private String NUM_CEP;
    private String LONGITUDE;
    private String LATITUDE;

    public Locale() {

    }

    public Locale(String _id, String COD_CLIENTE, String NUM_CNPJ, String NOM_RAZAO_SOCIAL, String NOM_APELIDO, String DSC_TIP_POSTO,
                  String NUM_TEL, String END_CLIENTE, String SGL_UF, String NOM_CIDADE, String NOM_BAIRRO,
                    String NUM_CEP, String LONGITUDE, String LATITUDE) {

        this._id = _id;
        this.COD_CLIENTE = COD_CLIENTE;
        this.NUM_CNPJ = NUM_CNPJ;
        this.NOM_RAZAO_SOCIAL = NOM_RAZAO_SOCIAL;
        this.NOM_APELIDO = NOM_APELIDO;
        this.DSC_TIP_POSTO = DSC_TIP_POSTO;
        this.NUM_TEL = NUM_TEL;
        this.END_CLIENTE = END_CLIENTE;
        this.SGL_UF = SGL_UF;
        this.NOM_CIDADE = NOM_CIDADE;
        this.NUM_CEP = NUM_CEP;
        this.LONGITUDE = LONGITUDE;
        this.LATITUDE = LATITUDE;

    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCOD_CLIENTE() {
        return COD_CLIENTE;
    }

    public void setCOD_CLIENTE(String COD_CLIENTE) {
        this.COD_CLIENTE = COD_CLIENTE;
    }

    public String getNUM_CNPJ() {
        return NUM_CNPJ;
    }

    public void setNUM_CNPJ(String NUM_CNPJ) {
        this.NUM_CNPJ = NUM_CNPJ;
    }

    public String getNOM_RAZAO_SOCIAL() {
        return NOM_RAZAO_SOCIAL;
    }

    public void setNOM_RAZAO_SOCIAL(String NOM_RAZAO_SOCIAL) {
        this.NOM_RAZAO_SOCIAL = NOM_RAZAO_SOCIAL;
    }

    public String getNOM_APELIDO() {
        return NOM_APELIDO;
    }

    public void setNOM_APELIDO(String NOM_APELIDO) {
        this.NOM_APELIDO = NOM_APELIDO;
    }

    public String getDSC_TIP_POSTO() {
        return DSC_TIP_POSTO;
    }

    public void setDSC_TIP_POSTO(String DSC_TIP_POSTO) {
        this.DSC_TIP_POSTO = DSC_TIP_POSTO;
    }

    public String getNUM_TEL() {
        return NUM_TEL;
    }

    public void setNUM_TEL(String NUM_TEL) {
        this.NUM_TEL = NUM_TEL;
    }

    public String getEND_CLIENTE() {
        return END_CLIENTE;
    }

    public void setEND_CLIENTE(String END_CLIENTE) {
        this.END_CLIENTE = END_CLIENTE;
    }

    public String getSGL_UF() {
        return SGL_UF;
    }

    public void setSGL_UF(String SGL_UF) {
        this.SGL_UF = SGL_UF;
    }

    public String getNOM_CIDADE() {
        return NOM_CIDADE;
    }

    public void setNOM_CIDADE(String NOM_CIDADE) {
        this.NOM_CIDADE = NOM_CIDADE;
    }

    public String getNOM_BAIRRO() {
        return NOM_BAIRRO;
    }

    public void setNOM_BAIRRO(String NOM_BAIRRO) {
        this.NOM_BAIRRO = NOM_BAIRRO;
    }

    public String getNUM_CEP() {
        return NUM_CEP;
    }

    public void setNUM_CEP(String NUM_CEP) {
        this.NUM_CEP = NUM_CEP;
    }

    public String getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(String LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }

    public String getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(String LATITUDE) {
        this.LATITUDE = LATITUDE;
    }
}
