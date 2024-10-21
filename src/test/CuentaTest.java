package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

	static Cuenta cuenta1, cuenta2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta1 = new Cuenta(50d, "12345",  "Pepe");
		cuenta2 = new Cuenta(0d, "67890",  "Juan");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar(){
		double saldoActual = cuenta1.getSaldo();
		cuenta1.ingresar(500d);
		assertEquals(saldoActual+500, cuenta1.getSaldo());
	}
	@Test
	void testRetirar() {
		double saldoActual = cuenta1.getSaldo();
		cuenta1.retirar(300d);
		assertEquals(saldoActual-300, cuenta1.getSaldo());
	}
	
	@Test
	void test0014() {
		cuenta1.retirar(200d);
		cuenta2.retirar(350d);
		cuenta1.ingresar(100d);
		cuenta2.retirar(250d);
		cuenta2.retirar(150d);
		cuenta1.retirar(200d);
		cuenta2.ingresar(50d);
		cuenta2.retirar(100d);
			
		System.out.println("Cuenta 12345: " + cuenta1.getSaldo());
		System.out.println("Cuenta 67890: " + cuenta2.getSaldo());;
	
		System.out.println("\n Mostrar Transferencias Cuenta1: ");
		cuenta1.mostrarTransferencias();
		System.out.println("\n Mostrar Transferencias Cuenta2:");
		cuenta2.mostrarTransferencias();
		assertEquals(-250, cuenta1.getSaldo());
		assertEquals(-450, cuenta2.getSaldo());
		
	}

}
