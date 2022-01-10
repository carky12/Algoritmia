package AlgoritmoBusquedaTexto;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BusquedaTexto {

	public static void main(String[] args) {
		
		String texto = "Hola, esto es es es es es un texto de prueba. Hola como estas, hoy es un buen dia de lluvia. lluvia lluvia";
		String[] palabras;
		Map<String, Integer> dct = new HashMap<>();
		
		//Dividimos el texto en palabras
		palabras = texto.split(" ");
		
		//Recorremos cada palabra del array
		for (String palabra : palabras) {
			
			String palabraFormateada = normalize(palabra);
			
			//Si la palabra está en el mapa aumentamos el contador correspondiente
			if (dct.containsKey(palabraFormateada)) {
				Integer repeticiones = dct.get(palabraFormateada);
				dct.put(palabraFormateada, repeticiones+1);
			} else {
				//Si la palabra no está en el mapa la insertamos
				dct.put(palabraFormateada, 1);
			}
		}
		
		//Imprimimos el resultado del mapa
		for (Entry<String, Integer> entrada : dct.entrySet()) {
			System.out.println(entrada.getKey() + " - " + entrada.getValue());
		}
		
	}
	
	private static String normalize(String palabra1) {
		return palabra1.toLowerCase().replace(",", "").replace(".", "").replace("!", "").replace(" ", "");		
	}
}
