package com.idat.Tarea.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Tarea.model.Items;

@Repository
public interface ItemRepository extends  JpaRepository<Items, Integer>{

}
