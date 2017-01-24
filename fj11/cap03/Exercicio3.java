package luciano.cursojava.caelun.fj11.cap03;

public class Exercicio3 {
	
			public static void main (String[] args) {
				
				for(int i=1;i<=100; i++) {
						while (i%3==0) {
							System.out.println("N° divisível por 3: " + i);
							break;
						}
						/*if (i%3==0) {
							System.out.println("N° divisível por 3: " + i);
							continue;
						}*/					
						
				}
				
			}
}
