package pkg;

public class Transferencia {

	enum Tipo{Ingreso, Reintregro, Inicial}
	
	Tipo tipo;
	
	Double cantidad;
	
	Transferencia(Transferencia.Tipo tipo, Double Cantidad){
		
		this.tipo = tipo;
		this.cantidad = Cantidad;
		
		
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	@Override
	public String toString() {
		
		String transferencia;
		
		switch(tipo){
		case Ingreso:
			transferencia = "Ingreso de " + cantidad + "€";
			break;
			
		case Reintregro:
			transferencia = "Reintegro de " + cantidad + "€";
			break;
		case Inicial:
			transferencia = "Saldo inicial de " + cantidad + "€";
			break;
		default:
			transferencia = "No válida";

		}
		
		
		return transferencia;
	}
	
	
	
	
	
}
