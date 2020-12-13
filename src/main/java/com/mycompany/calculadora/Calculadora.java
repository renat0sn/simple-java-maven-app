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
          
        //declarando as varíaveis  
        int opcao = Integer.parseInt(args[0]);  
        int num1 = Integer.parseInt(args[1]);  
        int num2 = Integer.parseInt(args[2]);  
			
		if ( opcao == 1 ) {
			int operacao = c.som(num1, num2);
            System.out.printf("\nO resultado da soma é: %d\n", operacao);
        }  
           else if (opcao == 2) { 
			int operacao = c.sub(num1, num2);
			System.out.printf("\nO resultado da subtração é: %d\n", operacao);
		}  
		else if (opcao == 3) {
			int operacao = c.mult(num1, num2); 
			System.out.printf("\nO resultado da multiplicação é: %d\n", operacao); 
		}  
		else if (opcao == 4) {  
			int operacao = c.div(num1, num2);  
			System.out.printf("\nO resultado da divisão é: %d\n", operacao);
		}
    }

}
