package matrizez;

import java.util.Scanner;

public class soma3x4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j;
		
		int a[][] = new int [3][4];
		
		for(i=0; i <3; i++) {
			for(j=0; j<4; j++) {
				System.out.println("Entre com o valor da " +i+ " Linha e "+j+ " coluna");
				a[i][j] = in.nextInt();
			}
		}
		
		for(i = 0; i < 3; i++) {
			a[i][3] = a[i][0] + a[i][1] + a[i][2];
		}
		
		for(i = 0; i < 3; i++) {
			System.out.println();
				for(j = 0; j < 4; j++) {
					System.out.print("[ "+a[i][j]+" ]");
			}
		}
	
	}

}
