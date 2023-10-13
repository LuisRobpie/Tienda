package com.Tienda.service.impl;

import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoria;
import com.Tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CategoriaServicesimpl implements CategoriaService{

    @Autowired
    private CategoriaDao categoriaDao;
    @Override
    public List<Categoria> getCategorias(boolean activo) {
        var categoria = categoriaDao.findAll();
    
    return categoria;
    }
    
}
