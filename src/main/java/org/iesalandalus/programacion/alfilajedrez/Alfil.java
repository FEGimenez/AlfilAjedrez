package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {
	
	private Color color;
	private Posicion posicion;

	
	public Alfil() {
		setColor(Color.NEGRO);
		setPosicion(new Posicion(8, 'f'));
	}
	
	public Alfil(Color color) {
		setColor(color);
		
			if (color.equals(Color.BLANCO)) {
				setPosicion(new Posicion(1, 'f'));
			} else {
				setPosicion(new Posicion(8, 'f'));
			}
	}
	
	public Alfil(Color color, char columna) {
		setColor(color);
			if (columna != 'c' || columna !='f') {
				throw new IllegalArgumentException("ERROR: Columna no válida.");
			} else {
				if (color == Color.BLANCO) {
					setPosicion(new Posicion(1, columna));
				} else {
					setPosicion(new Posicion(8, columna));
				}	
			}
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
