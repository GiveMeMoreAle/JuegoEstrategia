package Juego;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import Estructuras.Estructura;
import IU.Msg;
import Recursos.Recurso;
import Unidades.Unidad;

public class Reino {

	/*
	 *         _      _            _   _               _                 
	 *        / \    | |_   _ __  (_) | |__    _   _  | |_    ___    ___ 
	 *       / _ \   | __| | '__| | | | '_ \  | | | | | __|  / _ \  / __|
	 *      / ___ \  | |_  | |    | | | |_) | | |_| | | |_  | (_) | \__ \
	 *     /_/   \_\  \__| |_|    |_| |_.__/   \__,_|  \__|  \___/  |___/
	 *                                                                   
	 */

	// Colecciones para almacenar estructuras, unidades y recursos.
	private Map<String, Estructura> estructuras;
	private Map<String, Unidad> unidades;
	private Map<String, Integer> recursos;

	// Contadores para las ID's.
	private int contadorEstructuras;
	private int contadorUnidades;

	// Constructor.
	public Reino() {
		this.estructuras = new HashMap<>();
		this.unidades = new HashMap<>();
		this.recursos = new LinkedHashMap<>();

		// Inicializar el mapa de recursos en orden.
		this.recursos.put("Madera", 0);
		this.recursos.put("Comida", 0);
		this.recursos.put("Piedra", 0);
		this.recursos.put("Oro", 0);
		this.recursos.put("Gemas", 0);

		this.contadorEstructuras = 0;
		this.contadorUnidades = 0;
	}

	/*
	 *      __  __     __   _                 _               
	 *     |  \/  |   /_/  | |_    ___     __| |   ___    ___ 
	 *     | |\/| |  / _ \ | __|  / _ \   / _` |  / _ \  / __|
	 *     | |  | | |  __/ | |_  | (_) | | (_| | | (_) | \__ \
	 *     |_|  |_|  \___|  \__|  \___/   \__,_|  \___/  |___/
	 *                                                        
	 */

	// Método para generar una ID única.
	private String generarIdEstructura(Estructura estructura) {
		contadorEstructuras++;
		return estructura.getTipo() + " " + contadorEstructuras;
	}

	// Método para generar una ID única.
	private String generarIdUnidad(Unidad unidad) {
		contadorUnidades++;
		return unidad.getTipo() + " " + contadorUnidades;
	}

	// Método para añadir una estructura.
	public void agregarEstructura(Estructura estructura) {
		String id = generarIdEstructura(estructura);
		estructuras.put(id, estructura);
	}

	// Método para añadir una unidad.
	public void agregarUnidad(Unidad unidad) {
		String id = generarIdUnidad(unidad);
		unidades.put(id, unidad);
	}

	// Método para obtener una estructura.
	public Estructura obtenerEstructura(String estructura) {
		return estructuras.get(estructura);
	}

	// Método para obtener una unidad.
	public Unidad obtenerUnidad(String unidad) {
		return unidades.get(unidad);
	}

	// Método para añadir un recurso.
	public void agregarRecurso(Recurso recurso, int cantidad) {
		recursos.put(recurso.getTipo(), recursos.getOrDefault(recurso, 0) + cantidad);
	}

	// Método para obtener un recurso.
	public int obtenerRecurso(String tipo) {
		return recursos.getOrDefault(tipo, 0);
	}

	// Método para verificar si hay recursos suficientes para construir.
	public boolean verificarRecursos(int[][] coste) {
		String[] tiposRecursos = {"Madera", "Comida", "Piedra", "Oro", "Gemas"};

		for(int i = 0; i < tiposRecursos.length; i++) {
			if(recursos.get(tiposRecursos[i]) < coste[i][0]) {
				return false;
			}
		}

		return true;
	}

	// Método para deducir los recursos necesarios para construir.
	public void deducirRecursos(int[][] coste) {
		String[] tiposRecursos = {"Madera", "Comida", "Piedra", "Oro", "Gemas"};
		
		for(int i = 0; i < coste.length; i++) {
			recursos.put(tiposRecursos[i], recursos.get(tiposRecursos[i]) - coste[i][0]);
		}
	}

	// Método para listar todas las estructuras.
	public void listarEstructuras() {
		Msg.simple("Estructuras en el reino:");

		for(Map.Entry<String, Estructura> entry : estructuras.entrySet()) {
			Msg.simple(" - (" + entry.getValue().getTipo() + ") " + entry.getKey());
		}
	}

	// Método para listar todas las unidades.
	public void listarUnidades() {
		Msg.simple("Unidades en el reino:");

		for(Map.Entry<String, Unidad> entry : unidades.entrySet()) {
			Msg.simple(" - (" + entry.getValue().getTipo() + ") " + entry.getKey());
		}
	}

	// Método para listar todas los recursos.
	public void listarRecursos() {
		Msg.simple("Recursos en el reino:");

		for(String tipo : recursos.keySet()) {
			Msg.simple(" - " + tipo + ": " + recursos.get(tipo));
		}
	}

}
