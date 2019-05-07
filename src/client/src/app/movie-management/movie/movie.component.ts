import { Component, OnInit } from '@angular/core';
import {MovieService} from "../movie.service";
import {Movie} from "../../model/Movie";

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.scss']
})
export class MovieComponent implements OnInit {
  currentMovies: Movie[];

  constructor(private movieService: MovieService) { }

  ngOnInit() {
    this.movieService.findAll().subscribe(
      movies => {this.currentMovies = movies;}
    );
  }

}
