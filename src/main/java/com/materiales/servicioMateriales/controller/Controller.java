
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.materiales.servicioMateriales.models.FechaMaterial;

import org.hibernate.annotations.common.util.impl.Log;
import org.hibernate.persister.collection.AbstractCollectionPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class Controller {

	@GetMapping("/FechaFabricacion")
    public Date getFechaFabricacion() {
        Date fecha = new Date(05/01/2023);
        return fecha;
    }
	
    @GetMapping("/FechaMateriales")
    public List<FechaMaterial> getFechaMateriales() {
        
        Date fecha = new Date(01/01/2023);
        FechaMaterial f = new FechaMaterial(fecha, "vidrio");
        
        Date fecha2 = new Date(01/01/2023);
        FechaMaterial f2 = new FechaMaterial(fecha2, "plastico");
        
        Date fecha3 = new Date(01/01/2023);
        FechaMaterial f3 = new FechaMaterial(fecha3, "papel");
       
        Date fecha4 = new Date(01/01/2023);
        FechaMaterial f4 = new FechaMaterial(fecha4, "plastiquito");
        
        List<FechaMaterial> lista = new ArrayList<FechaMaterial>();
        lista.add(f);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);
        
        return lista;
    }
    

	@GetMapping(path="/login")
	public ResponseEntity<String> login(@RequestBody String postPayload) {
		System.out.println("ENTRA");
		System.out.println(postPayload);
		System.out.println("SALE");
		return ResponseEntity.ok("RETORNO");
	}
	
}


