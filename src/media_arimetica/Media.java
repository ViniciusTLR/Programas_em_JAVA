package media_arimetica;

import java.util.Scanner;

public class Media {

	public static void meedia() {
		
		int n=5, i, resul = 0, mdia = 0;
		int v[] = new int[n];
		
		
		for(i=1;i<5;i++) {
		System.out.println("Digite a "+i+" nota:");
		v[i] = new Scanner(System.in).nextInt();
		}
		
		for(i=1;i<5;i++) {
			resul = v[i] + resul;
			mdia = resul/4;
		}
		System.out.println(mdia);

	}

}
