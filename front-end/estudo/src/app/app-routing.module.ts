import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: 'produto-cadastro',
    loadChildren: () => import('./shared/components/produto/produto-cadastrar/produto-cadastrar.module').then(m => m.ProdutoCadastrarModule)
  },
  {
    path: 'produto-listar',
    loadChildren: () => import('./shared/components/produto/produto-listar/produto-listar.module').then(m => m.ProdutoListarModule)
  },
  {
    path: '',
    redirectTo: 'produto-listar',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
