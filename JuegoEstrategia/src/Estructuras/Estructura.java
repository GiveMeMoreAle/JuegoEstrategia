package Estructuras;

public abstract class Estructura {

	// Atributos.
	private String tipo;
	private int vida;
	private int[][] coste = new int[5][1]; // 0: madera - 1: comida - 2: piedra - 3: oro - 4: gemas
	private int tiempoConstruccion;
	private String estado;

	// Constructor.
	public Estructura(String tipo, int vida, int[][] coste, int tiempoConstruccion) {
		this.tipo = tipo;
		this.vida = vida;
		this.coste = coste;
		this.tiempoConstruccion = tiempoConstruccion;
	}

	// Getters & Setters.
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int[][] getCoste() {
		return coste;
	}

	public void setCoste(int[][] coste) {
		this.coste = coste;
	}

	public int getTiempoConstruccion() {
		return tiempoConstruccion;
	}

	public void setTiempoConstruccion(int tiempoConstruccion) {
		this.tiempoConstruccion = tiempoConstruccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


}
