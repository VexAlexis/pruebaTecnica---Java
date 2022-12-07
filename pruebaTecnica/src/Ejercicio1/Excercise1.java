package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise1 {
	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Black");
		color.add("Grey");
		color.add("Violet");
		color.add("Brown");
		color.add("Yellow");
		
		System.out.println("Original array list: " + color);
		
		Scanner entrada1 = new Scanner(System.in);		
		System.out.println("Color: ");
		String colorRecibido = entrada1.nextLine();
		
		Scanner entrada2 = new Scanner(System.in);		
		System.out.println("Elija un numero entre 1 y 8: ");
		int x = entrada2.nextInt();
		x = x - 1;
		
		String colorRemovido = color.get(x);
		
		color.remove(x);
		color.add(x, colorRecibido);
		
		
		
		// Imprimir ArrayList modificado
		for(int i = 0; i < color.size(); i++) {
			System.out.println("Color #" + (i+1) + " " + color.get(i));
		}
		System.out.println("\nEl color removido fue: " + colorRemovido);
		System.out.println("\nEl color agregado fue: " + colorRecibido + ", en la posicion: " + (x+1));
		
	}

}
