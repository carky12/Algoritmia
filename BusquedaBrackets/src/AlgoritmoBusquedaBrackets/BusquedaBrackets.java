package AlgoritmoBusquedaBrackets;

import java.util.Stack;

public class BusquedaBrackets {

	public static void main(String[] args) {
		
		boolean bError = false;
		String input = "()(())";
		String[] caracteres = input.split("");
		
		Stack<String> pila = new Stack<>();
		
		for (String elemento : caracteres) {
			if (esSimboloApertura(elemento)) {
				pila.push(elemento);				
			} else {
				String ultimoElemento = pila.pop();
				if (!cierraSimbolo(ultimoElemento, elemento)) {
					bError = true;
				}
			}
		}
		
		if (!pila.empty()) {
			bError = true;
		}
		
		if (bError) {
			System.out.println("El texto no es correcto");
		} else {
			System.out.println("El texto es correcto");
		}
		
	}
	
	private static boolean esSimboloApertura(String caracter) {
		return (caracter.contains("(") || caracter.contains("[") || caracter.contains("{"));
	}
	
	private static boolean cierraSimbolo(String ultimoElemento, String elemento) {
		if (ultimoElemento.equals("(") && !elemento.equals(")")) {
			return false;
		}
		
		if (ultimoElemento.equals("[") && !elemento.equals("]")) {
			return false;
		}

		if (ultimoElemento.equals("{") && !elemento.equals("}")) {
			return false;
		}

		return true;
	}
}
