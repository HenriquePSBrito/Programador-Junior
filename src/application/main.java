package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Jokenpo;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.print("N= ");
//		int n = sc.nextInt();
//		
//		for(int i=1; i <= n; i++) {
//			
//			if (i % 5 == 0 & i % 3 == 0) {
//				System.out.println("multiplo de 3 e 5");
//			}
//			else if (i % 3 == 0) {
//				System.out.println("multiplo de 3");
//			}
//			else if (i % 5 == 0) {
//				System.out.println("multiplo de 5");
//			}
//								
//			else {
//				System.out.println(i);
//			}
//		}

//(ex3)	System.out.print("Informe o nome do funcionario: ");
//		String nomeFuncionario = sc.nextLine();
//		System.out.print("Informe o salario do funcionario: ");
//		double salarioFuncionario = sc.nextDouble();
//		
//		System.out.println("\n====================================");
//		System.out.println("NOME FUNCION�RIO: " + nomeFuncionario);
//		System.out.printf("SALARIO FUNCION�RIO: %.2f%n", salarioFuncionario);
//		System.out.println("====================================");

//(ex4)	System.out.print("Numero 1: ");
//		int num1 = sc.nextInt();
//		System.out.print("Numero 2: ");
//		int num2 = sc.nextInt();
//		System.out.println("====================================");
//		System.out.println("A soma entre " + num1 + " e " + num2 + " � igual a " + (num1 + num2));

		/* (ex5) */
//		System.out.print("Nota 1: ");
//		double nota1 = sc.nextDouble();
//		System.out.print("Nota 2: ");
//		double nota2 = sc.nextDouble();
//		System.out.println("====================================");
//		System.out.println("A m�dia entre " + nota1 + " e " + nota2 + " � igual a " + ((nota1 + nota2)/2));

//		System.out.print("T: ");
//		int t = sc.nextInt();
//
//		for (int i = 0; i < t; i++) {
//
//			try {
//				
//				System.out.print("X" + i + ": ");
//				long x = sc.nextLong();
//				
//				System.out.println(x + " can be fitted in: ");
//				if (x >= -128 && x <= 127) {
//					System.out.println("* byte");
//				}
//				if (x >= -32768 && x <= 32767) {
//					System.out.println("* short");
//				}
//				if (x >= -2147483648 && x <= 2147483647) {
//					System.out.println("* int");
//				}
//				if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE) {
//					System.out.println("* long");
//				}
//				
//				System.out.println("-------------------------------");
//				
//			} 
//			catch (Exception e) {
//				System.out.println(sc.next() + " can't be fitted anywhere.");
//			}
//		}

//		int n = 1;
//		
//		while(sc.hasNext()) {
//			System.out.println(n + " " + sc.nextLine());
//			n++;
//		}

//		System.out.print("Informe nome: ");
//		String nome = sc.nextLine();
//		System.out.print("Informe idade: ");
//		int idade = sc.nextInt();
//		System.out.print("Informe altura: ");
//		double altura = sc.nextDouble();
//		Pessoa p = new Pessoa(nome, idade, altura);
//		System.out.println("======================");
//		System.out.println(p);

		/* INACABADO - DAR CONTINUIDADE */
//		int n = 2;
//		
//		List<Agenda> list = new ArrayList<>();
//		Agenda agenda = new Agenda();
//		
//		
//		for(int i=0; i < n; i++) {
//			System.out.print("Informe nome: ");
//			String nome = sc.nextLine();
//			System.out.print("Informe idade: ");
//			int idade = sc.nextInt();
//			System.out.print("Informe altura: ");
//			double altura = sc.nextDouble();
//			sc.nextLine();
//						
//			list.add(new Agenda(nome, idade, altura));
//			//agenda.armazenaPessoa(nome, idade, altura);
//			System.out.println("==============================");
//			
//			for(Agenda obj : list) {
//				System.out.println(obj);
//			}
//			
//			//agenda.imprimeAgenda();
//			System.out.println("==============================");
//		}

//(ex6)	System.out.print("Informe um n�mero: ");
//		int n = sc.nextInt();
//		
//		System.out.println("O antecessor de "+ n + " �: " + (n - 1));
//		System.out.println("O sucessor de " + n + " �: " + (n + 1));

