package BoletinJUnit.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FridgeTest {

	private Fridge f;
	
	@BeforeEach
	public void init() {
		f = new Fridge();
	}
	
	@Test
	public void contains() {
		f.put("lechuga");
		assertTrue(f.contains("lechuga"));
		assertFalse(f.contains("Queso"));
	}
	
	@Test
	public void take() throws NoSuchItemException {
		f.put("Queso");
		assertTrue(f.contains("Queso"));
		f.take("Queso");
		assertFalse(f.contains("Queso"));
	}
	
	@AfterEach
	public void finish() {
		Fridge f = null;
	}
}
