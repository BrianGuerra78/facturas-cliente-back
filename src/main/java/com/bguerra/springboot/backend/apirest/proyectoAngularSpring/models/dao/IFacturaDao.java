package com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.dao;

import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Factura, Long> {
}
