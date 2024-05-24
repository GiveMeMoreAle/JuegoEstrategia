package Unidades;

import Estructuras.Estructura;
import IU.Msg;
import Juego.Reino;
import Recursos.Recurso;

public class Aldeano extends Unidad implements Constructor, Recolector {

	// Atributos.
	private int capacidadRecursos;

	// Constructor con parámetros.
	public Aldeano(Reino reino, String tipo, int nivel, int vida, int ataque, int defensa, int capacidadRecursos) {
		super(reino, tipo, nivel, vida, ataque, defensa);
		this.capacidadRecursos = capacidadRecursos;
	}

	// Constructor por defecto.
	public Aldeano(Reino reino) {
		super(reino, "Aldeano", 1, 50, 5, 5);
		this.capacidadRecursos = 10;
	}

	// Getters & Setters.
	public int getCapacidadRecursos() {
		return capacidadRecursos;
	}

	public void setCapacidadRecursos(int capacidadRecursos) {
		this.capacidadRecursos = capacidadRecursos;
	}


	/*
	 *      __  __     __   _                 _               
	 *     |  \/  |   /_/  | |_    ___     __| |   ___    ___ 
	 *     | |\/| |  / _ \ | __|  / _ \   / _` |  / _ \  / __|
	 *     | |  | | |  __/ | |_  | (_) | | (_| | | (_) | \__ \
	 *     |_|  |_|  \___|  \__|  \___/   \__,_|  \___/  |___/
	 *                                                        
	 */

	@Override
	public void construir(Estructura estructura) {
		try {
			// Si en el reino hay los recursos suficientes para poder construir la estructura (cumpliendo los requisitos de construcción de la estructura).
			int[][] coste = estructura.getCoste();
			
			if(this.getReino().verificarRecursos(coste)) {
				this.getReino().deducirRecursos(coste);
				Msg.construir(estructura.getTipo());
				this.getReino().agregarEstructura(estructura);
				
			} else {
				Msg.error("No hay suficientes recursos para construir " + estructura.getTipo() + ".");
			}

		} catch(NullPointerException e) {
			Msg.error("No se ha asignado ninguna estructura a construir.");
		}
	}

	@Override
	public void recolectar(Recurso recurso) {
		try {
			Msg.recolectar(recurso.getTipo());
			this.getReino().agregarRecurso(recurso, capacidadRecursos);

		} catch(NullPointerException e) {
			Msg.error("No se ha asignado ningún recurso a recolectar.");
		}
	}

}
