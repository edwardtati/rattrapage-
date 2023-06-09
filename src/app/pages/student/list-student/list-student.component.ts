import { Component } from '@angular/core';
import {Observable} from "rxjs";
import {Classe} from "../../../shareds/models/classe";
import {ClasseService} from "../../../shareds/services/classe.service";
import {Student} from "../../../shareds/models/student";
import {StudentService} from "../../../shareds/services/student.service";

@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styleUrls: ['./list-student.component.scss']
})
export class ListStudentComponent {
  student$: Observable<Student[]>
  student: any[]
  constructor(
    private studentService: StudentService
  ){
    this.student$=studentService.getClasse()
  }

}
