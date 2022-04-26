import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Rec_MenorElemento {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		SecureRandom geradorDeNumeros = new SecureRandom();
		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = geradorDeNumeros.nextInt(90);
		}

		System.out.println(Arrays.toString(vetor));
		busca(vetor);

		input.close();
	}

	public static void mostrar(int[] vetor) {
		String dados = "";
		for (int i = 0; i <= vetor.length; i++) {
			dados = dados + vetor[i] + ", ";
			System.out.println(vetor);
		}
	}
	
	public static void torreDeHanoi(int discos, int origem, int destino, int temporario) {
		
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

	public static void encontrarMenorMaior(int[] vetor, int tamanho) {

		int maior = vetor[0];
		int menor = vetor[0];
		for (int i = 0; i < tamanho; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			} else if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		int[] menorMaior = new int[2];
		menorMaior[0] = maior;
		menorMaior[1] = menor;
		System.out.println("Maior elemento:" + maior + " - Menor elemento: " + menor);
	}

	public static int[] encontrarMaiorMenorRec(int[] vetor, int limInferior, int limSuperior) {

		int[] menorMaior = new int[2];

		if (vetor[limInferior] - vetor[limSuperior] <= 1) {
			if (vetor[limInferior] < vetor[limSuperior]) {
				menorMaior[0] = vetor[limSuperior];
				menorMaior[1] = vetor[limInferior];
			} else {
				menorMaior[0] = vetor[limInferior];
				menorMaior[1] = vetor[limSuperior];
			}
		} else {
			int meio = (limInferior + limSuperior) / 2;
			menorMaior = encontrarMaiorMenorRec(vetor, limInferior, meio);
			int maiorA = vetor[0];
			int menorA = vetor[1];
			menorMaior = encontrarMaiorMenorRec(vetor, meio + 1, limSuperior);
			int maiorB = vetor[0];
			int menorB = vetor[0];

			if (maiorA > maiorB) {
				menorMaior[0] = maiorA;
			} else {
				menorMaior[0] = maiorB;
			}
			if (menorA < menorB) {
				menorMaior[1] = menorA;
			} else {
				menorMaior[1] = menorB;
			}
		}
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
