package modelo.decorator;

public class Objeto extends Precio {
	
	private String nombre;
	private double precio;
	
	public Objeto() {
	}
	public Objeto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public double calculatePrecio() {
		return precio;
	}
	
	

}
