package entrada;

import java.io.BufferedReader;
import exce��o.ETException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Esta classe foi desenhada para facilitar a entrada de dados
 * pelo teclado. Basicamente ela implementa fun��es para
 * ler strings, inteiros e doubles. 
 * Ela n�o faz verifica��es se o que foi digitado realmente
 * � o esperado.
 * Todos 
 * @author delamaro
 *
 */
public class EntradaTeclado {
static InputStreamReader isr = new InputStreamReader(System.in);
static BufferedReader br = new BufferedReader(isr);
	
	/**
	 * Le um string digitado pelo teclado, at� que seja pressionado
	 * um enter. Ou seja, le a linha toda.
	 * @return o string que foi digitado pelo usu�rio.
	 * @throws IOException
	 */
	public static String leString() {
		String x;
		try {
			x = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			throw new ETException("Erro de leitura");
		}
		return x;

	}

	/**
	 * Le um string do teclado (uma linha toda) e tenta transform�-lo num inteiro. 
	 * Por�m n�o faz qualquer verifica��o sobre a validade do dado digitado.
	 * @return  o valor inteiro digitado pelo usu�rio. 
	 * @throws IOException
	 */
	public static int leInt() throws IOException {
		String x = leString();
		try {
			return Integer.parseInt(x);
		} catch (NumberFormatException e) {
			throw new ETException("Erro de leitura");
		}
	}

	/**
	 * Le um string do teclado (uma linha toda) e tenta transform�-lo num double. 
	 * Por�m n�o faz qualquer verifica��o sobre a validade do dado digitado.
	 * @return  o valor double digitado pelo usu�rio. 
	 * @throws IOException
	 */

	public static double leDouble() throws IOException {
		String x = leString();
		try {
		return Double.parseDouble(x);
		} catch (NumberFormatException e) {
			throw new ETException("Erro de leitura");
		}

	}
}

