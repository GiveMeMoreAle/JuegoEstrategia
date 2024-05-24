package Unidades;

import Juego.Reino;

public abstract class Unidad {

	// Atributos.
	private Reino reino;
	private String tipo;
	private int nivel;
	private int vida;
	private int ataque;
	private int defensa;

	// Constructor.
	public Unidad(Reino reino, String tipo, int nivel, int vida, int ataque, int defensa) {
		this.reino = reino;
		this.tipo = tipo;
		this.nivel = nivel;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
	}

	// Getters & Setters.
	public Reino getReino() {
		return reino;
	}

	public void setReino(Reino reino) {
		this.reino = reino;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	
}
