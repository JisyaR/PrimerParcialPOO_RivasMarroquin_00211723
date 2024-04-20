package Electronico;
import java.util.Date;
public class ELectronico {
    private String codigo;
    private String nombre;
    private String fechaingreso;

    public ELectronico(String codigo, String nombre, Date fechaingreso){}

    public ELectronico(String codigo,String nombre,String fechaingreso){
        this.codigo= codigo;
        this.nombre = nombre;
        this.fechaingreso = fechaingreso;
    }
    public ELectronico(ELectronico eLectronico){
        codigo = eLectronico.codigo;
        nombre = eLectronico.nombre;
        fechaingreso = eLectronico.fechaingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
