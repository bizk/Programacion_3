package actividades;

public enum Alfabeto {
	A(1, 0), B(1, 0), C(2, 0), D(3, 0), E(4, 0), F(5, 0), G(6, 0), H(7, 0), I(8);
	private final int pos;
	private int cant;
	Alfabeto(int pos, int cant) {					
		this.pos = pos;
		this.cant = cant;
	}
}
