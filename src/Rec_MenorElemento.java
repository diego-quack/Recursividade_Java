import java.security.SecureRandom;
import java.util.Arrays;

public class Rec_MenorElemento {

	public static void main(String[] args) {

		SecureRandom geradorDeNumeros = new SecureRandom();
		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = geradorDeNumeros.nextInt(90);
		}

		System.out.println(Arrays.toString(vetor));
		for (int i = 0; i < vetor.length; i++) {
			encontrarMenorMaior(vetor, 0);
		}
		System.out.println("O menor elemento da lista é " + encontrarMenorMaior(vetor, 0));
	}
	
	public static void mostrar(int[] vetor) {
		
	}

	public static int encontrarMenor(int[] vetor) {
		int menor = vetor[0];
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		return menor;
	}

	public static int[] encontrarMenorMaior(int[] vetor, int n) {
		
		int maior = vetor[0];
		int menor = vetor[0];
		for (int i = 0; i < n; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			} else if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		int[] menorMaior = new int[2];
		menorMaior[0] = maior;
		menorMaior[1] = menor;

		return menorMaior;
	}

	public static int encontrarMenorRec(int[] vetor, int limInferior, int limSuperior) {

		if (limInferior == limSuperior) {
			return vetor[limInferior];
		} else {
			int meio = (limInferior + limSuperior) / 2;
			int menorA = encontrarMenorRec(vetor, limInferior, meio);
			int menorB = encontrarMenorRec(vetor, meio + 1, limSuperior);

			if (menorA < menorB) {
				return menorA;
			} else {
				return menorB;
			}
		}
	}

}
