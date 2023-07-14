package com.one.conversor.latam;

import javax.swing.JOptionPane;

public class ConversorApp {

	public static void main(String ... H) {
		
		Conversor conversor = new Conversor();
		
		int respuesta;
		String tipoCambio;
		double resultado;
		
		
		do {
			String divisa = JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor", JOptionPane.CLOSED_OPTION, null, new Object[] {"Conversor de moneda", "Conversor de Temperatura", "Conversor de medidas"}, "Conversor de moneda").toString();
			if (divisa.equals("Conversor de moneda")) {
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor"));
				
				tipoCambio = JOptionPane.showInputDialog(null, "Elija la conversión que desea", "Tipo de cambio", JOptionPane.CLOSED_OPTION, null, new Object[] {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libra", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libra a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"}, "De Pesos a Dólar").toString();
				switch(tipoCambio) {
				case "De Pesos a Dólar" :
					resultado = conversor.pesoDolar(valor);
					JOptionPane.showMessageDialog(null, "US$" + resultado);
					break;
					
				case "De Pesos a Euro" :	
					resultado = 0.0;
					JOptionPane.showMessageDialog(null, "€" + resultado);
					break;
					
				case "De Pesos a Libra" :	
					resultado = 0.0;
					JOptionPane.showMessageDialog(null, "£" + resultado);
					break;
					
				case "De Pesos a Yen" :	
					resultado = 0.0;
					JOptionPane.showMessageDialog(null, "¥" + resultado);
					break;
					
				case "De Pesos a Won Coreano" :	
					resultado = 0.0;
					JOptionPane.showMessageDialog(null, "₩" + resultado);
					break;
					
				case "De Dólar a Peso" :	
					resultado = 0.0;
					JOptionPane.showMessageDialog(null, "$" + resultado);
					break;
					
				case "De Euro a Peso" :	
					resultado = 0.0;
					JOptionPane.showMessageDialog(null, "€" + resultado);
					break;
					
				case "De Libra a Peso" :	
					resultado = 0.0;
					JOptionPane.showMessageDialog(null, "€" + resultado);
					break;
					
				case "De Yen a Peso" :	
					resultado = 0.0;
					JOptionPane.showMessageDialog(null, "€" + resultado);
					break;
					
				case "De Won Coreano a Peso" :	
					resultado = 0.0;
					JOptionPane.showMessageDialog(null, "€" + resultado);
					break;
				}
				
				
			} else if (divisa.equals("Conversor de Temperatura")) {
				JOptionPane.showMessageDialog(null, "Usted seleccionó: " + divisa);
			} else {
				JOptionPane.showMessageDialog(null, "Usted seleccionó: " + divisa);
			}
			
			respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?");
			
		} while (respuesta < 1);
		JOptionPane.showMessageDialog(null, "Fin del programa");
		
	}

}
