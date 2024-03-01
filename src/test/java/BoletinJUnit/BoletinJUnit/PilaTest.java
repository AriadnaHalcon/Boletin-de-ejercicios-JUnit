package BoletinJUnit.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {

private Pila p; 
	
	@BeforeEach
	public void init() {
		p = new Pila();
	}
	
	@Test
	public void push() {
		p.push(10);
		assertTrue(p.isEmpty() == false);
	}
	
	@Test
	public void pop() {
		p.pop();
		assertTrue(p.isEmpty() == true);
	}
	
	@Test
	public void isEmpty() {
		p.push(7);
		assertTrue(p.isEmpty() == false);
		
		p.pop();
		assertTrue(p.isEmpty() == true);
	}
	
	@Test
	public void top() {
		assertTrue(p.top() == null);
		
		p.push(10);
		assertTrue(p.top() != null);
	}


	@AfterEach
	public void finish() {
		Pila p = null;
	}

}
