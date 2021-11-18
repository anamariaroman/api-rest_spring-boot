package com.prueba.api.empleados;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.api.design.Empleado;

@RestController
@RequestMapping("empleados")
public class EmpleadosRest {
	
	@GetMapping
	public ResponseEntity<List<Empleado>> getEmpleado(){
		
		return null;
		//return ResponseEntity.ok(empleado);
	}
	
	//@GetMapping
	//@RequestMapping(value="hello", method=RequestMethod.GET)
	public String hello() {
		return "Hello World";
	}
}
