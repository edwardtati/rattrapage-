import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ClassesComponent } from './classes/classes.component';
import { ListClasseComponent } from './list-classe/list-classe.component';
import { AddClasseComponent } from './add-classe/add-classe.component';
import {RouterModule, Routes} from "@angular/router";
import {NbActionsModule, NbButtonModule, NbCardModule, NbIconModule, NbInputModule} from "@nebular/theme";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";


export const routes: Routes = [
  {
    path: "",
    pathMatch: "full",
    redirectTo: "classe"
  },
  {
    path: "classe",
    component: ClassesComponent,
    children:[
      {
        path: "",
        pathMatch: "full",
        redirectTo: "list"
      },
      {
        path: "list",
        component: ListClasseComponent
      },
      {
        path: "add",
        component: AddClasseComponent
      }
    ]
  }
]

@NgModule({
  declarations: [
    ClassesComponent,
    ListClasseComponent,
    AddClasseComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    NbCardModule,
    NbActionsModule,
    NbIconModule,
    NbInputModule,
    FormsModule,
    NbButtonModule,
    ReactiveFormsModule
  ]
})
export class ClasseModule { }
