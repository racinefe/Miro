import { Component, ViewChild } from '@angular/core';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.scss']
})
export class CadastroComponent {
  loading = false;
  message: any;

  constructor(){

  }

  cadastrarNovoUsuario(){
    this.loading = true
    setTimeout(() =>{
      this.loading = false;
    },2000);
  }
}
