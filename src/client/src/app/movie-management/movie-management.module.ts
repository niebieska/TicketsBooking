import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MovieComponent } from './movie/movie.component';
import {MatCardModule} from '@angular/material/card';
import {MatButtonModule} from "@angular/material";

@NgModule({
  declarations: [MovieComponent],
  imports: [
    CommonModule,
    MatCardModule,
    MatButtonModule
  ]
})
export class MovieManagementModule { }
