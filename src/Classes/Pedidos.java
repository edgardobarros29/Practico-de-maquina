/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.LocalDate;

/**
 *
 * @author edgar
 */
public class Pedidos {
    private Productos tipo;
    private int cantidad;
    private LocalDate pedido;
    private LocalDate entrega;
    private double total;
    
   public Pedidos (){} 

    public Pedidos(Productos tipo, int cantidad, LocalDate pedido, LocalDate entrega, double total) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.pedido = pedido;
        this.entrega = entrega;
        this.total = total;
    }

    public Productos getTipo() {
        return tipo;
    }

    public void setTipo(Productos tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getPedido() {
        return pedido;
    }

    public void setPedido(LocalDate pedido) {
        this.pedido = pedido;
    }

    public LocalDate getEntrega() {
        return entrega;
    }

    public void setEntrega(LocalDate entrega) {
        this.entrega = entrega;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
