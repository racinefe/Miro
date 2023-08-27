import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';

import { faTimes } from '@fortawesome/free-solid-svg-icons'
import { MessagesService } from 'src/app/services/messages.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent {
  faTimes = faTimes;
  loading = false;

  dsUsuario = new FormControl();

  limpaCampo(){
    this.dsUsuario.reset();
  }

  pesquisar(){
    this.loading = true;
    setTimeout(()=>{
      this.loading = false;
    },1000)
  }
}
