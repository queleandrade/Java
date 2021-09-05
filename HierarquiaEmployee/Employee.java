package HierarquiaEmployee;

public class Employee {
	
	//varaivéis de instância
	private final String firstName; //primeiro nome                       
	private final String lastName;  //último nome                       
	private final String socialSecurityNumber;   //número de segurança social
	public Employee(String firstName, String lastName, 
			String socialSecurityNumber)
	{                                                                  

		this.firstName = firstName;                                     
		this.lastName = lastName;                                    
		this.socialSecurityNumber = socialSecurityNumber;         
	}

	// retorna o primeiro nome
	public String getFirstName()
	{
		return firstName;
	}

	// retorna o último nome
	public String getLastName()
	{
		return lastName;
	} 

	// retorna o número de segurança social
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	} 

	//método toString para retornar informações
	public String toString()                                             
	{                                                                 
		return String.format("employee: %s%n %s%n %d%n",  getFirstName(), getLastName(), getSocialSecurityNumber());                           

	}
}