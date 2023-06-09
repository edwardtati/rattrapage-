import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {PagesRoutingModule} from "./pages-routing.module";
import {NbCardModule, NbLayoutModule, NbMenuModule, NbSidebarModule} from "@nebular/theme";



@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    PagesRoutingModule,
    NbCardModule,
    NbSidebarModule,
    NbLayoutModule,
    NbMenuModule
  ]
})
export class PagesModule { }
