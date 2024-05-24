package Recursos;

public abstract class Recurso {

	// Atributos.
	private String tipo;
	
	// Constructor.
	public Recurso(String tipo) {
		this.tipo = tipo;
	}

	// Getters & Setters.
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
