import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListStudentComponent } from './list-student/list-student.component';
import { AddStudentComponent } from './add-student/add-student.component';
import { StudentComponent } from './student/student.component';
import {RouterLink, RouterOutlet, Routes} from "@angular/router";
import {ClassesComponent} from "../classe/classes/classes.component";
import {ListClasseComponent} from "../classe/list-classe/list-classe.component";
import {AddClasseComponent} from "../classe/add-classe/add-classe.component";
import {NbActionsModule, NbCardModule, NbIconModule} from "@nebular/theme";


export const routes: Routes = [
  {
    path: "",
    pathMatch: "full",
    redirectTo: "student"
  },
  {
    path: "student",
    component: StudentComponent,
    children:[
      {
        path: "",
        pathMatch: "full",
        redirectTo: "list"
      },
      {
        path: "list",
        component: ListStudentComponent
      },
      {
        path: "add",
        component: AddStudentComponent
      }
    ]
  }
]

@NgModule({
  declarations: [
    ListStudentComponent,
    AddStudentComponent,
    StudentComponent
  ],
  imports: [
    CommonModule,
    NbActionsModule,
    NbCardModule,
    NbIconModule,
    RouterLink,
    RouterOutlet
  ]
})
export class StudentModule { }
