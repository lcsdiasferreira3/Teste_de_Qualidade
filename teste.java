package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.project.*;
import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    private final Calculator calculator = new Calculator();

	@Test
    void adicao() {
        assertEquals(2, calculator.adicao(1, 1));
    }
	
	@Test
	void sub() {
		assertEquals(0, calculator.sub(2, 2));
	}
	
	@Test
	void mult() {
		assertEquals(10, calculator.mult(5, 2));
	}
	
	@Test
	void div() {
		assertEquals(20, calculator.div(40, 2));
		assertEquals(10, calculator.div(1000, 100));
	}

	
}