/*
 * Criado por Fábio Medeiros.
 * Data: 16/10/2020.
 */

public class TiposPrimitivos {

	// Comentários de uma linha.

	/*
	 * Comentários de varias linhas.
	 */

	/***
	 * Esse comentário é oficial do Java Doc (Documentação do Java).
	 * @param args parametro de entrada de dados.
	 */

	public static void main(String[] args){

		char caracter = 'F'; 	// Armazena um caracter unicode, seu valor minimo '\u0000' (0) e o seu valor maximo '\uffff' (65535).
		boolean logico = true; 	// Armazena um valor logico true ou false, por padrao e false.

		// Tipos primitivos numericos.
		byte numeroInteiro8b = 1; 	// Armazena um numero inteiro 2^8 (-128 a 127) ou 8 bits, por padrao e 0.
		short numeroInteiro16b= 55; 	// Armazena um numero inteiro 2^16 (-32.768 a 32.767) ou 16 bits, por padrao e 0.
		int numeroInteiro32b = 541;	// Armazena um numero inteiro 2^32 (-2147483648 a 2147483647) ou 32 bits, por padrao e 0.
		long numeroInteiro64b = 8l;	// Armazena um numero inteiro 2^64 ou 64 bits, por padrao e 0l.

		// Tipos primitivos numericos de ponto flutuante.
		float numeroFlutuante = 6.2f;		// Armazena um numero flutuante de 32 bits, por padrao e 0.0f.
		double numeroFlutuanteDouble = 4.6;	// Armazena um numero flutuante de 64 bits, por padrao e 0.0.

		System.out.println("Classe sobre comentários e tipos primitivos.");

		System.out.println("Valor do char:    " + caracter);
		System.out.println("Valor do boolean: " + logico + "\n");

		System.out.println("Valor do byte:    " + numeroInteiro8b);
		System.out.println("Valor do short:   " + numeroInteiro16b);
		System.out.println("Valor do int:     " + numeroInteiro32b);
		System.out.println("Valor do long:    " + numeroInteiro64b + "\n");

		System.out.println("Valor do float:   " + numeroFlutuante);
		System.out.println("Valor do double:  " + numeroFlutuanteDouble);

	}
}
