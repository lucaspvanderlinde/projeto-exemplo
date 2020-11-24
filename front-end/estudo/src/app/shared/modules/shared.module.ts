import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from "@angular/core";
import { FormsModule } from '@angular/forms';
import { NzBreadCrumbModule } from 'ng-zorro-antd/breadcrumb';
import { NzLayoutModule } from 'ng-zorro-antd/layout';
import { NzMenuModule } from 'ng-zorro-antd/menu';
import { NzTableModule } from 'ng-zorro-antd/table';

@NgModule({
    exports: [
        CommonModule,
        HttpClientModule,
        FormsModule,
        NzLayoutModule,
        NzBreadCrumbModule,
        NzMenuModule,
        NzTableModule
    ]
})
export class SharedModule{}