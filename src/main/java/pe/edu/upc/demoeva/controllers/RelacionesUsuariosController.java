package pe.edu.upc.demoeva.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demoeva.dtos.RelacionesUsuariosDTO;
import pe.edu.upc.demoeva.entities.RelacionesUsuarios;
import pe.edu.upc.demoeva.servicesinterfaces.IRelacionesUsuariosService;

import java.util.List;

@RestController
@RequestMapping("/RelacionesUsuarios")
public class RelacionesUsuariosController {

    @Autowired
    private IRelacionesUsuariosService iRelacionesUsuariosService;

    @PostMapping
    public void insertar(@RequestBody RelacionesUsuariosDTO u) {
        ModelMapper m = new ModelMapper();
        RelacionesUsuarios l = m.map(u, RelacionesUsuarios.class);
        iRelacionesUsuariosService.insert(l);
    }

    @GetMapping
    public List<RelacionesUsuarios> listar() { return iRelacionesUsuariosService.list(); }



}
