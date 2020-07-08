package cl.jrios.principal;

import java.util.ArrayList;

import cl.jrios.entidades.Luna;
import cl.jrios.entidades.Planeta;
import cl.jrios.inyeccion.SistemaSolar;

public class Principal {

	public static void main(String[] args) {
		
		// Planeta tierra
		ArrayList<Luna> lunas = new ArrayList<Luna>();		
		Luna luna = new Luna("luna", 2222, 24.0);
		lunas.add(luna);
		Planeta tierra = new Planeta("tierra", 233, 1222, lunas);
		
		// Jupiter
		ArrayList<Luna> lunasJupiter = new ArrayList<Luna>();		
		
		Luna luna1 = new Luna("asadaa", 1212, 224.0);
		Luna luna2 = new Luna("jHJn", 588, 214.0);
		Luna luna3 = new Luna("2dAJ", 121312, 764.0);
		lunasJupiter.add(luna1);
		lunasJupiter.add(luna2);
		lunasJupiter.add(luna3);
		
		Planeta jupiter = new Planeta("Jupiter", 22234, 122222333, lunasJupiter);
		
		ArrayList<Planeta> sistema = new ArrayList<Planeta>();
		
		sistema.add(jupiter);
		sistema.add(tierra);
		
		SistemaSolar ss = new SistemaSolar(sistema);
		
		System.out.println(ss.mostrarPlanetas());
		
	}

}
