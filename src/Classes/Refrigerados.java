package Classes;

/*
 * @author Vicente
 */
import Classes.Productos;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.Date;
public class Refrigerados extends Productos {
    private String codOrganismo;
    
    public Refrigerados(){}
    
    public Refrigerados (int codigo, String nombre,String descripcion, Date fechaCaducidad, int numeroDeLote,double precio,String codOrganismo){
    super(codigo, nombre,descripcion,fechaCaducidad,numeroDeLote,precio);
    this.codOrganismo = codOrganismo;
}
    
    public String getCodOrganismo() {
        return codOrganismo;
    }

    public void setCodOrganismo(String codOrganismo) {
        this.codOrganismo = codOrganismo;
    }
}