///*ex7*/		System.out.print("Informe um numero real: ");
//		double r = sc.nextDouble();
//		
//		System.out.println("O dobro de " + r + " �: " + (r * 2));
//		double t = r / 3;
//		System.out.printf("A ter�a parte de %.1f �: %.4f ", r, t);

///*ex9*/		double dolar = 3.45;
//		System.out.print("Informe o dinheiro R$: ");
//		double dinheiro = sc.nextDouble();
//		
//		double comprarDolar = dinheiro * dolar;
//		System.out.print("Dolar comprado $ : " + comprarDolar);

		/*
		 * Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
		 * 80Km/h, exiba uma mensagem dizendo que o usu�rio foi multado. Nesse caso,
		 * exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade
		 * permitida.
		 */

//		System.out.print("Informe a velocidade do carro (Km/h): ");
//		int vel = sc.nextInt();
//		
//		if(vel > 80) {
//			int multa = vel * 5;
//			System.out.println("* Voc� foi multado* \nValor da multa R$ " + multa);
//			
//		}

		/*
		 * Fa�a um programa que leia o ano de nascimento de uma pessoa, calcule a idade
		 * dela e depois mostre se ela pode ou n�o votar
		 */

//		System.out.print("Ano atual (AAAA): ");
//		int anoAtual = sc.nextInt();
//		
//		System.out.print("Ano de nascimento (AAAA): ");
//		int anoNasc = sc.nextInt();
//				
//		int calcIdade = anoAtual - anoNasc;
//		System.out.println("\nIdade: " + calcIdade + " anos\n");
//		
//		if(calcIdade >= 16) {
//			System.out.println("* Voc� PODE votar *");
//		}
//		else
//		System.out.println("* Voc� N�O pode votar *");

		/*
		 * Desenvolva um programa que leia um n�mero inteiro e mostre se ele � PAR ou
		 * �MPAR.
		 */

//		System.out.print("Numero: ");
//		int n = sc.nextInt();
//		
//		if(n % 2 == 0) {
//			System.out.println("'"+  n + "'" + " � PAR!!");
//		}
//		else
//			System.out.println(n + " � IMPAR!!!");

		/*
		 * Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
		 * situa��o em rela��o ao alistamento militar. - Se estiver antes dos 18 anos,
		 * mostre em quantos anos faltam para o alistamento. - Se j� tiver depois dos 18
		 * anos, mostre quantos anos j� se passaram do alistamento
		 */

//		System.out.print("Ano Nascimento: ");
//		int anoN = sc.nextInt();
//		int idade = 0;
//		
//		idade = 2022 - anoN;//2022 - 1986 = 36
//		System.out.print("Idade: " + idade +" anos \n");
//				
//		if(idade < 18) { 
//			int tempoRest = 18 - idade; //18 - 36
//			System.out.print("Anos para o alistamento: " + tempoRest + " anos");
//		}
//		if (idade > 18) {
//			int tempoRest = idade - 18; 
//			System.out.println("Anos ap�s alistamento: " + tempoRest + " anos");
//		}

		/*
		 * Numa promo��o exclusiva para o Dia da Mulher, uma loja quer dar descontos
		 * para todos, mas especialmente para mulheres. Fa�a um programa que leia nome,
		 * sexo e o valor das compras do cliente e calcule o pre�o com desconto. Sabendo
		 * que: - Homens ganham 5% de desconto - Mulheres ganham 13% de desconto
		 */

//		System.out.print("Qtd Clientes: ");
//		int clientes = sc.nextInt();
//
//		for (int i = 1; i <= clientes; i++) {
//
//			System.out.print("Nome #" + i + ": ");
//			sc.nextLine();
//			String nome = sc.nextLine();
//
//			System.out.print("Sexo: ");
//			char sexo = sc.next().toUpperCase().charAt(0);
//
//			System.out.print("Valor das compras R$: ");
//			double compras = sc.nextDouble();
//
//			if (sexo == 'F') {
//				double desc = (compras * 0.15);
//				compras += -desc;
//			}
//
//			if (sexo == 'M' || sexo == 'm') {
//				double desc = (compras * 0.05);
//				compras += -desc;
//			}
//
//			System.out.println("-----------------------------------");
//			System.out.println(nome + " " + "pagou R$ " + compras + " (com desconto)");
//			System.out.println("-----------------------------------");
//		}
		
		
/*Escreva um algoritmo que leia dois n�meros inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
 - O primeiro valor � o maior
 - O segundo valor � o maior
 - N�o existe valor maior, os dois s�o iguais*/		
		
