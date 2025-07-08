package org.upn.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.upn.edu.pe.model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Long> {
	// Aquí puedes agregar métodos personalizados si es necesario
	// Métodos heredados de JpaRepository:
	// List<Productos> findAll();				-> obtiene todos los productos
	// Optional<Productos> findById(Long id);	-> obtiene un producto por su ID
	// Productos save(Productos producto);		-> guarda un producto (insertar o actualizar)
	// void deleteById(Long id);				-> elimina un producto por su ID
}
