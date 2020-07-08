package cl.jrios.entidades;

import java.util.ArrayList;

import cl.jrios.interfaces.IPlaneta;

public class Planeta implements IPlaneta {

	String nombre;
	int tamanio;
	int distanciaSol;
	ArrayList<Luna> lunas;

	public Planeta(String nombre, int tamanio, int distanciaSol, ArrayList<Luna> lunas) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.distanciaSol = distanciaSol;
		this.lunas = lunas;
	}

	public void getNombre() {
		System.out.println(nombre);
	}

	public void getTamanio() {
		System.out.println(tamanio);

	}

	public void getDistanciaSol() {
		System.out.println(distanciaSol);
	}

	public void getLunas() {
		System.out.println(lunas);

	}

//	public void getLunas(int i) {
//		System.out.println(lunas.get(i));
//	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public void setDistanciaSol(int distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public void setLunas(ArrayList<Luna> lunas) {
		this.lunas = lunas;
	}

	public String mostrarLunas() {
		String muestra = "";
		for (int i = 0; i < lunas.size(); i++) {
			muestra += lunas.get(i);
		}
		return muestra;
	}

	@Override
	public String toString() {
		return "El planeta " + nombre + " está a " + distanciaSol + " km del sol, su tamaño es de " + tamanio
				+ " y tiene " + lunas.size() + " lunas, las cuales son: \n" + this.mostrarLunas() + "\n";
	}

}
