package com.jlm.springboot.app.item.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jlm.springboot.app.item.models.Producto;

@FeignClient(name="servicio-productos", url="localhost:8080")
public interface ProductoClienteRest {
	
	@GetMapping("/productos")
	public List<Producto> listar();
	
	@GetMapping("/producto/{id}")
	public Producto detalle(@PathVariable Long id);
	
}
