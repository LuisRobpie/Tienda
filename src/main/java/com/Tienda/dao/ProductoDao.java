package com.Tienda.dao;

import com.Tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto,Long>{
    //lista de productos utilizando un metodo Query  
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf,
            double precioSup);
}
