package BoletinJUnit.BoletinJUnit;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubscripcionOperadorAritmeticoTest {

	private Subscripcion sub;
	private OperadorAritmetico o;
	
	@BeforeEach
	public void init() {
		sub = new Subscripcion(10, 5);
		o = new OperadorAritmetico();
	}

	@Test
	public void precioPorMes() {
		assertNotEquals(5, sub.precioPorMes());
		
		assertNotEquals(10, sub.precioPorMes());
	}
	
	@Test
	public void suma() {
		assertEquals(20, o.suma(15, 5));
		assertNotEquals(20, o.suma(19, 3));
	}
	
	@Test
	public void division() {
		try {
			assertEquals(4, o.division(8, 2));
			assertNotEquals(4, o.suma(2, 8));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterEach
	public void finish() {
		Subscripcion sub = null;
		OperadorAritmetico o = null;
	}

	
	

}
