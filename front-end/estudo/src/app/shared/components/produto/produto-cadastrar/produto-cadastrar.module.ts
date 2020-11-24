import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProdutoCadastrarRoutingModule } from './produto-cadastrar-routing.module';
import { ProdutoCadastrarComponent } from './produto-cadastrar.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [ProdutoCadastrarComponent],
  imports: [
    CommonModule,
    FormsModule,
    ProdutoCadastrarRoutingModule
  ]
})
export class ProdutoCadastrarModule { }
