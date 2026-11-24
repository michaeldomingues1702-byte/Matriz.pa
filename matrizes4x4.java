package matrizez;

public class matrizes4x4 {

	public static void main(String[] args) {
		int i, j, ant = 1;
		
		int a [][] = new int [4][4];
		
		for(i=0; i <4; i++) {
			for(j=0; j<4; j++) {
				if(i == 0 && j == 0) {
					a[0][0] = 2;
					ant = ant * a[0][0];
				}else {
					ant = ant * 2;
					a[i][j] = ant;
				}
				
			}
		}
		
		for(i = 0; i < 4; i++) {
			System.out.println();
				for(j = 0; j < 4; j++) {
					System.out.print("[ "+a[i][j]+" ]");
			}
		}
	}

}
