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
		System.out.println("O menor elemento da lista é " + encontrarMenorRec(vetor, 0, vetor.length - 1));

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
	
	public static int encontrarMenorRec(int[] vetor, int limInferior, int limSuperior) {
		
		if(limInferior == limSuperior) {
			return vetor[limInferior];
		}
		else {
			int meio = (limInferior + limSuperior) /2;
			int menorA = encontrarMenorRec(vetor, limInferior, meio);
			int menorB = encontrarMenorRec(vetor, meio + 1, limSuperior);
			
			if(menorA < menorB) {
				return menorA;
			}
			else {
				return menorB;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
