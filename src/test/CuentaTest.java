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
		cuenta1 = new Cuenta(50d, "67890",  "Juan");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar(){
		cuenta1.ingresar(500d);
		assertEquals(500, cuenta1.getSaldo());
	}
	@Test
	void testRetirar() {
		cuenta1.retirar(500d);
		assertEquals(-500, cuenta1.getSaldo());
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
	
		assertEquals(-250, cuenta1.getSaldo());
		assertEquals(-450, cuenta2.getSaldo());
	}

}
