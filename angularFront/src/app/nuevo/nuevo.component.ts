import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../service.service';
import { Productos } from '../Modelo/Productos';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-nuevo',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './nuevo.component.html',
  styleUrl: './nuevo.component.css'
})
export class NuevoComponent implements OnInit{

  producto : Productos = new Productos();

  constructor(private router:Router, private service: ServiceService){}

  Guardar(producto: Productos){
    this.service.createProducto(producto).subscribe(
      data=>{
        console.log(producto);
        alert("Añadido Producto con éxito...");
        this.router.navigate(["listar"]);
      }
    )
  }

  ngOnInit(): void {

  }
}
