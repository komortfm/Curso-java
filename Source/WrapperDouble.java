/*
 * Criado Por Fábio Medeiros.
 * Data: 16/10/2020.
 */

public class WrapperDouble {

	public static void main(String[] args) {

		double primeiroNumero = Double.parseDouble("26.3");// Converte uma String em número flutuante.
		double segundoNumero = Double.max(22.4, 15.8);     // Retorna o maior número entre dois valores.
		double terceiroNumero = Double.min(15.4, 15.1);    // Retorna o menor número entre dois valores.
		long numeroBits = Double.doubleToLongBits(125.847);// Retorna um numero longo.
		String numeroHex = Double.toHexString(521.221);    // Retorna uma String hexadecimal (base 16) do número positivo.
		String numeroTexto = Double.toString(215.2315);    // Retorna um numero em formato de texto.

		System.out.println("O valor da string \"26.3\"         : " + primeiroNumero);
		System.out.println("O valor máximo entre 22.4 e 15.8 : " + segundoNumero);
		System.out.println("O valor mínimo entre 15.4 e 15.1 : " + terceiroNumero);
		System.out.println("O valor em bits de 125.847       : " + numeroBits);
		System.out.println("O valor hexadecimal de 521.221   : " + numeroHex);
		System.out.println("O valor 215.2315 em string       : " + numeroTexto);
	}
}
