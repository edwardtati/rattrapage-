import { Component } from '@angular/core';
import {Observable} from "rxjs";
import {Classe} from "../../../shareds/models/classe";
import {ClasseService} from "../../../shareds/services/classe.service";

@Component({
  selector: 'app-list-classe',
  templateUrl: './list-classe.component.html',
  styleUrls: ['./list-classe.component.scss']
})
export class ListClasseComponent {
  classe$: Observable<Classe[]>
  classe: any[]
  constructor(
    private classeService: ClasseService
  ){
    this.classe$=classeService.getClasse()
  }
}
