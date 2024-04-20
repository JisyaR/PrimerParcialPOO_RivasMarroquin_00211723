package Tiposelectronicos;
import Electronico.ELectronico;
public class Telefono extends Tiposelectronicos {

    public Telefono(){}

    public Telefono(ELectronico eLectronico,String codig){
        super(eLectronico);
        setCodigo(codig);
    }

}
