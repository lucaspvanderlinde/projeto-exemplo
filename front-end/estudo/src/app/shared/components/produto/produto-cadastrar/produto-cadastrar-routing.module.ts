import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ProdutoCadastrarComponent } from './produto-cadastrar.component';

const routes: Routes = [{ path: '', component: ProdutoCadastrarComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProdutoCadastrarRoutingModule { }
