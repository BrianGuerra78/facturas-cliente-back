package com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.services;

import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.dao.IClienteDao;
import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.dao.IFacturaDao;
import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.dao.IProductoDao;
import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.entity.Cliente;

import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.entity.Factura;
import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.entity.Producto;
import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.entity.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService{
    @Autowired
    private IClienteDao clienteDao;

    @Autowired
    private IFacturaDao facturaDao;

    @Autowired
    private IProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Cliente> findAll(Pageable pageable) {//paginacion
        return  clienteDao.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
      clienteDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Region> findAllRegiones() {
        return clienteDao.findAllRegiones();
    }

    @Override
    @Transactional(readOnly = true)
    public Factura findFacturaById(Long id) {
        return facturaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Factura saveFactura(Factura factura) {
        return facturaDao.save(factura);
    }

    @Override
    @Transactional
    public void deleteFacturaById(Long id) {
        facturaDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findProductoByNombre(String term) {
        //return productoDao.findByNombreStartingWithIgnoreCase(term);
        //return productoDao.findByNombre(term);
        return  productoDao.findByNombreContainingIgnoreCase(term);
    }
}
