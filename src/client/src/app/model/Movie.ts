import {MovieType} from "./MovieType";

export class Movie {
  id: number;
  title: string;
  description: string;
  image: string;
  genre: string;
  duration: number;
  movieTypes: MovieType[];


  constructor(title?:string, description?: string, image?: string, genre?: string, duration?: number, movieTypes?: MovieType[]){
    this.title = title;
    this.description = description;
    this.image = image;
    this.genre = genre;
    this.duration = duration;
    this.movieTypes = movieTypes;
  }
}
