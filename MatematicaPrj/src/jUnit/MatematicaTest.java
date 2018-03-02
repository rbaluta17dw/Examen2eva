package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import matematica.Matematica;

public class MatematicaTest {

	@Test
	public void testSuma() {
		Matematica m = new Matematica();
		assertEquals(4, m.suma(3, 2));
	}

	@Test
	public void testMayor() {
		Matematica m = new Matematica();
		assertTrue(m.mayor(3, 2));
	}

}
