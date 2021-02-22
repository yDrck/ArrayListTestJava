package aplicacao;

import java.util.ArrayList;
import java.util.Scanner;
import entidades.Produtos;

public class Programa {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? "); 
		int n = sc.nextInt();
		
		ArrayList<Produtos> employees = new ArrayList<>();
		
		for (int i = 0;i<n;i++) {
			System.out.println();
			System.out.println("Employee #"+(i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(employees, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Produtos(id,name,salary));
			
			
		}

		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Produtos emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null){
			System.out.println("This id does not exist!");
			System.out.println();
			System.out.println("List of employees:");
			for (Produtos x: employees) {
				System.out.println(x);
			} 
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.aumento(percentage);
			System.out.println("List of employees:");
			for (Produtos x: employees) {
				System.out.println(x);
			} 
		}
		
		sc.close();
	}
	
	public static boolean hasId(ArrayList<Produtos> list, int id) {
		Produtos emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
