package BoletinJUnit.BoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	private Account a;
	
	@BeforeEach
	public void init() {
		a = new Account("Maria", 1282498365927l, 821409f);
	}
	
	@Test
	public void deposit() {
		assertTrue(a.deposit(129028f));
		assertFalse(a.deposit(-01397f));
	}
	
	@Test
	public void withdraw() {
		assertTrue(a.withdraw(100, 1000));
		assertFalse(a.withdraw(-2, 283623748));
	}
	
	@Test
	public void addInterest() {
		a.addInterest();
	}
	
	@AfterEach
	public void finish() {
		Account a = null;
	}

}
