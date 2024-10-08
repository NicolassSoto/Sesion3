package pkg;

public class Cuenta {

	Double saldo;
	String nombre;
	String numero;
	
	public Cuenta(Double Saldo) {
		this.saldo = Saldo;
	}

	public Cuenta(double d, String numero, String nombre) {
		this.saldo = d;
		this.numero = numero;
		this.nombre = nombre;
		// TODO Auto-generated constructor stub
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(Double i) {
		this.saldo = saldo + i;
		
	}

	public Double getSaldo() {
		return saldo;
	}

	public void retirar(double d) {
		this.saldo -= d;
		
	}
	
}
