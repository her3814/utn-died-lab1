package died.lab01.problema01;

public class Punto {
	private float _x;
	private float _y;

	public Punto(float x, float y) {
		this._x = x;
		this._y = y;
	}

	public float getX() {
		return this._x;
	}

	public float getY() {
		return this._y;
	}

	public void setX(float nuevoValor) {
		this._x = nuevoValor;
	}

	public void setY(float nuevoValor) {
		this._y = nuevoValor;
	}
}