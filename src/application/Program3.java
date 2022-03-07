package application;

import java.util.Scanner;

import entities.Prog3;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Prog3 prog = new Prog3();
		
		//System.out.print("Informe seu nome: ");
		//String name = sc.nextLine();
//		String name = "Henrique";
//		prog3.setNome(name);
//		
//		int idade = 35;
//		prog3.setIdade(idade);
//		
//		int tel = 986174958;
//		prog3.setTelefone(tel);
//		
//		String estado = "SP";
//		prog3.setEstado(estado);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		prog.setNome(nome);
		
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		prog.setIdade(idade);

		System.out.println("Telefone: ");
		int tel = sc.nextInt();
		prog.setTelefone(tel);
		
		System.out.println("Estado: ");
		String est = sc.next();
		prog.setEstado(est);
		
		//Prog3 prog = new Prog3(nome, idade, tel, est);
		
		
		//System.out.println("Nome informado: " + name + "\n");
				
//		if (prog.getEstado() == "SP") {
//			System.out.print("sao paulo");
//		}
//		else
//			System.out.println("Estado informado diferente de SP!!");
		
		if (prog.getEstado() != "SP") {
			System.out.println("estado invalido");
		}
		else
			System.out.print(prog);
		
		
		
		
		sc.close();

	}
}
