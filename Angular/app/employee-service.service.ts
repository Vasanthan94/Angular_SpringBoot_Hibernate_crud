import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService 
{
private baseUrl = 'http://localhot:8080/SpringBootHiberCrud/crud/employees';
constructor(private http: HttpClient) { }

public getEmployee(emailId: string): Observable<Object> 
{
   return this.http.get(`${this.baseUrl}/${emailId}`);
}
public  createEmployee(employee: Object): Observable<Object> 
{
   return this.http.post(`${this.baseUrl}`, employee);
}
public  updateEmployee(emailId: string, value: any): Observable<Object> 
{
   return this.http.put(`${this.baseUrl}/${emailId}`, value);
}
public  deleteEmployee(emailId: string): Observable<any> 
{
   return this.http.delete(`${this.baseUrl}/${emailId}`, { responseType: 'text' });
}
public  getEmployeesList(): Observable<any> 
{
   return this.http.get(`${this.baseUrl}`);
}
}