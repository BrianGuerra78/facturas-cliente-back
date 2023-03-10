package com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.services;

import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.entity.Cliente;
import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.entity.Factura;
import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.entity.Producto;
import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IClienteService {
    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);

    public List<Region> findAllRegiones();

    public Factura findFacturaById(Long id);

    public Factura saveFactura(Factura factura);

    public void deleteFacturaById(Long id);

    public List<Producto> findProductoByNombre(String term);
}
