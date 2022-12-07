package Ejercicio2;

public class NumeroPar extends Numero implements NumeroSumable{

	public int res;
	
	public NumeroPar(int numero) {
		super(numero);
	}
	
	
	@Override
	public String sumarNumeros(String nStr) {
		String resultado = "";
		numero = Integer.parseInt(nStr);
		res = (numero + 1) * (numero / 2);		
		return resultado;
	}
	
	@Override
	public void imprimirNumero(String nStr) {
		System.out.print("Resultado par: " + res);
	}
	
}
