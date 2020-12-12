package com.mycompany.calculadora;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCalculadoraConstructor() {
        try {
            new Calculadora();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testSoma()
    {
		System.out.println("Soma:");
        Calculadora c = new Calculadora();
		int a = 10;
		int b = 5;
		int result = c.som(a,b);
        try {
			assertEquals(10, result);
        } catch (AssertionError e) {
            fail("Resultados diferentes");
        }
    }
    @Test
    public void testSub()
    {
		System.out.println("Subtração:");
        Calculadora c = new Calculadora();
		int a = 10;
		int b = 5;
		int result = c.sub(a,b);
        try {
			assertEquals(5, result);
        } catch (AssertionError e) {
            fail("Resultados diferentes");
        }
    }
    @Test
    public void testMult()
    {
		System.out.println("Multiplicação:");
        Calculadora c = new Calculadora();
		int a = 10;
		int b = 5;
		int result = c.mult(a,b);
        try {
			assertEquals(50, result);
        } catch (AssertionError e) {
            fail("Resultados diferentes");
        }
    }
    @Test
    public void testDiv()
    {
		System.out.println("Divisão:");
        Calculadora c = new Calculadora();
		int a = 10;
		int b = 5;
		int result = c.div(a,b);
        try {
			assertEquals(2, result);
        } catch (AssertionError e) {
            fail("Resultados diferentes");
        }
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
