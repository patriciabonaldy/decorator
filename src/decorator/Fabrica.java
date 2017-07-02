package decorator;

import java.util.ArrayList;
import java.util.List;

import modelo.Accesorio;
import modelo.Auto;
import modelo.Modelo;
import modelo.decorator.Objeto;

public class Fabrica {

	private List<Modelo> listModelo = new ArrayList<Modelo>();
	private List<Accesorio> listAccesorios = new ArrayList<Accesorio>();
	
	public static void main(String[] args) {
		Fabrica f = new Fabrica();
		f.setModelo();
		f.setAccesorios();		
		
		Auto auto1 = new Auto(f.listModelo.get(0));
		auto1.addAccesorio(f.listAccesorios.get(0));
		auto1.calculatePrecio();
	}
	
	public void setAccesorios() {
		listAccesorios.add(new Accesorio("Techo corredizo (TC)", 12000, new Objeto()));
		listAccesorios.add(new Accesorio("Aire acondicionado (AA)", 20000, new Objeto()));
		listAccesorios.add(new Accesorio("Sistemas de frenos ABS (ABS)", 14000, new Objeto()));
		listAccesorios.add(new Accesorio("Airbag (AB)", 7000, new Objeto()));
		listAccesorios.add(new Accesorio("Llantas de alefamiliaración (LL)", 12000, new Objeto()));
	}
	
	

	public void setModelo() {
		listModelo.add(new Modelo("Básico sedán", 230000));
		listModelo.add(new Modelo("Básico familiar", 245000));
		listModelo.add(new Modelo("Básico coupé", 270000));
	}
}