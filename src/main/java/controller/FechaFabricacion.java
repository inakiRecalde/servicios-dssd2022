package controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FechaFabricacion {

	
	@GetMapping("/FechaFabricacion")
    public Date getFechaFabricacion() {
        System.out.println("entra!!!!!!!!!!!!!!");
        Date fecha = new Date(05/01/2023);
        return fecha;
    }
	
}
