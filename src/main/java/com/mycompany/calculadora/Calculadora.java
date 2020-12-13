package com.mycompany.calculadora;
import java.util.Scanner;

/**
 * Hello world!
 */
public class Calculadora
{
    public int som(int a, int b) {
        return a + b;
    }  
    public int sub(int a, int b){
        return a - b;
    }  
    public int div(int a,int b){
        return a / b;
    }  
    public int mult(int a, int b){
        return a * b;
    }

    public Calculadora() {}

    public static void main(String[] args) {
        Calculadora c = new Calculadora();  
          System.out.printf(args[0]);
		  System.out.printf(args[1]);
		  System.out.printf(args[2]);
    }

}