//		System.out.print("N1: ");
//		int n1 = sc.nextInt();
//		
//		System.out.print("N2: ");
//		int n2 = sc.nextInt();
//						
//		if(n1 > n2) {
//			System.out.println("-----------------------------------");
//			System.out.println("Primeiro valor " + "("+ n1 +") � maior!");	
//		}
//		else if(n2 > n1) {
//			System.out.println("-----------------------------------");
//			System.out.println("Segundo valor " + "("+ n2 +") � maior!");
//		}
//		else {
//			System.out.println("-----------------------------------");
//			System.out.println("N�o existe valor maior. Dois numeros s�o iguais " + "("+ n1 +", "+ n2 + ")");
//		}
		
		
/*Fa�a um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua �rea em m�. O programa tamb�m
deve mostrar a classifica��o desse terreno, de acordo com a lista abaixo:
 - Abaixo de 100m� = TERRENO POPULAR
 - Entre 100m� e 500m� = TERRENO MASTER
 - Acima de 500m� = TERRENO VIP*/		
		
//		System.out.print("Largura: ");
//		double largura = sc.nextDouble();
//		System.out.print("Comprimento: ");
//		double comp = sc.nextDouble();
//		
//		double calcArea = largura * comp;
//		System.out.println();
//		
//		if(calcArea < 100) {
//			System.out.println("TERRENO POPULAR - " + calcArea + " m�");
//		}
//		else if(calcArea > 100 && calcArea < 500) {
//			System.out.println("TERRENO MASTER - " + calcArea + " m�\"");
//		}
//		else /*(calcArea > 500) {*/
//			System.out.println("TERRENO VIP - " + calcArea + " m�\"");
		

