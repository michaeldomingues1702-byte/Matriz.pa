package matrizez;

import java.util.Random;

public class maiorMenor {
	public static void main(String[] args) {
		Random in = new Random();
		int i, j, mnl = 0, mnc = 0, mml = 0, mmc = 0;
		
		int a[][] = new int [3][3];
		
		for(i=0; i <3; i++) {
			for(j=0; j<3; j++) {
				a[i][j] = in.nextInt()%50;
				if(i == 0 && j == 0) {
					mnl = 0;
					mnc = 0;
					mml = 0;
					mmc = 0;
				}else {
					if(a[i][j] < a[mnl][mnc]){
						mnl = i;
						mnc = j;
					}
					if(a[i][j] > a[mml][mmc]) {
						mml = i;
						mmc = j;
 					}
				}
				
			}
		}
		
		for(i = 0; i < 3; i++) {
			System.out.println();
				for(j = 0; j < 3; j++) {
					System.out.print("[ "+a[i][j]+" ]");
			}
		}
		
		System.out.println();
		for(i = 0; i < 1; i++) {
			System.out.println("O maior número é " + a[mml][mmc]+ " que está na posição " + mml + " Linha " + mmc + " Coluna");
			System.out.println("O menor número é " + a[mnl][mnc]+ " que está na posição " + mnl + " Linha " + mnc + " Coluna");
		}
	}

}
