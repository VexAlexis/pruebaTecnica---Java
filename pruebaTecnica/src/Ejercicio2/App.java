package Ejercicio2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Numero numero;
		
		boolean rep = true;
		Scanner entrada = new Scanner(System.in);	
		do {
			System.out.print("\n\nDigite un numero entre 1 hasta 100,000: ");
			
			int num = entrada.nextInt();
			
			if(num < 0 && num > 100000) {
				System.out.println("Su numero no esta dentro de los limites, por favor digite un numero > 0 y < 100,000");
			}else if (num == 0){
					rep = false;	
			}else{ 
				if(num %2 == 0 ) {
					System.out.println("Numero par !!");
					numero= new NumeroPar(num);
				}else {
					System.out.println("Numero impar");
					numero= new NumeroImpar(num);
				}
				String numString = String.valueOf(num);
				((NumeroSumable) numero).sumarNumeros(numString);
				((NumeroSumable) numero).imprimirNumero(numString);

			}
		}while(rep == true);
			
		System.out.println("El programa finalizo");
	}

}
