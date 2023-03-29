package com.triangulo;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {
	Triangle tr = new Triangle();
	@Test
	public void teste1() {
		int valor1 = 6;
		int valor2 = 6;
		int valor3 = 6;
		String resultado = tr.test(valor1,valor2, valor3);
		assertEquals("equilátero", resultado);
		
	}
	
	@Test
	public void teste2() {
		int valor1 = 9;
		int valor2 = 9;
		int valor3 = 1;
		String resultado = tr.test(valor1,valor2, valor3);
		assertEquals("isósceles", resultado);
	}
	
	@Test
	public void teste3() {
		int valor1 = 5;
		int valor2 = 4;
		int valor3 = 3;
		String resultado = tr.test(valor1,valor2, valor3);
		assertEquals("escaleno", resultado);
	}
}