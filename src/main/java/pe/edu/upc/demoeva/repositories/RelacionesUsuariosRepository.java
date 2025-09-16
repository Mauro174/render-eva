package pe.edu.upc.demoeva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demoeva.entities.RelacionesUsuarios;

@Repository
public interface RelacionesUsuariosRepository extends JpaRepository<RelacionesUsuarios,Integer> {
}
