package died.lab01.problema02;

public class Temperatura {
	private Double grados;
	private Escala escala;

	public Escala getEscala() {
		return this.escala;
	}

	public double getGrados() {
		return this.grados;
	}

	public Temperatura() {
		this.grados = 0.0;
		this.escala = Escala.CELSIUS;
	}

	public Temperatura(double temperatura, Escala escala) {
		this.grados = temperatura;
		this.escala = escala;
	}

	public String toString() {
		switch (this.escala) {
		case CELSIUS:
			return this.grados + "°C";
		case FAHRENHEIT:
			return this.grados + "°F";
		default:
			return super.toString();
		}
	}

	public Double asCelsius() {
		if (this.escala == Escala.CELSIUS)
			return grados;
		else
			return (this.grados - 32) * 5 / 9;
	}

	public Double asFahrenheit() {
		if (this.escala == Escala.FAHRENHEIT)
			return grados;
		else
			return (this.grados * 9 / 5) + 32;
	}

	public void aumentar(Temperatura temperatura) {

		if(temperatura.getGrados() <= 0)
			throw new Error("Debe indicar un valor de temperatura positivo");
		
		if(temperatura.getEscala() == this.escala) {
			this.grados = this.grados + temperatura.getGrados();
		}
		
		else 
			if(this.escala == Escala.CELSIUS)
				this.grados = this.grados + temperatura.asCelsius();
		else 
			this.grados=this.grados+temperatura.asFahrenheit();
	}

	public void disminuir(Temperatura temperatura) {
		
		if(temperatura.getGrados() <= 0)
			throw new Error("Debe indicar un valor de temperatura positivo");
		
		if(temperatura.getEscala() == this.escala) {
			this.grados = this.grados - temperatura.getGrados();
		}
		
		else 
			if(this.escala == Escala.CELSIUS)
				this.grados = this.grados - temperatura.asCelsius();
		else 
			this.grados=this.grados - temperatura.asFahrenheit();
	}
}
