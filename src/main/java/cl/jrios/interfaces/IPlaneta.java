package cl.jrios.interfaces;

import java.util.ArrayList;

import cl.jrios.entidades.Luna;

public interface IPlaneta {

	void getNombre();
	void setNombre(String nombre);
	void getTamanio();
	void setTamanio(int tamanio);
	void getDistanciaSol();
	void setDistanciaSol(int distanciaSol);
	void getLunas();
	void setLunas(ArrayList<Luna> Lunas);
	
}
