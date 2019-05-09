import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavComponent } from './nav/nav.component';
import {MatButtonModule, MatIconModule, MatMenuModule} from "@angular/material";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";

@NgModule({
  declarations: [NavComponent],
  imports: [
    CommonModule,
    MatMenuModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatIconModule
  ],
  exports: [NavComponent]
})
export class GeneralModule { }
