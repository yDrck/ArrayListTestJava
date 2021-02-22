package entidades;

public class Produtos {
	
	int id;
	String name;
	double salary;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}
	

	
	public Produtos(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	


	public Produtos() {
		// TODO Auto-generated constructor stub
	}



	public void aumento(double percentage) {
		salary += salary*(percentage/100);
	}
	
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
}
