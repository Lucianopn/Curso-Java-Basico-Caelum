package luciano.cursojava.caelun.fj11.cap03;

public class Exercicio6 {
	
			public static void main (String[] args) {
				
				int maxFibonacci = 40;
				for(int i = 1; i <=maxFibonacci;i++){
					System.out.println("(" + i + ") : " + fib(i));
				}						
					
			}
			
			//abordagem recursiva do fibonacci
			//if normal
			static long fib(long n){
				if (n < 2){
					return n;
				} else {
					return fib(n - 1) + fib(n - 2);
				}
			}
			
			//if ternario
			static long fibonacci(long n){
				return (n < 2) ? n : fib(n - 1) + fib(n - 2);
			}
}