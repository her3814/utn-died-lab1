package problema03;

import died.lab01.problema02.Temperatura;

public class Registro {
	private final int MAX_HIST_SIZE = 20;
	private String ciudad;
	private Temperatura[] historico;

	private int historicoSize;
	private int historicoLastIndex;

	private int historicoCapacidadDisponible() {
		return this.historicoSize - (this.historicoLastIndex + 1);
	}

	private int historicoCantidadCargada() {
		return this.historicoLastIndex + 1;
	}

	public Registro() {
		this.inicializar("-");
	}

	public Registro(String nombreCiudad) {
		this.inicializar(nombreCiudad);
	}
	
	public void inicializar(String nombreCiudad) {
		this.ciudad = nombreCiudad;
		this.historico = new Temperatura[MAX_HIST_SIZE];
		this.historicoSize = MAX_HIST_SIZE;
		this.historicoLastIndex = -1;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void imprimir() {
		System.out.println("TEMPERATURAS REGISTRADAS EN: " + this.ciudad);

		for (int i = 0; i <= this.historicoLastIndex; i++) {
			System.out.println(this.historico[i].toString());
		}
	}

	public void agregar(Temperatura temperatura) {
		if (this.historicoCapacidadDisponible() > 0) {
			this.historico[++this.historicoLastIndex] = temperatura;
		}
	}

	public double MediaAsCelsius() {
		double media = 0.0;

		for (Temperatura temperatura : historico) {
			if(temperatura != null)
			media += temperatura.asCelsius();
		}
		return media / this.historicoCantidadCargada();
	}

	public double MediaAsFahrenheit() {
		double media = 0.0;

		for (Temperatura temperatura : historico) {
			if(temperatura != null)
			media += temperatura.asFahrenheit();
		}
		return media / this.historicoCantidadCargada();
	}

	public Temperatura maximo() {
		return maximo(this.historico[0], 0);
	}

	private Temperatura maximo(Temperatura maxima, int lastIdx) {
		if (lastIdx >= this.historicoLastIndex)
			return maxima;

		return historico[lastIdx + 1].asCelsius() > maxima.asCelsius() ? maximo(historico[lastIdx + 1], lastIdx + 1)
				: maximo(maxima, lastIdx + 1);
	}

}
