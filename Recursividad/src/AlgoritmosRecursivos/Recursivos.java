package AlgoritmosRecursivos;

public class Recursivos {
	
	/* RECURSIVIDAD DIRECTA LINEAL NO FINAL:
	 * Es la recursividad en la que en cada ejecución recursiva se trabaja con datos
	 * locales diferentes y el resultado final depende de dichos datos intermedios.
	 * El coste de este algorítmo es lineal O(n) ya que realizará n llamadas al caso
	 * recursivo.
	 */
	public int factorial(int n) {
		System.out.println("Calculando el factorial de " + n);
		if (n == 1) {
			return 1;
		} else {
			return factorial(n - 1);
		}
	}	
	
	/* RECURSIVIDAD DIRECTA LINEAL FINAL
	 * Cuando el resultado de los casos recursivos es el correspondiente al
	 * valor de la última ejecución de la llamada recursiva.
	 * El coste de este algorítmo es lineal proporcinal y proporcinal al número de
	 * llamadas recursivas que se realicen.
	 */
	public int mcd(int a, int b) {
		System.out.println("Calculando el mcd de " + a + " y " + b);
		if (b == 0) {
			return a;
		} else {
			return mcd(b, a%b);
		}
	}
	
	/* RECURSIVIDAD DIRECTA MÚLTIPLE
	 * Cuando una ejecución recursiva da lugar a múltiples llamadas recursivas.
	 * En este caso se repiten muchos cálculos de términos de la serie de Fibonacci.
	 * El coste de este algorítmo es O(K^n) es decir exponencial. Es tremendamente
	 * ineficiente. Se podría mejorar aplicando técnicas de programación dinámica en la
	 * que se podrían ir guardando los términos ya calculados, y consultar si ya se
	 * han calculado no proceder a calcularlos. Con esto el coste podría pasar a ser lineal.
	 */
	public int fibo(int n) {
		System.out.println("Calculando el término de Fibonacci " + n);
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
	
	/* RECURSIVIDAD INDIRECTA
	 * Se produce cuando dos funciones se llaman mutuamente.
	 * El coste de este algorítmo es lineal O(n) ya que por cada número
	 * introducido se recorre la función restando uno al número hasta llegar a cero.
	 */
	public boolean par(int n) {
		System.out.println("Calculando si " + n + " es par");
		if (n == 0) {
			return true;
		} else {
			return impar(n - 1);
		}
	}

	public boolean impar(int n) {
		System.out.println("Calculando si " + n + " es impar");
		if (n == 0) {
			return false;
		} else {
			return par(n - 1);
		}
	}

}
