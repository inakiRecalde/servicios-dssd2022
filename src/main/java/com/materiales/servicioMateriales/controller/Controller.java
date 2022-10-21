package com.materiales.servicioMateriales.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.materiales.servicioMateriales.models.FechaMaterial;

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
}
