import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MovieComponent } from './movie/movie.component';
import {MatCardModule} from '@angular/material/card';

@NgModule({
  declarations: [MovieComponent],
  imports: [
    CommonModule,
    MatCardModule
  ]
})
export class MovieManagementModule { }
