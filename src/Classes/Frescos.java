package Classes;

/*
 * @author Vicente
 */
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.Date;

public class Frescos extends Productos {
    private Date fechaEnvasado;
    private String paisOrigen;
   
 public Frescos(){
 this.fechaEnvasado = null;
    this.paisOrigen = null;
 } 

public Frescos (int codigo, String nombre,String descripcion,Date fechaCaducidad, int numeroDeLote,double precio,Date fechaEnvasado,String paisOrigen){
super(codigo, nombre,descripcion,fechaCaducidad,numeroDeLote,precio);
this.fechaEnvasado = fechaEnvasado;
this.paisOrigen = paisOrigen;
}
    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

}
