package org.iesalandalus.programacion.alfilajedrez;
import javax.naming.OperationNotSupportedException;

public class Alfil {
	
	private Color color;
	private Posicion posicion;
	private static final String ERROR_MOVIMIENTO = "Movimiento no permitido: ";
	
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
	
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new IllegalArgumentException("La dirección no puede ser nula.");
		}
		if (pasos < 0) {
			throw new IllegalArgumentException("El número de pasos debe ser positivo.");
		}
		switch (direccion) {
			case ARRIBA_DERECHA:
				try {
					posicion.setFila(posicion.getColumna() + pasos);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO + e.getMessage());
				}
				break;
			case ABAJO_DERECHA:
				try {
					posicion.setFila(posicion.getColumna() + pasos);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO + e.getMessage());
				}
				break;	
			case ABAJO_IZQUIERDA:
				try {
					posicion.setFila(posicion.getColumna() + pasos);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO + e.getMessage());
				}
				break;
			case ARRIBA_IZQUIERDA:
				try {
					posicion.setFila(posicion.getColumna() - pasos);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO + e.getMessage());
				}
				break;
			default:
				break;
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