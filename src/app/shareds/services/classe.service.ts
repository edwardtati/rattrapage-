import { Injectable } from '@angular/core';
import {serviceConfig} from "./config";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Salles} from "../models/salles";
import {Classe} from "../models/classe";

@Injectable({
  providedIn: 'root'
})
export class ClasseService {
  url = serviceConfig.apiUrl

  constructor(
    private http: HttpClient
  ) { }

  getClasse() : Observable<Classe[]> {
    return this.http.get<Classe[]>(`${this.url}/classe`)
  }

  post(classe: Classe) : Observable<Classe> {
    return this.http.post<Classe>(`${this.url}/classe`, classe)
  }
}
