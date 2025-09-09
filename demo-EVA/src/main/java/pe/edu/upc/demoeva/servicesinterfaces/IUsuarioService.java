package pe.edu.upc.demoeva.servicesinterfaces;

import pe.edu.upc.demoeva.entities.Usuario;
import java.util.List;

public interface IUsuarioService {
    Usuario insertar(Usuario u);
    List<Usuario> listar();
}
