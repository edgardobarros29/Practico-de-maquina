package Classes;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Vicente
 */
public class Inventario {
     Map <String, Productos> registros;   
   
   public Inventario()
{
registros = new HashMap<> ();
}   
public boolean agregarProducto(Productos productoIn)
{
String nameIn = productoIn.getNombre();
if (registros.containsKey(nameIn))
{
return false;
}
else
{
registros.put(nameIn, productoIn); 
return true;
}
}
public boolean quitarProducto(String nameIn)
{
if (registros.remove(nameIn)!= null)
{
return true;
}
else
{
return false;
}
}
public boolean editContact(Productos productoIn)
{
 String name=productoIn.getNombre();
if (registros.containsKey(name))
{
if (registros.remove(name)!= null)
{
  registros.put(name, productoIn);
    return true;
}
else return false;
}
else return false;
}
public boolean buscarProducto(String nameIn)
{
if (registros.containsKey(nameIn))
{
return true;
}
else
{
return false;
}
}
public int getProductoTotal()
{
return registros.size();
}
public Productos getProducto (String nameIn)
{
return registros.get(nameIn);
}
public Set<Productos> getTodosLosProductos()
{
Set<Productos> productoSet = new HashSet<>();
registros.forEach((string,productos) -> productoSet.add(productos));
return productoSet; 
}    
}
