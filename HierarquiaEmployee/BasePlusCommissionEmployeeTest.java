package HierarquiaEmployee;

//Testando a classe BasePlusCommissionEmployee.

public class BasePlusCommissionEmployeeTest
{
	public static void main(String[] args) 
	{
		// instanciando o objeto CommissionEmployee
		CommissionEmployee employee1 = new CommissionEmployee(
				"Sue", "Jones", "222-22-2222", 10000, .06);      

		// obter dados de funcionários de comissão
		System.out.println(
				"Informações de funcionários obtidas por métodos get:");
		System.out.printf("%n%s %s%n", "Primeiro nome é",
				employee1.getFirstName());
		System.out.printf("%s %s%n", "Último nome é", 
				employee1.getLastName());
		System.out.printf("%s %s%n", "O número da previdência social é", 
				employee1.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Vendas brutas são", 
				employee1.getGrossSales());
		System.out.printf("%s %.2f%n", "Taxa de comissão é",
				employee1.getCommissionRate());

		employee1.setGrossSales(5000); 
		employee1.setCommissionRate(.1); 

		System.out.printf("%n%s:%n%n%s%n",                                
				"Informações atualizadas dos funcionários obtidas por toString", employee1);

		// instanciando o obejto BasePlusCommissionEmployee
		BasePlusCommissionEmployee employee2 = 
				new BasePlusCommissionEmployee(
						"Bob", "Lewis", "333-33-3333", 5000, .04, 300);

		// obter dados de funcionários de comissão de base salarial
		System.out.println(
				"Informações de funcionários obtidas por métodos get:");
		System.out.printf("%n%s %s%n", "Primeiro nome é",
				employee2.getFirstName());
		System.out.printf("%s %s%n", "Último nome é", 
				employee2.getLastName());
		System.out.printf("%s %s%n", "O número da previdência social é", 
				employee2.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Vendas brutas são", 
				employee2.getGrossSales());
		System.out.printf("%s %.2f%n", "Taxa de comissão é",
				employee2.getCommissionRate());
		System.out.printf("%s %.2f%n", "Salário base é",
				employee2.getBaseSalary());

		employee2.setBaseSalary(1000); 

		System.out.printf("%n%s:%n%n%s%n", 
				"Informações atualizadas dos funcionários obtidas por toString", 
				employee2.toString());
	} 
} 
