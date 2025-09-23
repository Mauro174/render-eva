package pe.edu.upc.demoeva.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demoeva.dtos.RelacionesUsuariosDTO;
import pe.edu.upc.demoeva.dtos.UsuarioDTO;
import pe.edu.upc.demoeva.entities.RelacionesUsuarios;
import pe.edu.upc.demoeva.servicesinterfaces.IRelacionesUsuariosService;

import java.util.List;

@RestController
@RequestMapping("/RelacionesUsuarios")
public class RelacionesUsuariosController {

    @Autowired
    private IRelacionesUsuariosService iRelacionesUsuariosService;

    @PostMapping
    public RelacionesUsuarios insertar(@RequestBody RelacionesUsuarios u) {
        return iRelacionesUsuariosService.insert(u);
    }

    @GetMapping
    public List<RelacionesUsuarios> listar() { return iRelacionesUsuariosService.list(); }

    @GetMapping("/{id}")
    public ResponseEntity<?> listarId(@PathVariable("id") Integer id) {
        RelacionesUsuarios soft = iRelacionesUsuariosService.ListId(id);
        if (soft == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("No existe un registro con el ID: " + id);
        }
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(soft, UsuarioDTO.class);
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable("id") Integer id) {
        RelacionesUsuarios s = iRelacionesUsuariosService.ListId(id);
        if (s == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No existe un registro con el ID: " + id);
        }
        iRelacionesUsuariosService.delete(id);
        return ResponseEntity.ok("Registro con ID " + id + " eliminado correctamente.");
    }

    @PutMapping
    public ResponseEntity<String> modificar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        RelacionesUsuarios s = m.map(dto, RelacionesUsuarios.class);

        // Validación de fecha
        //if (s.getPurchaseDate().isAfter(LocalDate.now())) {
        //    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        //            .body("La fecha de registro no puede ser futura. Valor recibido: " + s.getPurchaseDate());
        //}

        // Validación de existencia
        RelacionesUsuarios existente = iRelacionesUsuariosService.ListId(s.getIdRelacion());
        if (existente == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se puede modificar. No existe un registro con el ID: " + s.getIdRelacion());
        }

        // Actualización si pasa validaciones
        iRelacionesUsuariosService.update(s);
        return ResponseEntity.ok("Registro con ID " + s.getIdRelacion() + " modificado correctamente.");
    }


}
