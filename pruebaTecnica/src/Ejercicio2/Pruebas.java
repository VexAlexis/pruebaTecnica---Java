package Ejercicio2;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		
		// Par
		Scanner entrada2 = new Scanner(System.in);		
		System.out.print("\nElija el numero hasta el cual sumar: ");
		int num2 = entrada2.nextInt();		
		int resX = (num2 + 1) * (num2 / 2);		
		System.out.print("Resultado Par: " + resX);
		
		
		// Impar		
		Scanner entrada3 = new Scanner(System.in);		
		System.out.print("\nElija el numero hasta el cual sumar: ");
		int num3 = entrada3.nextInt();		
		int resZ = (num2 + 2) * (num2 / 2) + 1;		
		System.out.print("Resultado Impar: " + resZ);		

	}

}
