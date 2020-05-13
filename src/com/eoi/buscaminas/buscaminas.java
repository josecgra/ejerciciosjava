package com.eoi.buscaminas;

import java.io.*;
import java.util.*;

// ################################################################################
// Implementar en JAVA el juego del BuscaMinas que vimos en PSEINT
// Por equipos repartiros las funciones e implementarlas. La funcion main esta hecha
// y no se toca.
// Para este ejercicio usaremos GIT y jugaremos con el repositorio
// https://github.com/josecgra/ejerciciosjava.git
// Cada equipo clonara el repositorio con el ejercicio e implementara una funcion
// cuando la termine y la pruebe, la sube al repositorio avisando a los demas
// que ya lo ha hecho para que se descarguen los nuevos cambios.
// ################################################################################

public class buscaminas {
	// ################################################################################
	// Funcion max: Funcion auxiliar que calcula el maximo de dos numeros
	// ################################################################################
	public static int max(int num1, int num2) {
		System.out.print("implementa el maximo de dos numeros");
		return 0;
	}

	// ################################################################################
	// Funcion min: Funcion auxiliar que calcula el minimo de dos numeross
	// ################################################################################
	public static int min(int num1, int num2) {
		System.out.print("implementa el minimo de dos numeros");
		return 0;
	}

	// ################################################################################
	// Funcion IncializarTablero: Funcion que recibe las dos tablas: tablero, visible
	// Incializa tablero con valores 0
	// Incializa visible con valores Falso, indicando que estan ocultas
	// ################################################################################
	public static void inicializartablero(int tablero[][], boolean visible[][]) {
		System.out.print("inicializa las tablas 'tablero' y 'visible'");
	}

	// ################################################################################
	// Funcion PonerMinas: Funcion que recibe el tablero (tabla 10x10) por referencia
	// Genera 10 posiciones de la tabla e incializa esas posiciones con minas (valor 9)
	// Debe asegurar que se ponen 10 minas.
	// Cada vez que se pone una mina se incrementa en 1 el valor de las celdas vecinas,
	// si no son una mina
	// ################################################################################
	public static void ponerminas(int tablero[][]) {
		System.out.print("reparte 10 minas en tu tablero asumiendo que la mina sera el 9");
		System.out.print("cuando pongas una mina, incrementa el numero de las casillas vecinas");
		System.out.print("usa las funciones max y min que te proveeran tus companeros");
	}

	// ################################################################################
	// Funcion DestaparCelda: Funcion que recibe por referencia las dos tablas y la
	// fila y columna que se debe destapar.
	// Si es una casilla que se puede destapar (la posicion de la tabla visible es Falso)
	// Se destapa (posicion de la tabla visible a Verdadero)
	// Si no hay minas cerca tengo que intentar destapar las vecinas
	// Si la celda vecina no es una mina, la destapo
	// Funcion recursiva
	// ################################################################################
	public static void destaparcelda(int tablero[][], boolean visible[][], int fila, int colum) {
		System.out.print("esta funcion destapara una celda del tablero y sus vecinas");
		System.out.print("usa las funciones max y min que te proveeran tus companeros");
		System.out.print("al destapar las vecinas usa recursividad");
	}

	// ################################################################################
	// Funcion ContarCeldasDestapadas: Funcion que recibe la tabla visible
	// Recorre la tabla y cuenta los valores Verdaderos, este valor se devuelve
	// Si el contador es 90 significa que hemos destapado todas las casillas: hemos ganado
	// ################################################################################
	public static int contarceldasdestapadas(boolean visible[][]) {
		System.out.print("funcion que cuenta el numero de celdas destapadas");
		return 0;
	}

	// ################################################################################
	// Funcion ComprobarTablero: Funcion que recibe por referencia las dos tablas y la
	// fila y columna que se debe destapar.
	// Si la posicion a destapar es una mina (=9) devuelve -1 (hemos perdido)
	// SiNo destapo la casilla correspondiente y cuento las casillas detapadas y se devuelve
	// ################################################################################
	public static int comprobartablero(int tablero[][], boolean visible[][], int fila, int colum) {
		System.out.print("si la celda a destapar es una mina:");
		System.out.print("  cambio a true el valor de esa posicion en visible y devuelvo -1");
		System.out.print("caso contrario, si la celda a destapar NO es una mina:");
		System.out.print("  llamara a la funcion destaparcelda y devolvera el numero de celdas destapadas con la funcion contarceldasdestapadas");
		return 0;
	}

	// ################################################################################
	// Funcion EscribirTablero: Funcion que las dos tablas 
	// Recorre las tablas y las muestras en pantalla
	// Dependiendo del valor de cada posicion de la tabla visible, muestra la posicion
	// de la tabla resultado.
	// Si la posicion esta destapada (verdadero):
	// Si no tiene minas alrededor (valor 0) muestra un hueco
	// Si es una mina, muestro un *
	// SiNo muetro el valor de la casilla (indica cuantas minas tiene alrededor)
	// SiNo la posicion no es visible y muestro un #
	// ################################################################################
	public static void escribirtablero(int tablero[][], boolean visible[][]) {
		System.out.print("funcion que con las dos tablas de entrada va mostrando el tablero");
		System.out.print("ademas del tablero que muestre tambien los indices de cada fila/columna");
	}

	// ################################################################################
	// Programa BuscaMinas
	// Incilizo las tablas: tablero y visible
	// Se repite:
	// Mostrar el tablero
	// Pedir fila y columna de casilla a destapar
	// Comprobar tablero
	// Hasta que la comprobacion = -1 (has perdido hay una mina)
	// O hasta que haya destapada todas las casillas (Has ganado)
	// ################################################################################
	public static void main(String args[]) throws IOException {
		Scanner leer = new Scanner (System.in);
		int colum;
		int fila;
		int resultado;
		int tablero[][];
		boolean visible[][];
		tablero = new int[10][10];
		visible = new boolean[10][10];
		inicializartablero(tablero,visible);
		do {
			escribirtablero(tablero,visible);
			// Pedir fila y columna de casilla a destapar
			do {
				System.out.print("Indica fila:");
				fila = leer.nextInt();
			} while (!(fila>=0 && fila<=9));
			do {
				System.out.print("Indica columna:");
				colum = leer.nextInt();
			} while (!(colum>=0 && colum<=9));
			// Comprobamos el tablero
			resultado = comprobartablero(tablero,visible,fila,colum);
			System.out.println(""); // no hay forma directa de borrar la consola en Java
		} while (!(resultado==-1 || resultado==90));
		escribirtablero(tablero,visible);
		// Has destapado una mina
		if (resultado==-1) {
			System.out.println("Has pisado una mina!!!!!");
			System.out.println("GAME OVER");
			// has destapado todas las casillas
		} else {
			System.out.println("YOU ARE THE PLAYER ONE!!!");
		}
		leer.close();
	}
}
