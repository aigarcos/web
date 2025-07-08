package org.upn.edu.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.upn.edu.pe.model.Productos;
import org.upn.edu.pe.service.ProductosService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/productos")	// http://localhost:8080/api/productos
public class ProductosController {
	@Autowired
	private ProductosService productosService;
	
	// Aquí puedes agregar los endpoints para manejar las operaciones CRUD
	// Ejemplo: Obtener todos los productos
	@GetMapping
	public List<Productos> obtenerTodosLosProductos() {
		return productosService.obtenerTodosLosProductos();
	}
	
	// Ejemplo: Obtener un producto por su ID
	@GetMapping("/{id}")
	public Productos obtenerProductoPorId(@PathVariable Long id) {
		return productosService.obtenerProductoPorId(id);
	}
	
	// Ejemplo: Guardar un nuevo producto
	@PostMapping	
	public Productos guardarProducto(@RequestBody Productos producto) {
	 	return productosService.guardarProducto(producto);
	}
	
	// Ejemplo: Actualizar un producto existente
	@PutMapping("/{id}")
	public Productos actualizarProducto(@PathVariable Long id, @RequestBody Productos productoActualizado) {
		return productosService.actualizarProducto(id, productoActualizado);
	}
	
	// Ejemplo: Eliminar un producto por su ID
	@DeleteMapping("/{id}")
	public void eliminarProducto(@PathVariable Long id) {
		productosService.eliminarProducto(id);
	}
}
