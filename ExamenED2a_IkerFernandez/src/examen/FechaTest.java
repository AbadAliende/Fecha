package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {

	@Test
	void C1() {
		boolean valorEsperado = false;
		boolean valorObtenido = Fecha.validarFecha(10, 2, 2);
		assertEquals(valorEsperado, valorObtenido);
		System.out.println("C1, False");
	}

	@Test
	void C2() {
		boolean valorEsperado = false;
		boolean valorObtenido = Fecha.validarFecha(10, 13, 13);
		assertEquals(valorEsperado, valorObtenido);
		System.out.println("C2, False");
	}

	@Test
	void C3() {
		boolean valorEsperado = false;
		boolean valorObtenido = Fecha.validarFecha(10, 10, 32);
		assertEquals(valorEsperado, valorObtenido);
		System.out.println("C3, False");
	}

	@Test
	void C4() {
		boolean valorEsperado = true;
		boolean valorObtenido = Fecha.validarFecha(10, 2, 28);
		assertEquals(valorEsperado, valorObtenido);
		System.out.println("C4, True");
	}

}