/*Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)*/
		
			int countP1 = 0;
			int countP2 = 0;
			
			System.out.println("--------------------------------");
			System.out.println("*** 	START GAME 	***");
			System.out.println("--------------------------------");
			
			String jogador1 = "Pikachu";
			String jogador2 = "Charmander";
					
			System.out.print("<Jogador 1> (0-Pedra, 1-Papel ou 2-Tesoura): ");
			int p1 = sc.nextInt();
			
			while(p1 > 2) {
				System.out.print("Op��o invalida! Escolha novamente: <Jogador 1> ");
				p1 = sc.nextInt();
			}
			
			System.out.print("<Jogador 2> (0-Pedra, 1-Papel ou 2-Tesoura): ");
			int p2 = sc.nextInt();
			
			while(p2 > 2) {
				System.out.print("Op��o invalida! Escolha novamente: <Jogador 2> ");
				p2 = sc.nextInt();
			}
			
			System.out.println();
			if(p1 == 0) {
					System.out.print(jogador1);
				}
			if(p2 == 0) {
				System.out.print(jogador2);
			}
			if(p1 == 0 || p2 == 0) {
					System.out.println(" - Escolheu: Pedra");
			}
			
			if(p1 == 1) {
				System.out.print(jogador1);
			}
			if(p2 == 1) {
			System.out.print(jogador2);
			}
			if(p1 == 1 || p2 ==1) {
				System.out.println(" - Escolheu: Papel");
			}
			
			if(p1 == 2) {
				System.out.print(jogador1);
			}
			if(p2 == 2) {
				System.out.print(jogador2);
			}
			if(p1 == 2 || p2 ==2) {
				System.out.println(" - Escolheu: Tesoura");
			}
			if(p1 == 0 && p2 == 0 || p1 == 1 && p2 == 1 || p1 == 2 && p2 == 2) {
				System.out.println("\nEMPATE! Ningu�m ganhou!");
			}
						
			System.out.println("============================");
			
			
			if(p1 == 0 && p2 == 2 || p1 == 2 && p2 == 1 || p1 == 1 && p2 == 0 || p1 == 1 && p2 == 0) {
				System.out.println("Jogador1 (" + jogador1 + ") GANHOU!!\n");
				countP1 = 1;
			}
			
			else if(p2 == 2 && p1 == 1 || p2 == 0 && p1 == 2 || p2 == 1 && p1 == 0) {
				System.out.println("Jogador2 (" + jogador2 + ") GANHOU!!\n");
				countP2 = 1;
			}						
	
			System.out.print("Deseja outra partida (S/N): ");
			char r = 0;
			r = sc.next().charAt(0);
			while(r != 's' && r != 'n') {
				System.out.print("Op��o INV�LIDA. Nova partida (S/N)? ");
				r = sc.next().charAt(0);
			}			
			
			while(r != 's' && r != 'n') {
				System.out.print("Op��o incorreta! Deseja outra partida (S/N): ");
				r = sc.next().charAt(0);
			}
						
			while(r == 's') {
				System.out.println("* START GAME *\n");
				
				jogador1 = "Pikachu 20";
				jogador2 = "Charmander 20";
						
				System.out.print("<Jogador 1> (0-Pedra, 1-Papel ou 2-Tesoura): ");
				p1 = sc.nextInt();
				
				while(p1 > 2) {
					System.out.print("Op��o invalida! Escolha novamente: <Jogador 1> ");
					p1 = sc.nextInt();
				}
				
				System.out.print("<Jogador 2> (0-Pedra, 1-Papel ou 2-Tesoura): ");
				p2 = sc.nextInt();
				
				while(p2 > 2) {
					System.out.print("Op��o invalida! Escolha novamente: <Jogador 2> ");
					p2 = sc.nextInt();
				}
				
				System.out.println();
				if(p1 == 0) {
						System.out.print(jogador1);
					}
				if(p2 == 0) {
					System.out.print(jogador2);
				}
				if(p1 == 0 || p2 == 0) {
						System.out.println(" - Escolheu: Pedra");
				}
				
				if(p1 == 1) {
					System.out.print(jogador1);
				}
				if(p2 == 1) {
				System.out.print(jogador2);
				}
				if(p1 == 1 || p2 ==1) {
					System.out.println(" - Escolheu: Papel");
				}
				
				if(p1 == 2) {
					System.out.print(jogador1);
				}
				if(p2 == 2) {
					System.out.print(jogador2);
				}
				if(p1 == 2 || p2 ==2) {
					System.out.println(" - Escolheu: Tesoura");
				}
				if(p1 == 0 && p2 == 0 || p1 == 1 && p2 == 1 || p1 == 2 && p2 == 2) {
					System.out.println("\nEMPATE! Ningu�m ganhou!");
				}
							
				System.out.println("============================");
				
				
				if(p1 == 0 && p2 == 2 || p1 == 2 && p2 == 1 || p1 == 1 && p2 == 0 || p1 == 1 && p2 == 0) {
					System.out.println("Jogador1 (" + jogador1 + ") GANHOU!!\n");
					countP1 += 1;
				}
				
				else if(p2 == 2 && p1 == 1 || p2 == 0 && p1 == 2 || p2 == 1 && p1 == 0) {
					System.out.println("Jogador2 (" + jogador2 + ") GANHOU!!\n");
					countP2 += 1;
				}
				
				System.out.print("Deseja outra partida (S/N)? ");
				r = sc.next().charAt(0);
				
				while(r != 's' && r != 'n') {
					System.out.print("Op��o INV�LIDA. Nova partida (S/N)? ");
					r = sc.next().charAt(0);
				}
							
				}
		
				System.out.println("--------------------------------");
				System.out.println("* JOGO FINALIZADO *");
				System.out.println("--------------------------------");
			
				System.out.println("PLACAR FINAL: " + countP1 + " (" + jogador1 + ")" + " X " + countP2 + " (" + jogador2 + ")");
				
				if(countP1 > countP2) {
					System.out.println("<Jogador1> � o MAIOR VENCEDOR!!");
				}
				else if(countP2 > countP1){
					System.out.println("<Jogador2> � o MAIOR VENCEDOR!!");
				}
				else {
					System.out.println("AMBOS est�o empatados no placar FINAL!!");
				}
				
				
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		sc.close();
	}
}
