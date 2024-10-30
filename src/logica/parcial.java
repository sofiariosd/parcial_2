package logica;

public class parcial {
	private static double primeraRaiz;
	private static double segundaRaiz;
	
	public void ecuacionSegundoOrden (double a, double b, double c) throws Exception {
		if (a==0) {
			throw new Exception("no se puede por que a es cero");
		}
		// discriminante
		
		double discriminante = b*b - 4*a*c;
		
		if (discriminante < 0) {
			throw new Exception("las raices no son reales para esta ecuación");
		}
		else {
		// raices formula cuadratica con + y -
		double primeraRaiz = (-b+Math.sqrt(discriminante))/(2*a);
		double segundaRaiz = (-b-Math.sqrt(primeraRaiz))/(2*a);
		}
	}
		
	public Object getPrimeraRaiz() {
		// TODO Auto-generated method stub
		return this.primeraRaiz;
	}
	public Object getSegundaRaiz() {
		return this.segundaRaiz;
	}
		
	@Override
	public String toString() {
			return "primera raiz: " + this.primeraRaiz + ", " + "segunda raiz: " + this.segundaRaiz;
	}
	
	
	// pruebas
	public static void main(String[] args) {
        parcial parcial = new parcial();
        try {
            parcial.ecuacionSegundoOrden(1, -3, 2);
            System.out.println(parcial.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

	
}

