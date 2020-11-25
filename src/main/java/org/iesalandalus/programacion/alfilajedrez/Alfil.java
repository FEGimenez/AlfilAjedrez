package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {
	
	private Color color;
	private Posicion posicion;

	
	public Alfil(Color color, Posicion posicion) {
		this.color = color;
		this.posicion = posicion;
	}
	
	public Color getColor() {
		return color;
	}
	
	private void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		} else {
			this.color = color;
		}
	}
	public Posicion getPosicion() {
		return posicion;
	}
	
	private void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	
	}
}
