/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacomplicada;


public class Nodo {
	public int dato;
	public Nodo siguiente;
	public Nodo(int w) {
		this.dato=w;
		this.siguiente=null;
	}
	public Nodo(int w, Nodo n) {
		dato=w;
		siguiente=n;
	}

   
}