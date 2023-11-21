import { Component, OnInit } from '@angular/core';
import { IBook } from 'src/app/models/i-book';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.scss']
})
export class BookTableComponent implements OnInit{

  books: IBook[] = [];

  constructor(private service: BookService) { }

  ngOnInit(): void {
    this.books = [
      {id: 4, title: "Elon Musk", category: "Biography"},
      {id: 5, title: "Physics IV", category: "Academic"},
      {id: 6, title: "Uber", category: "Biography"}
    ];

    for (let b of this.books){
      console.log(b)
    }
  }
}
