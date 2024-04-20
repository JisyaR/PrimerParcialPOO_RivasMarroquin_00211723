package Tiposelectronicos;
import Electronico.ELectronico;
public class Tv extends Tiposelectronicos {
    public  Tv(ELectronico ELectronico, String codigo){}

    public Tv(ELectronico eLectronico,String codigo,String pulgadas){
        super(eLectronico);
        setCodigo(codigo);
        setPulgads(pulgadas);
    }
}
