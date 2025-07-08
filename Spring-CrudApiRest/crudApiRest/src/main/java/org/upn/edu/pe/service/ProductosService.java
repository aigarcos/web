package org.upn.edu.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.upn.edu.pe.model.Productos;
import org.upn.edu.pe.repository.ProductosRepository;

@Service
public class ProductosService {
	
	@Autowired
	private ProductosRepository productosRepository;
	
	// Método para obtener todos los productos
	public List<Productos> obtenerTodosLosProductos() {
		return productosRepository.findAll();
	}
	
	// Método para obtener un producto por su ID
	public Productos obtenerProductoPorId(Long id) {
		return productosRepository.findById(id).orElse(null);
	}
	
	// Método para guardar un nuevo producto
	public Productos guardarProducto(Productos producto) {
		return productosRepository.save(producto);
	}
	
	// Método para actualizar un producto existente
	public Productos actualizarProducto(Long id, Productos productoActualizado) {
		if (productosRepository.existsById(id)) {
			productoActualizado.setId(id);
			return productosRepository.save(productoActualizado);
		}
		return null; // O lanzar una excepción si el producto no existe
	}
	
	// Método para eliminar un producto por su ID
	public void eliminarProducto(Long id) {
		if (productosRepository.existsById(id)) {
			productosRepository.deleteById(id);
		} else {
			// O lanzar una excepción si el producto no existe
			throw new RuntimeException("Producto no encontrado con ID: " + id);
		}
	}
}
