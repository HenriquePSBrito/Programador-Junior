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
//		System.out.println("NOME FUNCIONÁRIO: " + nomeFuncionario);
//		System.out.printf("SALARIO FUNCIONÁRIO: %.2f%n", salarioFuncionario);
//		System.out.println("====================================");

//(ex4)	System.out.print("Numero 1: ");
//		int num1 = sc.nextInt();
//		System.out.print("Numero 2: ");
//		int num2 = sc.nextInt();
//		System.out.println("====================================");
//		System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + (num1 + num2));

		/* (ex5) */
//		System.out.print("Nota 1: ");
//		double nota1 = sc.nextDouble();
//		System.out.print("Nota 2: ");
//		double nota2 = sc.nextDouble();
//		System.out.println("====================================");
//		System.out.println("A média entre " + nota1 + " e " + nota2 + " é igual a " + ((nota1 + nota2)/2));

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

//(ex6)	System.out.print("Informe um número: ");
//		int n = sc.nextInt();
//		
//		System.out.println("O antecessor de "+ n + " é: " + (n - 1));
//		System.out.println("O sucessor de " + n + " é: " + (n + 1));

///*ex7*/		System.out.print("Informe um numero real: ");
//		double r = sc.nextDouble();
//		
//		System.out.println("O dobro de " + r + " é: " + (r * 2));
//		double t = r / 3;
//		System.out.printf("A terça parte de %.1f é: %.4f ", r, t);

///*ex9*/		double dolar = 3.45;
//		System.out.print("Informe o dinheiro R$: ");
//		double dinheiro = sc.nextDouble();
//		
//		double comprarDolar = dinheiro * dolar;
//		System.out.print("Dolar comprado $ : " + comprarDolar);

		/*
		 * Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
		 * 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso,
		 * exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade
		 * permitida.
		 */

//		System.out.print("Informe a velocidade do carro (Km/h): ");
//		int vel = sc.nextInt();
//		
//		if(vel > 80) {
//			int multa = vel * 5;
//			System.out.println("* Você foi multado* \nValor da multa R$ " + multa);
//			
//		}

		/*
		 * Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
		 * dela e depois mostre se ela pode ou não votar
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
//			System.out.println("* Você PODE votar *");
//		}
//		else
//		System.out.println("* Você NÃO pode votar *");

		/*
		 * Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
		 * ÍMPAR.
		 */

//		System.out.print("Numero: ");
//		int n = sc.nextInt();
//		
//		if(n % 2 == 0) {
//			System.out.println("'"+  n + "'" + " é PAR!!");
//		}
//		else
//			System.out.println(n + " é IMPAR!!!");

		/*
		 * Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
		 * situação em relação ao alistamento militar. - Se estiver antes dos 18 anos,
		 * mostre em quantos anos faltam para o alistamento. - Se já tiver depois dos 18
		 * anos, mostre quantos anos já se passaram do alistamento
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
//			System.out.println("Anos após alistamento: " + tempoRest + " anos");
//		}

		/*
		 * Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
		 * para todos, mas especialmente para mulheres. Faça um programa que leia nome,
		 * sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
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
		
		
/*Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
 - O primeiro valor é o maior
 - O segundo valor é o maior
 - Não existe valor maior, os dois são iguais*/		
		
//		System.out.print("N1: ");
//		int n1 = sc.nextInt();
//		
//		System.out.print("N2: ");
//		int n2 = sc.nextInt();
//						
//		if(n1 > n2) {
//			System.out.println("-----------------------------------");
//			System.out.println("Primeiro valor " + "("+ n1 +") é maior!");	
//		}
//		else if(n2 > n1) {
//			System.out.println("-----------------------------------");
//			System.out.println("Segundo valor " + "("+ n2 +") é maior!");
//		}
//		else {
//			System.out.println("-----------------------------------");
//			System.out.println("Não existe valor maior. Dois numeros são iguais " + "("+ n1 +", "+ n2 + ")");
//		}
		
		
/*Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP*/		
		
//		System.out.print("Largura: ");
//		double largura = sc.nextDouble();
//		System.out.print("Comprimento: ");
//		double comp = sc.nextDouble();
//		
//		double calcArea = largura * comp;
//		System.out.println();
//		
//		if(calcArea < 100) {
//			System.out.println("TERRENO POPULAR - " + calcArea + " m²");
//		}
//		else if(calcArea > 100 && calcArea < 500) {
//			System.out.println("TERRENO MASTER - " + calcArea + " m²\"");
//		}
//		else /*(calcArea > 500) {*/
//			System.out.println("TERRENO VIP - " + calcArea + " m²\"");
		


				
				
		
		
		
		
		
		
		
		
		

		sc.close();
	}
}
