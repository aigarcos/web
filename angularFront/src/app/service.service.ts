import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Productos } from './Modelo/Productos';

@Injectable({
  providedIn: 'root'
})

export class ServiceService {
private url = '/api/productos';

  constructor(private http: HttpClient) { }

  public getData() : Observable<any>{
    return this.http.get<Productos[]>(this.url);
  }

  public createProducto(producto: Productos){
    return this.http.post<Productos>(this.url, producto);
  }

  public getProductoId(id:number){
    return this.http.get<Productos>(this.url+"/"+id);
  }

  public updateProducto(producto:Productos){
    return this.http.put<Productos>(this.url+"/"+producto.id,producto);
  }

  public deleteProducto(producto: Productos){
    return this.http.delete<Productos>(this.url+"/"+producto.id);
  }
}
