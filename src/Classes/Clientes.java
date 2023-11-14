/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author edgar
 */
public class Clientes {
    private String nombre;
    private String  apellido;
    private String email;
    private long celular;
    private String direccion; //nombre de la calle
    private int numero; // numero de la direccion
    private int cantMax;
    private int cant =-1;
    private Pedidos []p;
    private long dni;
                
    public Clientes (String nombre, String apellido, String email, long celular, String direccion, int numero, int cantMax, long dni){
	this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.direccion = direccion;
        this.numero= numero;
        this.cantMax = cantMax;
        p= new Pedidos[cantMax];
        this.dni=dni;
    }
              
    public Clientes (){}

    public void setNombre(String nombre){
	this.nombre=nombre;
    }
    public String getNombre(){
	return nombre;
    }

    public void setApellido(String apellido){
	this.apellido= apellido;
    }

    public String getApellido(){
	return apellido;
    }

    public void setEmail(String email){
	this.email = email;
    }

    public String getEmail(){
	return email;
    }

    public void setCelular(long celular){
        this.celular = celular;
    }

    public long getCelular(){
	return  celular;
    }

    public void setDireccion(String direccion){
	this.direccion = direccion;
    }

    public String getDireccion(){
	return direccion;
    }

    public void setNumero(int numero){
	this.numero= numero;
    }

    public int getNumero(){
	return numero;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Pedidos[] getP() {
        return p;
    }

    public void setP(Pedidos[] p) {
        this.p = p;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
    public void agregarPedido(Pedidos p1){
        if(cant<cantMax){
            cant ++;
            p[cant]=p1;
        }
    }
        
    public void productoMasVendidos(){
        int f=0, c=0, r=0;
        for(int i=0; i<cantMax; i++){
           if(p[i].getTipo() instanceof Frescos){
               f++;
           }
           else{
               if(p[i].getTipo() instanceof Congelados){
                   c++;
               }
               else{
                   r++;
               }
           }
        }
        if(f>c && f>r){
            System.out.println("El tipo de producto mas vendido es: Frescos" );
            System.out.println("El nombre del producto es: ");
        }
    }
}
