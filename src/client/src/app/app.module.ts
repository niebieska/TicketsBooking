import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {GeneralModule} from "./general/general.module";
import {MovieManagementModule} from "./movie-management/movie-management.module";
import {HttpClientModule} from "@angular/common/http";
import {MovieService} from "./movie-management/movie.service";
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    GeneralModule,
    MovieManagementModule
  ],
  providers: [MovieService],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AppModule { }
