import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {NavComponent} from './nav.component';
import {CommonModule} from "@angular/common";
import {MatButtonModule, MatIconModule, MatMenuModule} from "@angular/material";
import {CUSTOM_ELEMENTS_SCHEMA} from "@angular/core";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";

describe('NavComponent', () => {
  let component: NavComponent;
  let fixture: ComponentFixture<NavComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NavComponent],
      imports: [
        CommonModule,
        MatMenuModule,
        BrowserAnimationsModule,
        MatButtonModule,
        MatIconModule
      ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA]
    }).compileComponents();
    fixture = TestBed.createComponent(NavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });


  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
