package edu.uclm.esi.listaCompraBE.model;

import jakarta.persistence.*;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private int cantidad;

    private boolean comprado = false;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public boolean isComprado() { return comprado; }
    public void setComprado(boolean comprado) { this.comprado = comprado; }
}
