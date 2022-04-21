import java.security.SecureRandom;
import java.util.Arrays;

public class Rec_MenorElemento {

	public static void main(String[] args) {
		
		SecureRandom geradorDeNumeros = new SecureRandom();
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = geradorDeNumeros.nextInt(90);
		}
		
		System.out.println(Arrays.toString(vetor));
		System.out.println(encontrarMenor(vetor));

	}
	
	public static int encontrarMenor(int[] vetor) {
		int menor = vetor[0];
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		return menor;
	}
}
