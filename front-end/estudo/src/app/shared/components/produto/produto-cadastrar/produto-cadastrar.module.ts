import { NgModule } from '@angular/core';

import { ProdutoCadastrarRoutingModule } from './produto-cadastrar-routing.module';
import { ProdutoCadastrarComponent } from './produto-cadastrar.component';
import { SharedModule } from 'src/app/shared/modules/shared.module';


@NgModule({
  declarations: [ProdutoCadastrarComponent],
  imports: [
    ProdutoCadastrarRoutingModule,
    SharedModule
  ]
})
export class ProdutoCadastrarModule { }
