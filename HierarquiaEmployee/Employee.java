package HierarquiaEmployee;

public class Employee {
	
	//varaiv�is de inst�ncia
	private final String firstName; //primeiro nome                       
	private final String lastName;  //�ltimo nome                       
	private final String socialSecurityNumber;   //n�mero de seguran�a social
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

	// retorna o �ltimo nome
	public String getLastName()
	{
		return lastName;
	} 

	// retorna o n�mero de seguran�a social
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	} 

	//m�todo toString para retornar informa��es
	public String toString()                                             
	{                                                                 
		return String.format("employee: %s%n %s%n %d%n",  getFirstName(), getLastName(), getSocialSecurityNumber());                           

	}
}