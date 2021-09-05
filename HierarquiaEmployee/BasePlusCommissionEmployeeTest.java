package HierarquiaEmployee;

//Testando a classe BasePlusCommissionEmployee.

public class BasePlusCommissionEmployeeTest
{
	public static void main(String[] args) 
	{
		// instanciando o objeto CommissionEmployee
		CommissionEmployee employee1 = new CommissionEmployee(
				"Sue", "Jones", "222-22-2222", 10000, .06);      

		// obter dados de funcion�rios de comiss�o
		System.out.println(
				"Informa��es de funcion�rios obtidas por m�todos get:");
		System.out.printf("%n%s %s%n", "Primeiro nome �",
				employee1.getFirstName());
		System.out.printf("%s %s%n", "�ltimo nome �", 
				employee1.getLastName());
		System.out.printf("%s %s%n", "O n�mero da previd�ncia social �", 
				employee1.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Vendas brutas s�o", 
				employee1.getGrossSales());
		System.out.printf("%s %.2f%n", "Taxa de comiss�o �",
				employee1.getCommissionRate());

		employee1.setGrossSales(5000); 
		employee1.setCommissionRate(.1); 

		System.out.printf("%n%s:%n%n%s%n",                                
				"Informa��es atualizadas dos funcion�rios obtidas por toString", employee1);

		// instanciando o obejto BasePlusCommissionEmployee
		BasePlusCommissionEmployee employee2 = 
				new BasePlusCommissionEmployee(
						"Bob", "Lewis", "333-33-3333", 5000, .04, 300);

		// obter dados de funcion�rios de comiss�o de base salarial
		System.out.println(
				"Informa��es de funcion�rios obtidas por m�todos get:");
		System.out.printf("%n%s %s%n", "Primeiro nome �",
				employee2.getFirstName());
		System.out.printf("%s %s%n", "�ltimo nome �", 
				employee2.getLastName());
		System.out.printf("%s %s%n", "O n�mero da previd�ncia social �", 
				employee2.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Vendas brutas s�o", 
				employee2.getGrossSales());
		System.out.printf("%s %.2f%n", "Taxa de comiss�o �",
				employee2.getCommissionRate());
		System.out.printf("%s %.2f%n", "Sal�rio base �",
				employee2.getBaseSalary());

		employee2.setBaseSalary(1000); 

		System.out.printf("%n%s:%n%n%s%n", 
				"Informa��es atualizadas dos funcion�rios obtidas por toString", 
				employee2.toString());
	} 
} 
