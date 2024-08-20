package distância;


import java.util.Scanner;

public class Ex3 {

	
	public static void main(String[] args) { 
	Scanner scan = new Scanner(System.in);
	
	System.out.println("medidor de velocidade média");
	
	
	System.out.println("distancia pecorrida:");
	
	double distancia = scan.nextInt();
	double distanciaM = distancia * 1000; 
	
	System.out.println("tempo gasto:");
	double tempo = scan.nextInt();
	double tempoS = tempo  * 3600;
	
	
	double distanciamedia = distanciaM / tempoS;

		System.out.printf("velolcidade media %.2f m/s" , distanciamedia );	
		

	}
}
	
	


