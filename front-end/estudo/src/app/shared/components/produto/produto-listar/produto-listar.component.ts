import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { ProdutoService } from 'src/app/core/services/produto/produto.service';
import { Produto } from 'src/app/shared/models/Produto';

@Component({
  selector: 'app-produto-listar',
  templateUrl: './produto-listar.component.html',
  styleUrls: ['./produto-listar.component.css']
})
export class ProdutoListarComponent implements OnInit {

  public produtos: Observable<Produto[]>;

  constructor(
    private produtoService: ProdutoService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.buscarProdutos();
  }

  private buscarProdutos(){
    this.produtoService.buscarTodos()
    .subscribe( data => {
      this.produtos = data;
    });
  }

  public delete(id: number) {
    this.produtoService.delete(id).subscribe(
      data => {
        this.buscarProdutos();
      },
      error => console.log(error)
    );
  }

  public atualizar(id: number){
    console.log("EM MANUTENÇÃO");
  }

}
