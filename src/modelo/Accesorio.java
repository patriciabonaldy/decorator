package modelo;

import modelo.decorator.Objeto;

public class Accesorio extends Objeto{
	
	public Accesorio(String nombre, double precio, Objeto objeto) {
		super(nombre, precio);
	}

	public double calculatePrecio() {
		return super.calculatePrecio();
	}
	
}
