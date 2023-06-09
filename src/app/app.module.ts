import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { routes } from './app-routing.module';
import { AppComponent } from './app.component';
import {NbLayoutModule, NbMenuModule, NbSidebarModule, NbThemeModule} from '@nebular/theme';
import { LayoutModule } from './layout/layout.module';
import { LayoutComponent } from './layout/layout.component';
import { RouterModule } from '@angular/router';
import {NbEvaIconsModule} from "@nebular/eva-icons";
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import {CorsInterceptor} from "./cors/cors.interceptor";

@NgModule({
  declarations: [
    AppComponent,
    LayoutComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    LayoutModule,
    NbThemeModule.forRoot({name:'dark'}),
    NbSidebarModule.forRoot(),
    NbLayoutModule,
    NbMenuModule.forRoot(),
    NbEvaIconsModule
  ],
  providers: [

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
