import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NithajComponent } from './nithaj.component';

describe('NithajComponent', () => {
  let component: NithajComponent;
  let fixture: ComponentFixture<NithajComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [NithajComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NithajComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
