package calculadora;

public class Criatura {
	
	private int cantidad;
	private int CR;
	
	public Criatura(int cantidad,int CR) {
		
		this.cantidad = cantidad;
		this.CR = CR;
	}
	
	
	public int getCR() {
		return CR;
	}
	
	public int getCantidad() {
		return cantidad;
	}
}
