package Ejercicio2;

public class NumeroImpar extends Numero implements NumeroSumable{
	
	public int res;

	public NumeroImpar(int numero) {
		super(numero);
	}
	

	@Override
	public String sumarNumeros(String nStr) {
		String resultado = "";	
		numero = Integer.parseInt(nStr);
		res = (numero + 2) * (numero / 2) + 1;;		
		return resultado;
	}
	
	@Override
	public void imprimirNumero(String nStr) {
		System.out.print("Resultado impar: " + res);
	}

		
	
}
