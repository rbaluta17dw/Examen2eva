package matematica;

public class Matematica {
	private int[] sumas = new int[100];
	private int contSumas = 0;

	/**
	 * 
	 * Pide 2 numeros y los sumas, ademas la suma de los dos numeros se guarda
	 * en un array
	 * 
	 * @param a
	 *            pide un numero que se guarda como variable a
	 * @param b
	 *            pide un numero que se guarda como variable b
	 * @return suma la suma de los dos numeros introducidos
	 */
	public int suma(int a, int b) {
		int suma = a + b;
		sumas[contSumas] = suma;
		contSumas++;
		return suma;

	}

	/**
	 * Pide 2 numero y los compara, si el primer numero es mayor devuelve true,
	 * si no, false
	 * 
	 * @param a
	 *            pide un numero que se guarda como a
	 * @param b
	 *            pide un numero que se guarda como b
	 * @return false devuelve si el numero a no es mayor al numero b true, true
	 *         devuelve si el numero a es mayor al numero b
	 */
	public boolean mayor(int a, int b) {
		if (a > b) {
			return true;
		} else {
			return false;
		}
	}

	// Getter & setters
	public int[] getSumas() {
		/**
		 * Devuelve el array de las sumas
		 * 
		 * @return suma[] devuelve el array de las sumas
		 */
		return sumas;
	}

	public void setSumas(int[] sumas) {
		this.sumas = sumas;
	}

	public int getContSumas() {
		return contSumas;
	}

	public void setContSumas(int contSumas) {
		this.contSumas = contSumas;
	}

}
