import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MovieComponent } from './movie/movie.component';
import {MovieService} from "./movie.service";

@NgModule({
  declarations: [MovieComponent],
  imports: [
    CommonModule
  ]
})
export class MovieManagementModule { }
