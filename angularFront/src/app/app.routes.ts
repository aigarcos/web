import { Routes } from '@angular/router';
import { ListarComponent } from './listar/listar.component';
import { NuevoComponent } from './nuevo/nuevo.component';
import { EditarComponent } from './editar/editar.component';

export const routes: Routes = [
  {
    path:'listar',
    component: ListarComponent
  },
  {
    path:'nuevo',
    component: NuevoComponent
  },
  {
    path:'edit',
    component: EditarComponent
  }
];
