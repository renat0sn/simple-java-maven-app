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
        int opcao = 5;  
        int num1;  
        int num2;  
          
		Scanner input = new Scanner(System.in);
        System.out.println("-Escolha uma opção-");  
        System.out.println("1. Soma");    
        System.out.println("2. Subtracao");    
        System.out.println("3. Multiplicacao");    
        System.out.println("4. Divisao");    
        System.out.println("0. Sair");    
        System.out.println("Operação: ");    
          
        opcao = input.nextInt();  
          
        while (opcao != 0) {
			Scanner input1 = new Scanner(System.in);    
			
			System.out.println("Qual o primeiro numero: ");  
			num1 = input1.nextInt();  
			System.out.println("Qual o segundo numero: ");  
			num2 = input1.nextInt();
			
			if ( opcao == 1 ) {
				int operacao = c.som(num1, num2);
                System.out.printf("\nO resultado da soma é: %d\n", operacao);  
                break;  
            }  
            else if (opcao == 2) { 
				int operacao = c.sub(num1, num2);
				System.out.printf("\nO resultado da subtração é: %d\n", operacao);  
				break;  
			}  
			else if (opcao == 3) {
				int operacao = c.mult(num1, num2); 
				System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);    
				break;  
			}  
			else if (opcao == 4) {  
				int operacao = c.div(num1, num2);  
				System.out.printf("\nO resultado da divisão é: %d\n", operacao);   
				break;  
			}  
			else{  
				System.out.println("????");  
				break;  
			}      
        }
    }

}
