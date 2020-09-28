/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacomplicada;

public class Lista {
	protected Nodo inicio,fin;
	public Lista() {
		inicio=null;
		fin=null;
	}
	public boolean estaVacia() {
		if(inicio==null) {
			return true; 
		}else {
			return false;
		}
	}
	
	public void AgregarDatos(int elemento) {
		if(!estaVacia()) {
			fin.siguiente=new  Nodo(elemento);
			fin=fin.siguiente;
		}else {
			inicio=fin=new Nodo(elemento);
		}
	}
	public void MostrarLista() {
		Nodo recorrer=inicio;
		while(recorrer!=null) {
			System.out.println("["+recorrer.dato+"]");
			recorrer=recorrer.siguiente;
			
			
		}if(inicio==null && fin==null) {
			System.out.println("No hay ningun elemento");
			}
	}
	public int BorrarDato() {
		int elemento=fin.dato;
		if(inicio==fin) {
			inicio=fin=null;
		}else {
			Nodo temporal=inicio;
			 while(temporal.siguiente!=fin) {
				 temporal=temporal.siguiente;
			 }
			 fin=temporal;
			 fin.siguiente=null;
		}
		return elemento;
	}
	public void LlenarDatos(int elemento) {
		if(!estaVacia()) {
			fin.siguiente=new  Nodo(elemento);
			fin=fin.siguiente;
		}else {
			inicio=fin=new Nodo(elemento);
		}
	}
	public boolean BuscaEnLista(int elemento) {
		Nodo temporal=inicio;
		while(temporal!=null && temporal.dato!=elemento) {
			temporal=temporal.siguiente;
		}
		return temporal!=null;
	}
	public int BorrarNodoinicio() {
		int elemento = inicio.dato;
		if(inicio==fin) {
			inicio=null;
			fin=null;
		} else {
			inicio=inicio.siguiente;
		}return elemento;			
	}
	public void EliminarEspesific(int elemento) {
		if(!estaVacia()) {
			if(inicio==fin && elemento==inicio.dato) {
				inicio=fin=null;
			} else if(elemento==inicio.dato) {
				inicio=inicio.siguiente;
			} else {
				Nodo anterior,temporal;
				anterior=inicio;
				temporal=inicio.siguiente;
				while(temporal!=null && temporal.dato!=elemento) {
					anterior=anterior.siguiente;
					temporal=temporal.siguiente;
				}
				if(temporal!=null) {
					anterior.siguiente=temporal.siguiente;
					if(temporal==fin) {
						fin=anterior;
					}
				}
			}
		}
	}
	public void EliminarTodo() {
		inicio=null;
		fin=null;
	}
	public void Ordenar() {
		if(inicio!=null) {
			Nodo pivote, actual;
			int tempo=0;
			pivote=inicio;
			while(pivote!=fin) {
				actual=pivote;
				while(actual!=null) {
					if(pivote.dato>actual.dato) {
						tempo=pivote.dato;
						pivote.dato=actual.dato;
						actual.dato=tempo;
					}
					actual=actual.siguiente;
				}
				pivote=pivote.siguiente;
			}
			
		}else {
			System.out.println("No Hay Elementos");
		}
	
	
	}
}