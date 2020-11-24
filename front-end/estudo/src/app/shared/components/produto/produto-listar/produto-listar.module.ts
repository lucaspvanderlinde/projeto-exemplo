import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProdutoListarRoutingModule } from './produto-listar-routing.module';
import { ProdutoListarComponent } from './produto-listar.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { NzLayoutModule } from 'ng-zorro-antd/layout';
import { NzBreadCrumbModule } from 'ng-zorro-antd/breadcrumb';
import { NzMenuModule } from 'ng-zorro-antd/menu';
import { NzTableModule } from 'ng-zorro-antd/table';


@NgModule({
  declarations: [ProdutoListarComponent],
  imports: [
    CommonModule,
    FormsModule,
    ProdutoListarRoutingModule,
    HttpClientModule,
    NzLayoutModule,
    NzBreadCrumbModule,
    NzMenuModule,
    NzTableModule
  ]
})
export class ProdutoListarModule { }
