import { Injectable } from '@angular/core';
import {serviceConfig} from "./config";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Classe} from "../models/classe";
import {Student} from "../models/student";

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  url = serviceConfig.apiUrl

  constructor(
    private http: HttpClient
  ) { }

  getClasse() : Observable<Student[]> {
    return this.http.get<Student[]>(`${this.url}/student`)
  }

  post(student: Student) : Observable<Student> {
    return this.http.post<Student>(`${this.url}/student`, student)
  }
}
