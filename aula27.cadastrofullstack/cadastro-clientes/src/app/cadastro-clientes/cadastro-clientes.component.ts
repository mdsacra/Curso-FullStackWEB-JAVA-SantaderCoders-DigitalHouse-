import { Component, OnInit } from '@angular/core';
import { ClienteService } from '../cliente.service'

@Component({
  selector: 'app-cadastro-clientes',
  templateUrl: './cadastro-clientes.component.html',
  styleUrls: ['./cadastro-clientes.component.css']
})
export class CadastroClientesComponent implements OnInit {

  cliente = {id: '', nome: '', sobrenome: ''};
  
  constructor(private clienteService: ClienteService) { }

  ngOnInit(): void {
  }

  adicionar() {
    this.clienteService.adicionar(this.cliente).subscribe(() => {
      this.cliente = {id: '', nome: '', sobrenome: ''};
      alert("Cliente salvo!");
    });
  }

}
