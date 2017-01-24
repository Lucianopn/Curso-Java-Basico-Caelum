package luciano.cursojava.caelun.fj11.cap03;

public class Exercicio5 {
	
			public static void main (String[] args) {
				
						long fatorial = 1;
						for(long n = 1; n <=40;n++){
							fatorial*=n;
							System.out.println("O fatorial de " + n + " é (" + (n-1) + "!) * " + n + " = " + fatorial);
						}		
					
			}
}