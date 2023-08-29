import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ListComponent } from '../list/list.component';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  constructor(
    private router: Router
  ){

  }
  logarUsuario(){
    this.router.navigate(['/list']);
  }
}
