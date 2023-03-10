package com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.dao;

import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.entity.Cliente;
import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/*public interface IClienteDao extends CrudRepository<Cliente, Long> {
}*/
public interface IClienteDao extends JpaRepository<Cliente, Long> {//para la paginacion

    @Query("from Region")
    public List<Region> findAllRegiones();
}
