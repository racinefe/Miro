import { Component, ViewChild } from '@angular/core';
import { MessagesService } from '../services/messages.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.scss']
})
export class CadastroComponent {
  loading = false;
  message: any;

  constructor(
    private messageService: MessagesService,
    private router: Router,
  ){

  }

  cadastrarNovoUsuario(){
    this.loading = true
    setTimeout(() =>{
      this.messageService.add('Cadastro Realizado com Sucesso');
      this.loading = false;
    },2000);
  }
}
