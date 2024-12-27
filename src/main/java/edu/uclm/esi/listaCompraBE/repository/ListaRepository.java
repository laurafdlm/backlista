package edu.uclm.esi.listaCompraBE.repository;

import edu.uclm.esi.listaCompraBE.model.Lista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ListaRepository extends JpaRepository<Lista, Long> {
    List<Lista> findByPropietario(String propietario);
}
