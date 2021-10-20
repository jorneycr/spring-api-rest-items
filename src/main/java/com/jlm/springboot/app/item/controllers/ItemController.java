package com.jlm.springboot.app.item.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jlm.springboot.app.item.models.Item;
import com.jlm.springboot.app.item.models.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	@Qualifier("ItemServiceFeign")
//	@Qualifier("ItemServiceImpl") //selecionar inyeccion
	private ItemService itemService;
	
	@GetMapping("/productos")
	public List<Item> listar(){
		return itemService.findAll();
	}
	
	@GetMapping("/producto/{id}/cantidad/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return itemService.finById(id, cantidad);
	}
}
