import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {SallesComponent} from "./salles/salles/salles.component";
import {ClassesComponent} from "./classe/classes/classes.component";

const routes: Routes = [
  {
    path:"",
    component: SallesComponent
  },
  {
    path:"classe",
    component: ClassesComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PagesRoutingModule { }
