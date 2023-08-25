import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class MessagesService {
  message: string = '';
  constructor(
    private router: Router,
  ) { }

  add(message: string){
    this.message = message;
  }

  clear() {
    this.message = '';
  }

}
