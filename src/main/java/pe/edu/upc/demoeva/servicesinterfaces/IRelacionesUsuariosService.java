package pe.edu.upc.demoeva.servicesinterfaces;

import pe.edu.upc.demoeva.entities.RelacionesUsuarios;

import java.util.List;

public interface IRelacionesUsuariosService {
    public List<RelacionesUsuarios> list();
    public void insert(RelacionesUsuarios relacionesUsuarios);
}
