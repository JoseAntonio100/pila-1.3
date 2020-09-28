/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacomplicada;

import java.util.Scanner;
import java.util.Random;
public class ListaComplicada {
	public static void main(String[] args) {
		Lista listita=new Lista();
		Random num = new Random();
		int opcion=0;
		int crack;
		int cracks;
		int i = 0;
		int contador;
		Scanner Teclado = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bienvenido a este programa de lista enlazada");
		System.out.println("Que desea realizar:");
		do {
			System.out.println("1: Agregar un elemento");
			System.out.println("2: Mostrar todos los elementos ingresados");
			System.out.println("3: Submenu de Eliminar");
			System.out.println("4: Llenar automaticamente");
			System.out.println("5: Ordenar los elementos de menor a mayor");
			System.out.println("6: Salir");
			opcion = Teclado.nextInt();
			switch (opcion) {
			case 1: System.out.println("Favor de ingresar el elemento a insertar");
			        Scanner teeclado = new Scanner(System.in);
			        crack = teeclado.nextInt();
			        listita.AgregarDatos(crack);
			        break;
			        
			case 2: System.out.println("####Aqui se muestran todos los elementos que ingresaste####");
			        listita.MostrarLista();
			        System.out.println("####Aqui se muestran todos los elementos que ingresaste####");
			        break;
			        
			case 3: 
				System.out.println("Bienbenido al submenu de eliminar, que desea realizar;");
				int opc;
				do {
				System.out.println("1: Eliminar El primer elemento");
				System.out.println("2: Eliminar ultimo elemento");
				System.out.println("3: Eliminar elemento en especifico");
				System.out.println("4: Eliminar Todos Los elementos");
				System.out.println("5: volver al menu principal");
				 opc = Teclado.nextInt();
				switch(opc) {
					case 1: System.out.println("#####Se elimino el primer elemento#####");
					    listita.BorrarNodoinicio();
						break;
						
					case 2:System.out.println("#####Se elimino el ultimo elemento#####");
						listita.BorrarDato();
						break;
						
					case 3: System.out.println("#####Favor de ingresar el elemento que desea eliminar#####");
			        Scanner teclado = new Scanner(System.in);
			        crack = teclado.nextInt();
			        listita.EliminarEspesific(crack);
						break;
						
					case 4: System.out.println("#####Se eliminaron todos los elementos#####");
					listita.EliminarTodo();
						break;
				    }
				}
				while (opc !=5);
			break;	
			
			case 4: System.out.println("cuantos nodos desea que se creen");
			contador = entrada.nextInt();
			for(int j=1; j<=contador ; j++) {
				Boolean salir= false;
				Nodo auxx = listita.inicio;
				i=(num.nextInt(200-150+1)+150);		
				while(auxx!=null) {
					if(auxx.dato==i) {
						salir=true;
						System.out.println("iteracion:  "+j+" el dato: " +auxx.dato+" se repite con: "+i);
					}
					auxx=auxx.siguiente;
				}
				if(salir==false) {
					listita.LlenarDatos(i);
				}else {
					j--;
				}
			}
			        break;
				
			 case 5: System.out.println("###Los Elementos se han ordenado de manor a mayor###");
			        listita.Ordenar();
			        System.out.println("###Los Elementos se han ordenado de manor a mayor###");
			        break;
			        
			 case 6: System.out.println("Saliste de la aplicacion");
			        break;
			        default: System.out.println("\topcion no valida, intenta de nuevo");
			}
			 
		} while (opcion !=6);
	}
}