package matrizez;

import java.util.Random;
import java.util.Scanner;

public class bingo {

	public static void main(String[] args) {
		Random in = new Random();
		Scanner leia = new Scanner(System.in); 
		int i, j, k = 0, cantado = 0, ac = 0, err = 0, g = 0, qr;
		
		int a[][] = new int [4][4];
		
		for(i=0; i <4; i++) {
			System.out.println();
			for(j=0; j<4; j++) {
				a[i][j] = in.nextInt(76);
				System.out.print("[ "+a[i][j]+" ]");
				
			}
		}

		
		
		
		System.out.println();
		for (k = 0; k < 76; k++) {
			System.out.println("Informe número cantado");
			cantado = leia.nextInt();
			
			err = 0;
			
			for(i = 0; i < 4; i++) {
				for(j = 0; j < 4; j++) {
					if(cantado == a[i][j]) {
						System.out.println("Número encontrado na cartela.");
						ac++;
					}else{
						if(err == 16) {
							System.out.println("Número não encontrado.");
						}
						err++;

						
					}
				}
			}
			
			if(ac == 16) {
				System.out.println("BINGO!");
				k = 76;
				qr = ac + err;
				System.out.println("Foi necessario " +qr+ " de vezes para fazer bingo.");
		}
		

	}

	}
}
