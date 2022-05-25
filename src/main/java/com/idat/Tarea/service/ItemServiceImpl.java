package com.idat.Tarea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.idat.Tarea.model.Items;
import com.idat.Tarea.repository.ItemRepository;


@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository repository;

	@Override
	public void guardarItem(Items item) {
		// TODO Auto-generated method stub
		repository.save(item);

	}

	@Override
	public void actualizarItem(Items item) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(item);

	}

	@Override
	public void eliminarItem(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public List<Items> listarItems() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Items obtenerItemId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
