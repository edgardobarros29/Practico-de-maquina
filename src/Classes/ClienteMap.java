/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeMap;

/**
 *
 * @author edgar
 */
public class ClienteMap {
    Map <Long, Clientes> cliente;

    public ClienteMap() {
        cliente= new TreeMap(); 
    }

    public boolean agregarCliente(Clientes c){
        long dni= c.getDni();
        if(cliente.containsKey(dni))
        {
            return false;
        }
        else
        {
            cliente.put(dni, c);
            return true;
        }
    }
    
    public boolean eliminarCliente(long dni){
        if(cliente.remove(dni) != null){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean modificarCliente(Clientes c){
        long dni= c.getDni();
        if(cliente.containsKey(dni)){
            if(cliente.remove(dni)!= null){
                cliente.put(dni, c);
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
    public boolean buscarCliente(long dni){
        if(cliente.containsKey(dni)){
            return true;
        }
        else{
            return false;
        }
    }

    
    
}
