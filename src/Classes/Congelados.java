package Classes;

/**
 *
 * @author Vicente
 */
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.Date;


public class Congelados extends Productos{
     private double tempRecomendada;
     public Congelados(){}
     
    public Congelados (int codigo, String nombre,String descripcion, Date fechaCaducidad, int numeroDeLote,double precio,double tempRecomendada){
    super(codigo, nombre,descripcion,fechaCaducidad,numeroDeLote,precio);
    this.tempRecomendada = tempRecomendada;
}

    public double getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(double tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }
}
