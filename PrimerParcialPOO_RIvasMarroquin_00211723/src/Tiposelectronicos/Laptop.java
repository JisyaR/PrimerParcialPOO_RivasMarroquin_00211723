package Tiposelectronicos;
import Electronico.ELectronico;
public class Laptop extends Tiposelectronicos {

    public Laptop(ELectronico ELectronico, String codigo){}

    public Laptop(ELectronico eLectronico, String codigo, String Ram,String procesador){
        super(eLectronico);
        setCodigo(codigo);
        setRam(Ram);
        setProcesador(procesador);
    }



}
