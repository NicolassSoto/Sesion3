package pkg;

public class Cuenta {

	Double saldo;
	
	public Cuenta(Double Saldo) {
		this.saldo = Saldo;
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
		// TODO Auto-generated method stub
		
	}
	
}
