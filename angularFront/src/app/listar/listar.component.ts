import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';
import { Productos } from '../Modelo/Productos';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listar',
  standalone: true,
  imports: [],
  templateUrl: './listar.component.html',
  styleUrl: './listar.component.css'
})
export class ListarComponent implements OnInit{
  data: Productos[] = [];

  constructor(private apiService: ServiceService, private router: Router){}

  cargarDatos(){
    this.apiService.getData().subscribe(
      data => {
        this.data = data;
        console.log(this.data);
      }
    );
  }

  Editar(producto: Productos){
    localStorage.setItem("id", producto.id.toString());
    this.router.navigate(["edit"]);
  }

  Delete(producto: Productos){
    this.apiService.deleteProducto(producto).subscribe(
      data=>{
        this.data = this.data.filter(p=>p!==producto);
        alert("Usuario Eliminado");
      }
    )
  }

  ngOnInit(): void {
    this.cargarDatos();
  }

}
