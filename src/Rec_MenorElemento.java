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
		encontrarMenorMaior(vetor, vetor.length);
	}
	
	public static void mostrar(int[] vetor) {
		String dados = "";
		for(int i = 0; i <= vetor.length; i++) {
			dados = dados + vetor[i] + ", ";
			System.out.println(vetor);
		}
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
		
		int maior = vetor[0];
		int menor = vetor[0];
		
		if(vetor[limInferior] - vetor[limSuperior] <= 1) {
			if(vetor[limInferior] < vetor[limSuperior]) {
				menor = vetor[limSuperior];
				maior = vetor[limInferior];
			}
			else {
				menor = vetor[limInferior];
				menor = vetor[limSuperior];
			}
		}
		else {
			int meio = (limInferior + limSuperior) / 2;
			int maiorMenor = encontrarMaiorMenorRec(vetor, limInferior, meio);
			int maiorA = vetor[0];
			int menorA = vetor[1];
			int menorMaior = encontrarMaiorMenorRec(vetor, meio + 1, limSuperior);
			int maiorB = vetor[0];
			int menorB = vetor[0];
			
			if(maiorA > maiorB) {
				maior = maiorA;
			}
			else {
				maior = maiorB;
			}
			if(menorA < menorB) {
				menor = menorA;
			}
			else {
				menor = menorB;
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
