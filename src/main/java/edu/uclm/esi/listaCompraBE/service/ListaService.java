package edu.uclm.esi.listaCompraBE.service;

import edu.uclm.esi.listaCompraBE.model.Lista;
import edu.uclm.esi.listaCompraBE.repository.ListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListaService {
    @Autowired
    private ListaRepository listaRepository;

    public Lista crearLista(Lista lista) {
        return listaRepository.save(lista);
    }

    public List<Lista> obtenerListasPorPropietario(String propietario) {
        return listaRepository.findByPropietario(propietario);
    }

    public void eliminarLista(Long id) {
        listaRepository.deleteById(id);
    }
}
