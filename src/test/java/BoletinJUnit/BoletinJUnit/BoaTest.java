package BoletinJUnit.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoaTest {

	private Boa b;
	
	@BeforeEach
	public void init() {
		b = new Boa("Kaley", 2, "granola bars");
	}
	
	@Test
	public void isHealthy() {
		assertEquals(b.isHealthy(), true);
	}
	
	@Test
	public void fitsInCage() {
		assertEquals(b.fitsInCage(3), true);
		assertEquals(b.fitsInCage(1), false);
	}

	@AfterEach
	public void finish() {
		Boa b = null;
	}
}
