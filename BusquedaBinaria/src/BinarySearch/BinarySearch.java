package BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {

		int contador = 0;
		int posicion = 0;
		int valorBuscado = 9999;
		boolean encontrado = false;
		int[] numeros = new int[10000];

		for (int i = 0; i < 10000; i++) {
			numeros[i] = i;
		}
		
		// Búsqueda lineal: Recorremos el array y por cada elemento comparamos si coincide con el número que queremos buscar
		System.out.println("****************************************************************************************");
		System.out.println("Búsqueda lineal O(N):");
		System.out.println("");
		for (int i = 0; i < numeros.length; i++) {
			contador++;
			//System.out.println("Iteración " + contador + ". Espacio de búsqueda: " + (numeros.length));
			if (numeros[i] == valorBuscado) {
				encontrado = true;
				posicion = i;
				break;
			}
		}
		
		System.out.println("");
		if (encontrado) {
			System.out.println("El valor " + valorBuscado + " lo hemos encontrado en " + contador + " iteraciones y está en la posición " + posicion);
		} else {
			System.out.println("Se han realizado " + contador + " interaciones pero no se ha encontrado el valor " + valorBuscado);
		}

		// Búsqueda binaria iterativa: vamos troceando el array y atomizando las búsquedas
		System.out.println("");
		System.out.println("****************************************************************************************");
		System.out.println("Búsqueda binaria O(logN):");
		System.out.println("");
		encontrado = false;
		contador = 0;
		posicion = 0;
		int mid = 0;
		int startIndex = 0;
		int endIndex = numeros.length - 1;
		
		while (startIndex <= endIndex) {
			contador++;
			mid = startIndex + ((endIndex - startIndex) / 2);

			System.out.println("Iteración " + contador + ". Espacio de búsqueda: " + (endIndex - startIndex + 1));
			if (valorBuscado == numeros[mid]) {
				encontrado = true;
				posicion = mid;
				break;
			} else {
				if (valorBuscado > numeros[mid]) {
					startIndex = mid + 1;
				} else {
					endIndex = mid - 1;
				}
			}
		}
		
		System.out.println("");
		if (encontrado) {
			System.out.println("El valor " + valorBuscado + " lo hemos encontrado en " + contador + " iteraciones y está en la posición " + posicion);
		} else {
			System.out.println("Se han realizado " + contador + " interaciones pero no se ha encontrado el valor " + valorBuscado);
		}
	}	
}
