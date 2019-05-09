import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MovieComponent } from './movie/movie.component';
import {MatCardModule} from '@angular/material/card';
import {MatButtonModule, MatIconModule} from "@angular/material";
import { MatMenuModule} from '@angular/material/menu';

@NgModule({
  declarations: [MovieComponent],
  imports: [
    CommonModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule,
    MatMenuModule
  ]
})
export class MovieManagementModule { }
