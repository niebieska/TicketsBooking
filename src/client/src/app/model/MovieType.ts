import {Movie} from "./Movie";
import {MovieHour} from "./MovieHour";

export class MovieType {
  id: number;
  name: string;
  movie: Movie;
  movieHours: MovieHour[];


  constructor(id?:number, name?:string, movie?: Movie, movieHours?:MovieHour[]){
    this.id = id;
    this.name = name;
    this.movie = movie;
    this.movieHours = movieHours;
  }
}
