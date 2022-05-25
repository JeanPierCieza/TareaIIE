package com.idat.Tarea.service;

import java.util.List;


import com.idat.Tarea.model.Items;

public interface ItemService {
	
	void guardarItem(Items item);
	void actualizarItem(Items item);
	void eliminarItem(Integer id);
	List<Items> listarItems();
	Items obtenerItemId(Integer id);

}
