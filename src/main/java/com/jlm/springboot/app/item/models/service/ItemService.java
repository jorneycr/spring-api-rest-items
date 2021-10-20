package com.jlm.springboot.app.item.models.service;

import java.util.List;

import com.jlm.springboot.app.item.models.Item;

public interface ItemService {

	public List<Item> findAll();

	public Item finById(Long id, Integer cantidad);
}
