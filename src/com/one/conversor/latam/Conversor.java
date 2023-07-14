package com.one.conversor.latam;

public class Conversor {
	
	public double pesoDolar(String valor) {
		return Double.parseDouble(valor) * 0.059;
	}
	
	public double pesoEuro(String valor) {
		return Double.parseDouble(valor) * 0.053;
	}
	
	public double pesoLibra(String valor) {
		return Double.parseDouble(valor) * 0.045;
	}
	
	public double pesoYen(String valor) {
		return Double.parseDouble(valor) * 8.27;
	}
	
	public double pesoWonCoreano(String valor) {
		return Double.parseDouble(valor) * 75.71;
	}
	
	public double dolarPeso(String valor) {
		return Double.parseDouble(valor) * 16.78;
	}
	
	public double euroPeso(String valor) {
		return Double.parseDouble(valor) * 18.85;
	}
	
	public double libraPeso(String valor) {
		return Double.parseDouble(valor) * 21.99;
	}
	
	public double yenPeso(String valor) {
		return Double.parseDouble(valor) * 0.12;
	}
	
	public double wonCoreanoPeso(String valor) {
		return Double.parseDouble(valor) * 0.013;
	}
	
	public boolean validarNumero(String valor) {
		return valor.matches("[0-9]*");
	}

}
