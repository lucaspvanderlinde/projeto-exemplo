import { NgModule } from '@angular/core';

import { ProdutoListarRoutingModule } from './produto-listar-routing.module';
import { ProdutoListarComponent } from './produto-listar.component';
import { SharedModule } from 'src/app/shared/modules/shared.module';


@NgModule({
  declarations: [ProdutoListarComponent],
  imports: [
    ProdutoListarRoutingModule,
    SharedModule
  ]
})
export class ProdutoListarModule { }
