import {Movie} from "./Movie";
import {MovieType} from "./MovieType";

export class MovieHour {
  id: number;
  hour: string;
  movieType: MovieType;


  constructor(id?:number, hour?:string, movieType?: MovieType){
    this.id = id;
    this.hour = hour;
    this.movieType = movieType;
  }
}
