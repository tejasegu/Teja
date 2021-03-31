import { TestBed } from '@angular/core/testing';

import { FrmService } from './frm.service';

describe('FrmService', () => {
  let service: FrmService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FrmService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
