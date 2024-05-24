package Estructuras;

public class Casa extends Estructura {

	// Constructor con parámetros.
	public Casa(String tipo, int vida, int[][] coste, int tiempoConstruccion) {
		super(tipo, vida, coste, tiempoConstruccion);

	}

	// Constructor sin parámetros.
	public Casa() {
		super("Casa", 500, new int[][] {{70},{0},{0},{0},{0}}, 8);
		
	}

}
