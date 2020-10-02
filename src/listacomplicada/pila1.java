/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacomplicada;

import java.util.Scanner;
import java.util.Random;
public class pila1 {
	public static void main(String[] args) {
		
            Scanner sc = new Scanner(System.in);
       int tope=0, tam,opt;
       
       System.out.println("ingresa el tamaño que quieres en la pila A Y B");
       int pila [] = new int [tam = sc.nextInt()];
           Lista listita=new Lista();
		Random num = new Random();
		int opcion=0;
		int crack;
		int cracks;
		int i = 0;
		int contador;
		Scanner Teclado = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		System.out.println("Te doy la bienvenida ");
		System.out.println("Que desea realizar:");
		do {
			System.out.println("1: Agregar un elemento");
			System.out.println("2: Mostrar todos los elementos obtenidos ");
			System.out.println("3: Submenu de Eliminar elementos");
			System.out.println("4: Llenado de elementos ");
			System.out.println("5: Ordenamiento de menor a mayor");
                        System.out.println("6: mostrar los elementos ya obtenidos");
			System.out.println("7: concluir");
			opcion = Teclado.nextInt();
			switch (opcion) {
			case 1: System.out.println("ingresar el elemento a insertar");
			        Scanner teeclado = new Scanner(System.in);
			        crack = teeclado.nextInt();
			        listita.AgregarDatos(crack);
			        break;
			        
			case 2: System.out.println("Aqui se encuentran todos los elementos obtenidos ");
			        listita.MostrarLista();
			        System.out.println("Aqui se encuentran todos los elementos obtenidos ");
			        break;
			        
			case 3: 
				System.out.println("Bienvenido al submenu de eliminar, que desea realizar;");
				int opc;
				do {
				System.out.println("1: Eliminar El primer elemento");
				System.out.println("2: Eliminar ultimo elemento");
				System.out.println("3: Eliminar Todos Los elementos");
				System.out.println("4: volver al menu principal");
				 opc = Teclado.nextInt();
				switch(opc) {
					case 1: System.out.println("Se elimino el primer elemento");
					    listita.BorrarNodoinicio();
						break;
						
					case 2:System.out.println("Se elimino el ultimo elemento");
						listita.BorrarDato();
						break;
						
						
					case 3: System.out.println("Se eliminaron todos los elementos");
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
				i=(num.nextInt(300-250+1)+250);		
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
				
			 case 5: System.out.println("Los Elementos se han ordenado de manor a mayor");
			        listita.Ordenar();
			        System.out.println("Los Elementos se han ordenado de manor a mayor");
			        break;
			 case 6: System.out.println("Aqui se encuentran los datos ya empleados ");
			        listita.MostrarLista();
			        System.out.println("Aqui se encuentran los datos ya empleados");
			        break;
			 case 7: System.out.println("Saliste de la aplicacion");
			        break;
			        default: System.out.println("\topcion no valida, intenta de nuevo");
			}
			 
		} while (opcion !=6);
    }
}