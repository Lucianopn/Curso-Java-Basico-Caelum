package luciano.cursojava.caelun.fj11.cap03;

import java.util.Scanner;

public class Exercicio7 {
	
			public static void main (String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Digite um numero inteiro: ");
				int x = scan.nextInt();
				
				if (x%2==0) {
					System.out.println("O número " + x + " é par");
						while (x!=1) {
							int x2=x/2;
							System.out.println("-->" + x2);
							x=x2;
						}
				}else  {
					System.out.println("O número " + x + " é impar");
					}
				
					
			}
			
}