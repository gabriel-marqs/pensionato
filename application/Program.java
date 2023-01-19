package application;

import java.util.Scanner;

import entities.Aluga;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Aluga[] vetor = new Aluga[10];

		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Aluguel #%d:\n", 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();

			Aluga aluga = new Aluga(nome, email);

			vetor[quarto] = aluga;

		}
		
		System.out.printf("\nQuartos ocupados:\n");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}

		sc.close();

	}

}
