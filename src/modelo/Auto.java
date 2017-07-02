package modelo;

import java.util.ArrayList;
import java.util.List;

import modelo.decorator.Objeto;

public class Auto extends Modelo {
	private List<Accesorio> accesoriosList = new ArrayList<Accesorio>();
	
	public Auto(Objeto objeto) {
		super(objeto.getNombre(), objeto.calculatePrecio());
		System.out.println("Auto "+objeto.getNombre()+" precio: "+objeto.calculatePrecio());
	}

	public void setAccesoriosList(List<Accesorio> accesoriosList) {
		this.accesoriosList = accesoriosList;
	}
	
	public void addAccesorio(Accesorio a){
		System.out.println("Añadiendo accesorio "+a.getNombre()+" precio basico: "+a.calculatePrecio());
		this.accesoriosList.add(a);
	}
	
	public double calculatePrecio() {
		double precioAuto = super.calculatePrecio();
		precioAuto +=getTotalPreciosAccesorios();
		System.out.println("Precio total del auto "+precioAuto);
		return precioAuto;
	}

	private double getTotalPreciosAccesorios() {
		// TODO Auto-generated method stub
		double total =0;
		for(Accesorio a :accesoriosList){
			total+=a.calculatePrecio();
		}
		return total;
	}
	
	

}
