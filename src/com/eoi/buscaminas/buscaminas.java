package com.eoi.buscaminas;

import java.io.*;
import java.util.*;

// ################################################################################
// Implementar en JAVA el juego del BUSCAMINAS que vimos en PSEINT
// Por equipos repartiros las funciones e implementarlas. La función main está hecha
// y no se toca.
// Para este ejercicio usaremos GIT, descargaros del repositorio 
// ################################################################################

public class buscaminas {
	// ################################################################################
	// Función max: Función auxiliar que calcula el máximo de dos números
	// ################################################################################
	public static int max(int num1, int num2) {
		//por realizar
		return 0;
	}

	// ################################################################################
	// Función min: Función auxiliar que calcula el mínimo de dos números
	// ################################################################################
	public static int min(int num1, int num2) {
		//por realizar
		return 0;
	}

	// ################################################################################
	// Función IncializarTablero: Función que recibe las dos talbas: tablero, visible
	// Incializa tablero con valores 0
	// Incializa visible con valores Falso, indicando que están ocultas
	// ################################################################################
	public static void inicializartablero(int tablero[][], boolean visible[][]) {
		//por realizar
	}

	// ################################################################################
	// Función PonerMinas: Función que recibe el tablero (tabla 10x10) por referencia
	// Genera 10 posiciones de la tabla e incializa esas posiciones con minas (valor 9)
	// Debe asegurar que se ponen 10 minas.
	// Cada vez que se pone una mina se incrementa en 1 el valor de las celdas vecinas,
	// si no son una mina
	// ################################################################################
	public static void ponerminas(int tablero[][]) {
		//por realizar
	}

	// ################################################################################
	// Función DestaparCelda: Funcion que recibe por referencia las dos tablas y la
	// fila y columna que se debe destapar.
	// Si es una casilla que se puede destapar (la posición de la tabla visible es Falso)
	// Se destapa (posición de la tabla visible a Verdadero)
	// Si no hay minas cerca tengo que intentar destapar las vecinas
	// Si la celda vecina no es una mina, la destapo
	// Función recursiva
	// ################################################################################
	public static void destaparcelda(int tablero[][], boolean visible[][], int fila, int colum) {
		//por realizar
	}

	// ################################################################################
	// Función ContarCeldasDestapadas: Funcion que recibe la tabla visible
	// Recorre la tabla y cuenta los valores Verdaderos, este valor se devuelve
	// Si el contador es 90 significa que hemos destapado todas las casillas: hemos ganado
	// ################################################################################
	public static int contarceldasdestapadas(boolean visible[][]) {
		//por realizar
		return 0;
	}

	// ################################################################################
	// Función ComprobarTablero: Funcion que recibe por referencia las dos tablas y la
	// fila y columna que se debe destapar.
	// Si la posición a destapar es una mina (=9) devuelve -1 (hemos perdido)
	// SiNo destapo la casilla correspondiente y cuento las casillas detapadas y se devuelve
	// ################################################################################
	public static int comprobartablero(int tablero[][], boolean visible[][], int fila, int colum) {
		//por realizar
		return 0;
	}

	// ################################################################################
	// Función EscribirTablero: Funcion que las dos tablas 
	// Recorre las tablas y las muestras en pantalla
	// Dependiendo del valor de cada posición de la tabla visible, muestra la posición
	// de la tabla resultado.
	// Si la posición está destapada (verdadero):
	// Si no tiene minas alrededor (valor 0) muestra un hueco
	// Si es una mina, muestro un *
	// SiNo muetro el valor de la casilla (indica cuantas minas tiene alrededor)
	// SiNo la posición no es visible y muestro un #
	// ################################################################################
	public static void escribirtablero(int tablero[][], boolean visible[][]) {
		//por realizar
	}

	// ################################################################################
	// Programa BuscaMina
	// Incilizo las tablas: tablero y visible
	// Se repite:
	// Mostrar el tablero
	// Pedir fila y columna de casilla a destapar
	// Comprobar tablero
	// Hasta que la comprobación = -1 (has perdido hay una mina)
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
