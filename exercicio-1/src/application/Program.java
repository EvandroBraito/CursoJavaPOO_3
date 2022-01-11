package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluguel[] vect = new Aluguel[10];
		
		System.out.print("Informe quantos quartos serao alugados? ");
		int n = sc.nextInt();

		for (int i = 1; i < n + 1; i++) {
			System.out.println();
			System.out.printf("Aluguel #%d%n", i);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Aluguel(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos alugados: ");
		for(int i = 0;i < 10; i++) {
			if(vect[i] != null)
				System.out.println(i + ": " + vect[i]);
		}

		sc.close();
	}
}
