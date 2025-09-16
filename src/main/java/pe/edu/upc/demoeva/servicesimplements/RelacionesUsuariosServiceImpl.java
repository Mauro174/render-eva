package pe.edu.upc.demoeva.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demoeva.entities.RelacionesUsuarios;
import pe.edu.upc.demoeva.repositories.RelacionesUsuariosRepository;
import pe.edu.upc.demoeva.servicesinterfaces.IRelacionesUsuariosService;

import java.util.List;


@Service
public class RelacionesUsuariosServiceImpl implements IRelacionesUsuariosService {
    @Autowired
    private RelacionesUsuariosRepository repo;

    @Override
    public List<RelacionesUsuarios> list(){ return repo.findAll(); }

    @Override
    public void insert(RelacionesUsuarios relacionesUsuarios){ repo.save(relacionesUsuarios); }


}
