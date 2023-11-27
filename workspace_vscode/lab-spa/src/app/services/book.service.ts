import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IBook } from '../models/i-book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  // Retrieving data from JSON file
  //private readonly URI_BOOKS = 'assets/exemplo-de-livros.json';

  // Fetching data from Spring Boot BackEnd using Proxy
  private readonly URI_BOOKS = 'api/book';

  constructor(private http: HttpClient) { }

  // Returns Observable object to Component. The actual use of this element is done by the Component...
  public findAll(): Observable<IBook[]>{
    return this.http.get<IBook[]>(this.URI_BOOKS);
  }

}
