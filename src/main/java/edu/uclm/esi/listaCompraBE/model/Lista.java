package edu.uclm.esi.listaCompraBE.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "listacomprabe_lista")

public class Lista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String propietario; // Email del propietario

    @ElementCollection
    private List<String> compartidoCon = new ArrayList<>(); // Usuarios con acceso

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Producto> productos = new ArrayList<>();

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPropietario() { return propietario; }
    public void setPropietario(String propietario) { this.propietario = propietario; }

    public List<String> getCompartidoCon() { return compartidoCon; }
    public void setCompartidoCon(List<String> compartidoCon) { this.compartidoCon = compartidoCon; }

    public List<Producto> getProductos() { return productos; }
    public void setProductos(List<Producto> productos) { this.productos = productos; }
}
