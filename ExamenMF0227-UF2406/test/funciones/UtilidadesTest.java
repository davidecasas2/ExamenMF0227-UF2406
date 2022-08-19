package funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UtilidadesTest {
	
	static Utilidades u;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		u= new Utilidades();
	}

	@Test
	void devuelveNotaTest() {
		assertEquals("Suspenso", u.devuelveNota(4));
		assertEquals("Bien", u.devuelveNota(6));
		assertEquals("Notable", u.devuelveNota(8));
		assertEquals("Sobresaliente", u.devuelveNota(9.5));
		assertEquals("Matrícula", u.devuelveNota(10));
		assertThrows(ArithmeticException.class, ()->u.devuelveNota(-3));
		assertThrows(ArithmeticException.class, ()->u.devuelveNota(22));
	}

}
