import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Productos } from '../Modelo/Productos';
import { Router, ActivatedRoute } from '@angular/router';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-editar',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './editar.component.html',
  styleUrl: './editar.component.css'
})
export class EditarComponent implements OnInit{
  producto! : Productos;
  constructor(private router:Router, private service: ServiceService){}

  Editar(){
      let id = localStorage.getItem('id');
      this.service.getProductoId(1).subscribe(
        data=>{
          this.producto = data;
        }
      )
  }

  Guardar(producto: Productos){
    this.service.updateProducto(producto).subscribe(
      data=>{
        this.producto = data;
        alert("Producto Modificado con éxito...");
        this.router.navigate(["listar"]);
      }
    )
  }

  ngOnInit(): void {
    this.Editar();
  }
}
