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
  dateFormat = 'dd/MM/yyyy';

  constructor(private produtoService: ProdutoService, private router: Router) { }

  ngOnInit(): void {

    this.produto.quantidade = 0;

  }

  public onChange(result: Date): void {
    console.log('onChange: ', result);
  }

  public onSubmit() {
    this.produtoService.cadastrar(this.produto)
      .subscribe(data => {
        console.log(data)
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
