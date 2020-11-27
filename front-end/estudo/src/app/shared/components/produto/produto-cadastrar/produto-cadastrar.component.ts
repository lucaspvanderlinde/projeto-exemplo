import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProdutoService } from 'src/app/core/services/produto/produto.service';
import { Produto } from 'src/app/shared/models/Produto';

@Component({
  selector: 'app-produto-cadastrar',
  templateUrl: './produto-cadastrar.component.html',
  styleUrls: ['./produto-cadastrar.component.css']
})
export class ProdutoCadastrarComponent implements OnInit {

  public produto: Produto = new Produto();  
  public dateFormat = 'dd/MM/yyyy';

  constructor(
    private produtoService: ProdutoService,
    private router: Router
  ) { }

  ngOnInit(): void {

  }

  public onSubmit() {
    this.produtoService.cadastrar(this.produto)
      .subscribe(data => {
        this.produto = new Produto();
        this.irParaLista();
      },
        error => console.log(error)
      );
  }

  public irParaLista() {
    this.router.navigate(['']);
  }
}
