package died.lab01.problema01;

public class Recta {
	
	private Punto p1;
	private Punto p2;
	
	public Punto getP1()
	{
		return this.p1;
	}
	
	public Punto getP2() {
		return this.p2;
	}
	
	public Recta() {
		this.p1 = new Punto(0,0);
		this.p2=new Punto(1,1);
	}
	
	public Recta(Punto p1, Punto p2){
		this.p1=p1;
		this.p2=p2;
	}
	
	public float pendiente()
	{
		return (p2.getY() - p1.getY()) / ((p2.getX() - p1.getX()));
	}
	
	public boolean paralelas(Recta otraRecta){
		return this.pendiente() == otraRecta.pendiente();			
	}
	
	public boolean equals(Recta otraRecta) {
		if(!(otraRecta instanceof Recta))
			return false;
		
		Recta r3 = new Recta(this.getP1(), otraRecta.getP2());
		
		if(r3.pendiente() == this.pendiente() && otraRecta.pendiente() == r3.pendiente())
			return true;


		return false;
	}
	
}
