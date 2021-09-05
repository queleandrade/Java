package pagamentoPolimorfico;

public abstract class Employee {
	//variav�is de inst�ncia
	protected String firstName;
	protected String lastName;
	protected String socialSecurityNumber;

	
	//construtor
	public Employee( String first, String last, String ssn)
	{
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;

	}
	
	//M�todos get e set

	public String getFirstName()
	{
		return firstName;

	}

	public String getLastName()
	{
		return lastName;

	}

	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;

	}

	public void setLastName(String last)
	{
		lastName = last;
	}



	public void setSocialSecurityNumber(String ssn)
	{
		socialSecurityNumber = ssn;

	}

	//m�todo toString sobrescrito
	@Override
	public String toString()
	{
		return String.format("employee" + " " + firstName + " " + lastName + " " + "Social security number" + " " + socialSecurityNumber);

	}

	public abstract double earnings();



}
