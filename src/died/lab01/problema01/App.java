package died.lab01.problema01;

public class App {

	public static void main(String[] args) {
		Punto P1 = new Punto(1, 1);
		Punto P2 = new Punto(2, 2);

		Recta R1 = new Recta(P1, P2);

		System.out.println("La pendiente de R1 es: " + R1.pendiente());
		
		Punto P3 = new Punto(3,3);
		
		Recta R2 = new Recta(P2, P3);

		System.out.println("La pendiente de R2 es: " + R2.pendiente());
		System.out.println("R1 y R2 representan la misma recta?: " + R1.equals(R2));

	}

}
