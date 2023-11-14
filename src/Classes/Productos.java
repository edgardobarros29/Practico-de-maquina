package Classes;

/*
 * @author Vicente
 */
import java.io.Serializable;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.Date;

public abstract class Productos implements Serializable {

private int codigo;
private String nombre;
private String descripcion;
private Date fechaCaducidad; // buscar definirla como string
private int numeroDeLote;
private  double precio;
    
public Productos (){}

public Productos (int codigo, String nombre,String descripcion,Date fechaCaducidad, int numeroDeLote,double precio){
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.fechaCaducidad = fechaCaducidad;
    this.numeroDeLote = numeroDeLote;
    this.precio = precio;
    this.codigo= codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public int getNumeroDeLote() {
        return numeroDeLote;
    }
    public void setNumeroDeLote(int numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
