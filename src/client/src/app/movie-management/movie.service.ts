import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Movie} from "../model/Movie";

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  private mainHttp: string = "http://localhost:8080/";

  constructor(private http: HttpClient) { }

  findAll(): Observable<Movie[]> {
    return this.http.get<Movie[]>(this.mainHttp + 'movies/getAll');
  }


}
