/*
 * Criado Por Fábio Medeiros.
 * Data: 16/10/2020.
 */

public class WrapperInteger {

	public static void main(String[] args){

		int primeiroNumero = Integer.parseInt("56"); 	// Retorna um número entre String.
		int segundoNumero = Integer.sum(5, 2);		// Retorna a soma entre dois números inteiros.
		int terceiroNumero = Integer.max(15, 3);	// Retorna o maior número entre dois inteiros.
		int quartoNumero = Integer.min(18, 25);		// Retorna o menor número entre dois inteiros.
		int quintoNumero = Integer.divideUnsigned(30, 5);//Retorna o quociente sem sinal, entre dois inteiros positivos ou não.
		int sextoNumero  = Integer.remainderUnsigned(17, 3);//Retorna o resto sem sinal, entre dois inteiros positivos ou não.
		int setimoNumero = Integer.decode("0X148d");	// Retorna um inteiro, decodificando do sinal +/-(opcionais) prefixo ("0x","0X" ou "#") base 16, ("0") base 8.
		int oitavoNumero = Integer.getInteger("os.version");
		String numeroBinario = Integer.toBinaryString(2156);//Retorna uma String binária (base 2) do número positivo.
		String numeroHex = Integer.toHexString(5261);	// Retorna uma String hexadecimal (base 16) do número positivo.
		String numeroTexto = Integer.toString(32);	// Retorna um número em formato de texto.

		System.out.println("O valor da String \"56\"      :    " + primeiroNumero);
		System.out.println("O valor da soma entre 5 e 2 :    " + segundoNumero);
		System.out.println("O valor máximo entre 15 e 3 :    " + terceiroNumero);
		System.out.println("O valor mínimo entre 18 e 25:    " + quartoNumero);
		System.out.println("O quociente dos valores 30 e 5:  " + quintoNumero);
		System.out.println("O resto dos valores 17 e 3  :    " + sextoNumero);
		System.out.println("O valor do hexadecimal 148d :    " + setimoNumero);
		System.out.println("O valor da versão do java é :    " + oitavoNumero);
		System.out.println("A expressão binária de 2156 :    " + numeroBinario);
		System.out.println("A expressão hexadecimal de 5261: " + numeroHex);
		System.out.println("O valor inteiro em String :      " + numeroTexto);
	}
}
