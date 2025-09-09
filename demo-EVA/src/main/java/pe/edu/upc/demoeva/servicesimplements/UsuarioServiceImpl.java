package pe.edu.upc.demoeva.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.demoeva.entities.Usuario;
import pe.edu.upc.demoeva.repositories.UsuarioRepository;
import pe.edu.upc.demoeva.servicesinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
    private final UsuarioRepository repo;
    public UsuarioServiceImpl(UsuarioRepository repo) { this.repo = repo; }

    @Override public Usuario insertar(Usuario u) { return repo.save(u); }
    @Override public List<Usuario> listar() { return repo.findAll(); }
}
