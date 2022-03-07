package application;

import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* Crie um jogo de JoKenPo (Pedra-Papel-Tesoura) */

		int countP1 = 0;
		int countP2 = 0;

		System.out.println("--------------------------------");
		System.out.println("*** 	START GAME 	***");
		System.out.println("--------------------------------");

		String jogador1 = "Pikachu";
		String jogador2 = "Charmander";

		System.out.print("<Jogador 1> (0-Pedra, 1-Papel ou 2-Tesoura): ");
		int p1 = sc.nextInt();

		while (p1 > 2) {
			System.out.print("Opção invalida! Escolha novamente: <Jogador 1> ");
			p1 = sc.nextInt();
		}

		System.out.print("<Jogador 2> (0-Pedra, 1-Papel ou 2-Tesoura): ");
		int p2 = sc.nextInt();

		while (p2 > 2) {
			System.out.print("Opção invalida! Escolha novamente: <Jogador 2> ");
			p2 = sc.nextInt();
		}

		System.out.println();
		if (p1 == 0) {
			System.out.print(jogador1);
		}
		if (p2 == 0) {
			System.out.print(jogador2);
		}
		if (p1 == 0 || p2 == 0) {
			System.out.println(" - Escolheu: Pedra");
		}

		if (p1 == 1) {
			System.out.print(jogador1);
		}
		if (p2 == 1) {
			System.out.print(jogador2);
		}
		if (p1 == 1 || p2 == 1) {
			System.out.println(" - Escolheu: Papel");
		}

		if (p1 == 2) {
			System.out.print(jogador1);
		}
		if (p2 == 2) {
			System.out.print(jogador2);
		}
		if (p1 == 2 || p2 == 2) {
			System.out.println(" - Escolheu: Tesoura");
		}
		if (p1 == 0 && p2 == 0 || p1 == 1 && p2 == 1 || p1 == 2 && p2 == 2) {
			System.out.println("\nEMPATE! Ninguém ganhou!");
		}

		System.out.println("============================");

		if (p1 == 0 && p2 == 2 || p1 == 2 && p2 == 1 || p1 == 1 && p2 == 0 || p1 == 1 && p2 == 0) {
			System.out.println("Jogador1 (" + jogador1 + ") GANHOU!!\n");
			countP1 = 1;
		}

		else if (p2 == 2 && p1 == 1 || p2 == 0 && p1 == 2 || p2 == 1 && p1 == 0) {
			System.out.println("Jogador2 (" + jogador2 + ") GANHOU!!\n");
			countP2 = 1;
		}

		System.out.print("Deseja outra partida (S/N): ");
		char r = 0;
		r = sc.next().charAt(0);
		while (r != 's' && r != 'n') {
			System.out.print("Opção INVÁLIDA. Nova partida (S/N)? ");
			r = sc.next().charAt(0);
		}

		while (r != 's' && r != 'n') {
			System.out.print("Opção incorreta! Deseja outra partida (S/N): ");
			r = sc.next().charAt(0);
		}

		while (r == 's') {
			System.out.println("* START GAME *\n");

			jogador1 = "Pikachu 20";
			jogador2 = "Charmander 20";

			System.out.print("<Jogador 1> (0-Pedra, 1-Papel ou 2-Tesoura): ");
			p1 = sc.nextInt();

			while (p1 > 2) {
				System.out.print("Opção invalida! Escolha novamente: <Jogador 1> ");
				p1 = sc.nextInt();
			}

			System.out.print("<Jogador 2> (0-Pedra, 1-Papel ou 2-Tesoura): ");
			p2 = sc.nextInt();

			while (p2 > 2) {
				System.out.print("Opção invalida! Escolha novamente: <Jogador 2> ");
				p2 = sc.nextInt();
			}

			System.out.println();
			if (p1 == 0) {
				System.out.print(jogador1);
			}
			if (p2 == 0) {
				System.out.print(jogador2);
			}
			if (p1 == 0 || p2 == 0) {
				System.out.println(" - Escolheu: Pedra");
			}

			if (p1 == 1) {
				System.out.print(jogador1);
			}
			if (p2 == 1) {
				System.out.print(jogador2);
			}
			if (p1 == 1 || p2 == 1) {
				System.out.println(" - Escolheu: Papel");
			}

			if (p1 == 2) {
				System.out.print(jogador1);
			}
			if (p2 == 2) {
				System.out.print(jogador2);
			}
			if (p1 == 2 || p2 == 2) {
				System.out.println(" - Escolheu: Tesoura");
			}
			if (p1 == 0 && p2 == 0 || p1 == 1 && p2 == 1 || p1 == 2 && p2 == 2) {
				System.out.println("\nEMPATE! Ninguém ganhou!");
			}

			System.out.println("============================");

			if (p1 == 0 && p2 == 2 || p1 == 2 && p2 == 1 || p1 == 1 && p2 == 0 || p1 == 1 && p2 == 0) {
				System.out.println("Jogador1 (" + jogador1 + ") GANHOU!!\n");
				countP1 += 1;
			}

			else if (p2 == 2 && p1 == 1 || p2 == 0 && p1 == 2 || p2 == 1 && p1 == 0) {
				System.out.println("Jogador2 (" + jogador2 + ") GANHOU!!\n");
				countP2 += 1;
			}

			System.out.print("Deseja outra partida (S/N)? ");
			r = sc.next().charAt(0);

			while (r != 's' && r != 'n') {
				System.out.print("Opção INVÁLIDA. Nova partida (S/N)? ");
				r = sc.next().charAt(0);
			}

		}

		System.out.println("--------------------------------");
		System.out.println("* JOGO FINALIZADO *");
		System.out.println("--------------------------------");

		System.out
				.println("PLACAR FINAL: " + countP1 + " (" + jogador1 + ")" + " X " + countP2 + " (" + jogador2 + ")");

		if (countP1 > countP2) {
			System.out.println("<Jogador1> é o MAIOR VENCEDOR!!");
		} else if (countP2 > countP1) {
			System.out.println("<Jogador2> é o MAIOR VENCEDOR!!");
		} else {
			System.out.println("AMBOS estão empatados no placar FINAL!!");
		}

		sc.close();

	}

}
