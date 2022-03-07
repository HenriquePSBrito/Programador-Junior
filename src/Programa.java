import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Usuario;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		Usuario user = new Usuario();
		
		//System.out.print("Informe a data de seu nascimento: ");
		//Date nasc = sdf.parse("24/06/1986");
		
		System.out.print("Informe o seu nome: ");
		 String name = sc.nextLine();
		//user.getName(name);
		//user.setName("Henrique");
		//System.out.println(user.getName());
		
		System.out.print("Informe a idade: ");
		//user.setIdade(35);
		int age = sc.nextInt(); 
		//System.out.println(user.getIdade());
		
		
		System.out.println();
		//System.out.println("Nome: " + name); 
		//System.out.println("Idade: " + age);
		
		Usuario us = new Usuario(name, age);
		//System.out.println("Nome informado: " + name + " idade informada: " + age);
		System.out.println(us);
			
		
		
		
		sc.close();

	}
}
