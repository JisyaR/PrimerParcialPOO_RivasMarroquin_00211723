package Tiposelectronicos;
import Electronico.ELectronico;
public abstract  class Tiposelectronicos extends ELectronico {

    private String codigo;

    private  String Ram;
    private  String procesador;
    private String pulgads;

    public  Tiposelectronicos(){
        super(codigo, nombre, fechaingreso);
    }

    public Tiposelectronicos(ELectronico electronico){super(electronico);}

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getPulgads() {
        return pulgads;
    }

    public void setPulgads(String pulgads) {
        this.pulgads = pulgads;
    }
}
