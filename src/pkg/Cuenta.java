package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	Double saldo;
	String nombre;
	String numero;
	List<Transferencia> transferencias = new ArrayList<Transferencia>();
	
	public Cuenta(Double Saldo) {
		this.saldo = Saldo;
	}

	public Cuenta(double d, String numero, String nombre) {
		this.saldo = d;
		this.numero = numero;
		this.nombre = nombre;
	
		Transferencia t = new Transferencia(Transferencia.Tipo.Inicial, d);
		transferencias.add(t);
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
	
	public void mostrarTransferencias() {
		for(Transferencia t : transferencias) {
			System.out.println(t);
		}
	}
	
	
}
