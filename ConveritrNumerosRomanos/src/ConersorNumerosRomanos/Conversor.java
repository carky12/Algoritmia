package ConersorNumerosRomanos;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
		String numeroResultado = ""; 
		int contadorCifra = 1;
		String numeroRomano = "";
		
	
		//Pedimos el número
		String numero = JOptionPane.showInputDialog("Introduce un número:" );
		
		try {
			if (validarNumero(numero)) {
				
				String[] cifras = numero.split("");			
				
				for (int i = cifras.length - 1; i >= 0; i--) {
					int entero = Integer.parseInt(cifras[i]);
					
					numeroRomano = convertirNumeroRomano(entero, contadorCifra);
					
					System.out.println("Convirtiendo " + entero +  " --> " + numeroRomano);
					numeroResultado = numeroRomano + numeroResultado;  
					
					contadorCifra += 1;
				}	
				
				System.out.println("El numero " + numero + " en numeros romanos es " + numeroResultado);
			} else {
				
			}	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private static boolean validarNumero(String numero) throws Exception {
		
		try {
			
			int numeroEntero = Integer.parseInt(numero);
			
			if (numeroEntero < 0) {
				throw new Exception("El número no puede ser menor que cero.");
			}
			
			if (numeroEntero > 3999) {
				throw new Exception("El número no puede ser mayor que 3999.");
			}
			
			return true;
			
		} catch (Exception e) {
			throw new Exception("Error en el número de entrada. " + e.getMessage());
		}		
	}
	
	private static String convertirNumeroRomano(int numero, int contadorCifra) {
		String resultado = "";
		
		String signoInferior = "";
		String signoSuperior = "";
		String signoRomano = "";
		int limiteInferior = 0;
		int limiteMedio = 5;
		int limiteSuperior = 10;
		
		int diferenciaAnterior = 0;
		int diferenciaSuperior = 0;
		
		if (contadorCifra == 1) {
			
			signoRomano = "I";
			if (numero > limiteMedio) {
				diferenciaAnterior = numero - limiteMedio;
				diferenciaSuperior = limiteSuperior - numero;
				signoInferior = "V";
				signoSuperior = "X";		
			} else {
				diferenciaAnterior  = numero - limiteInferior;
				diferenciaSuperior = limiteMedio - numero;
				signoInferior = "";
				signoSuperior = "V";		
			}
			
		} else if (contadorCifra == 2) {
			
			signoRomano = "X";
			if (numero > limiteMedio) {
				diferenciaAnterior = numero - limiteMedio;
				diferenciaSuperior = limiteSuperior - numero;
				signoInferior = "L";
				signoSuperior = "C";		
			} else {
				diferenciaAnterior  = numero - limiteInferior;
				diferenciaSuperior = limiteMedio - numero;
				signoInferior = "";
				signoSuperior = "L";		
			}
			
		} else if (contadorCifra == 3) {
			
			signoRomano = "C";
			if (numero > limiteMedio) {
				diferenciaAnterior = numero - limiteMedio;
				diferenciaSuperior = limiteSuperior - numero;
				signoInferior = "D";
				signoSuperior = "M";		
			} else {
				diferenciaAnterior  = numero - limiteInferior;
				diferenciaSuperior = limiteMedio - numero;
				signoInferior = "";
				signoSuperior = "D";		
			}
			
		} else if (contadorCifra == 4) {
			
			signoRomano = "M";
			if (numero > limiteMedio) {
				diferenciaAnterior = numero - limiteMedio;
				diferenciaSuperior = limiteSuperior - numero;
				signoInferior = "M";
				signoSuperior = "M";		
			} else {
				diferenciaAnterior  = numero - limiteInferior;
				diferenciaSuperior = limiteMedio - numero;
				signoInferior = "";
				signoSuperior = "M";		
			}
			
		}
		
		if (numero == limiteSuperior) {
			return signoSuperior;
		}		
		
		if (diferenciaAnterior > 3) {
			//Nos quedamos con el límite superior
			
			
			for (int i = 0; i < diferenciaSuperior; i++) {
				resultado += signoRomano;					
			}
			resultado += signoSuperior;
			
		} else {
			resultado = signoInferior;
			//Nos quedamos con el límite inferior
			for (int i = 0; i < diferenciaAnterior; i++) {
				resultado += signoRomano;					
			}
		}
		
		
		return resultado;
		
	}
	
	

}
