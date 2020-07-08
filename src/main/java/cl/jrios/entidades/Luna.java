package cl.jrios.entidades;

import cl.jrios.interfaces.ILuna;

public class Luna implements ILuna {
	String nombre;
	int diametro;
	double tiempoOrbita;

	public Luna(String nombre, int diametro, double tiempoOrbita) {
		super();
		this.nombre = nombre;
		this.diametro = diametro;
		this.tiempoOrbita = tiempoOrbita;
	}

	public void getNombre() {
		System.out.println(nombre);

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void getDiametro() {
		System.out.println(diametro);

	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public void getTiempoOrbita() {
		System.out.println(tiempoOrbita);

	}

	public void setTiempoOrbita(double tiempoOrbita) {
		this.tiempoOrbita = tiempoOrbita;
	}

	@Override
	public String toString() {
		return "- Luna  de nombre " + nombre + " que mide " + diametro + " km de diametro y el tiempo de orbita es "
				+ tiempoOrbita + " días. \n";
	}

}
