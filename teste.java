package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.project.*;
import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    private final Calculator calculator = new Calculator();

	@Test
    void adicao() {
        assertEquals(2, calculator.adicao(1, 1));		//inteiros
		assertEquals(5, calculator.adicao(2.5, 2.5));  //decimais
		assertEquals(5, calculator.adicao(10, -5));		//numero negativo
		assertEquals(10, calculator.adicao(0, 10)); // teste com zero
		assertEquals('d', calculator.adicao(40, 60)); //numeros invalidos
    }
	
	@Test
	void sub() {
		assertEquals(0, calculator.sub(2, 2));
		assertEquals(4.75, calculator.sub(5, 0.25));
		assertEquals(50, calculator.sub(25, -25));
		assertEquals('x', calculator.sub(200, 80));
		assertEquals(10, calculator.sub(10, 0));
	}
	
	@Test
	void mult() {
		assertEquals(10, calculator.mult(5, 2));
		assertEquals(6.25, calculator.mult(2.5, 2.5));
		assertEquals(50,calculator.mult(-5, -10));
		assertEquals('p', calculator.mult(40, 2));
		assertEquals(0, calculator.mult(200, 0));
	}
	
	@Test
	void div() {
		assertEquals(20, calculator.div(40, 2));
		assertEquals(4, calculator.div(10, 2.5));
		assertEquals(-2, calculator.div(-40, 20));
		assertEquals('p', calculator.div(160, 2));
		assertEquals(0, calculator.div(100, 0));
	
	
	}

	
}