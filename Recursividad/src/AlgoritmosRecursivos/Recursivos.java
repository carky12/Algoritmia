package AlgoritmosRecursivos;

public class Recursivos {
	
	/* RECURSIVIDAD DIRECTA LINEAL NO FINAL:
	 * Es la recursividad en la que en cada ejecuci�n recursiva se trabaja con datos
	 * locales diferentes y el resultado final depende de dichos datos intermedios.
	 * El coste de este algor�tmo es lineal O(n) ya que realizar� n llamadas al caso
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
	 * valor de la �ltima ejecuci�n de la llamada recursiva.
	 * El coste de este algor�tmo es lineal proporcinal y proporcinal al n�mero de
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
	
	/* RECURSIVIDAD DIRECTA M�LTIPLE
	 * Cuando una ejecuci�n recursiva da lugar a m�ltiples llamadas recursivas.
	 * En este caso se repiten muchos c�lculos de t�rminos de la serie de Fibonacci.
	 * El coste de este algor�tmo es O(K^n) es decir exponencial. Es tremendamente
	 * ineficiente. Se podr�a mejorar aplicando t�cnicas de programaci�n din�mica en la
	 * que se podr�an ir guardando los t�rminos ya calculados, y consultar si ya se
	 * han calculado no proceder a calcularlos. Con esto el coste podr�a pasar a ser lineal.
	 */
	public int fibo(int n) {
		System.out.println("Calculando el t�rmino de Fibonacci " + n);
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
	
	/* RECURSIVIDAD INDIRECTA
	 * Se produce cuando dos funciones se llaman mutuamente.
	 * El coste de este algor�tmo es lineal O(n) ya que por cada n�mero
	 * introducido se recorre la funci�n restando uno al n�mero hasta llegar a cero.
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
