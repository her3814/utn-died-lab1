package died.lab01.problema03;

import java.util.Random;

import died.lab01.problema02.Escala;
import died.lab01.problema02.Temperatura;

public class App {

	public static void main(String[] args) {

		Registro r1 = new Registro("DENVER");
		 Registro r2 = new Registro("NAIROBI");
		 
		 Random generadorAleatorio = new Random();
		 
		 for(int i=0;i<10;i++) {
		 r1.agregar(new
		Temperatura(generadorAleatorio.nextDouble()*50,Escala.CELSIUS));
		 }
		 
		 for(int i=0;i<10;i++) { 
			 r2.agregar(new
				 Temperatura(generadorAleatorio.nextDouble()*85 + 20,Escala.FAHRENHEIT));
		 }
		 
		 r1.imprimir();
		 
		 System.out.println("Promedio en "+r1.getCiudad()+": "+r1.MediaAsCelsius()
		+" C�");
		 System.out.println("Maximo en "+r1.getCiudad()+": "+r1.maximo().asCelsius()
		+" C�");
		 r2.imprimir();
		 
		 System.out.println("Promedio en "+r2.getCiudad()+": "+r2.MediaAsFahrenheit() +" F�");
		 System.out.println("Maximo en "+r2.getCiudad()+": "+r2.maximo().asFahrenheit() +"F�");
		}

}
