import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor
} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class CorsInterceptor implements HttpInterceptor {

  constructor() {}

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    const modifiedReq = req.clone({
      headers: req.headers.set('Access-Control-Allow-Origin', '*')
        .set("Access-Control-Allow-Methods", "*")
        .set("Access-Control-Allow-Headers", "'Access-Control-Allow-Headers: Origin, Content-Type, X-Auth-Token'",)
    });
    return next.handle(modifiedReq);
  }

}
