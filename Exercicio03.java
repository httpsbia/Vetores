package vetores1Ao23;
import java.util.*;

public class Exercicio03 {
	public static void main (String[]args) {
		int b [] = {1,2,3,4,5,6,7,8,9,10};
		for (int a : b) {
			if (a%2==0) {
				System.out.println(a + " par");
			} else {
				System.out.println(a + " ímpar ");
			}
		}
		
	}

}
