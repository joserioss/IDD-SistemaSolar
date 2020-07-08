package cl.jrios.inyeccion;

import java.util.ArrayList;

import cl.jrios.entidades.Planeta;

public class SistemaSolar {

	private ArrayList<Planeta> planetas = new ArrayList<Planeta>();

	public SistemaSolar(ArrayList<Planeta> planetas) {
		this.planetas = planetas;
	}

	public String mostrarPlanetas() {
	
		String muestra = "";
		for(int i = 0; i < planetas.size() ; i++) {
			muestra += planetas.get(i);
		}
		return muestra;
	}
}
