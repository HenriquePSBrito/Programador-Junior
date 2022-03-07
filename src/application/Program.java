package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employees;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Employees> list = new ArrayList<>();

		Employees emp = new Employees();

		System.out.print("How many employees will be registered: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employees(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter the employee id that will be salary increase: ");
		int id = sc.nextInt();
		emp.setId(id);
		
		emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double perc = sc.nextDouble();
			emp.increaseSalary(perc);
		}

		System.out.println();
		System.out.println("List of employees: ");

		for (Employees x : list) {
			System.out.println(x);
		}

		sc.close();
	}
}
