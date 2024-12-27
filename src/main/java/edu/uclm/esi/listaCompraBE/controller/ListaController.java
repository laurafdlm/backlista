package edu.uclm.esi.listaCompraBE.controller;

import edu.uclm.esi.listaCompraBE.model.Lista;
import edu.uclm.esi.listaCompraBE.service.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listas")
public class ListaController {
    @Autowired
    private ListaService listaService;

    @PostMapping
    public Lista crearLista(@RequestBody Lista lista) {
        return listaService.crearLista(lista);
    }

    @GetMapping("/{propietario}")
    public List<Lista> obtenerListas(@PathVariable String propietario) {
        return listaService.obtenerListasPorPropietario(propietario);
    }

    @DeleteMapping("/{id}")
    public void eliminarLista(@PathVariable Long id) {
        listaService.eliminarLista(id);
    }
}
