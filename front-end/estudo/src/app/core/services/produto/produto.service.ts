import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  constructor(private http: HttpClient) { }

  private urlPadrao = 'http://localhost:8080/produto';

  public buscarTodos(): Observable<any> {
    return this.http.get(`${this.urlPadrao}`);
  }

  public buscarPorId(id: number): Observable<any> {
    return this.http.get(`${this.urlPadrao}/${id}`);
  }

  public cadastrar(obj: Object): Observable<Object> {
    return this.http.post(`${this.urlPadrao}`, obj);
  }

  public atualizar(id: number, obj: Object): Observable<Object>{
    return this.http.put(`${this.urlPadrao}/${id}`, obj);
  }

  public delete(id: number): Observable<any>{
    return this.http.delete(`${this.urlPadrao}/${id}`);
  }

}
