package pe.edu.upc.demoeva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demoeva.entities.Usuario;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findOneByNombreUsuario(String username);
    @Query("select s from Usuario s where s.emailUsuario like %:eUsuario%")
    public List<Usuario> buscar(@Param("eUsuario") String eUsuario );

}
