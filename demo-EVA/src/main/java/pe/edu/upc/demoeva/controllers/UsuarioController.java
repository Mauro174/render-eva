package pe.edu.upc.demoeva.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demoeva.entities.Usuario;
import pe.edu.upc.demoeva.servicesinterfaces.IUsuarioService;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final IUsuarioService service;
    public UsuarioController(IUsuarioService service) { this.service = service; }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario insertar(@RequestBody Usuario u) { return service.insertar(u); }

    @GetMapping
    public List<Usuario> listar() { return service.listar(); }
}
