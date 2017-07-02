package modelo;

import modelo.decorator.Objeto;

public class Modelo extends Objeto{
	
	public Modelo(String nombre, double precio) {
		super(nombre, precio);
	}

	public double calculatePrecio() {
		return super.calculatePrecio();
	}
	
}
