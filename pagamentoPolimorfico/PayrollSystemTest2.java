package pagamentoPolimorfico;

public class PayrollSystemTest2 {

	public static void main(String[] args) 
	{

	// criar os objetos da subclasse com dados definidos
	SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 500.45);
	HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 200, 40);
	CommissionEmployee commissionEmployee = new CommissionEmployee( "Sue", "Jones", "333-33-3333", 2000, 10);
	BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee( "Bob", "Lewis", "444-44-4444", 40, 4000); 
	PieceWorker pieceWorker = new PieceWorker ("Jim", "Jones", "555-55-5555", 500, 20);
	
	//mostra o resultado
	System.out.println("Employees processed individually:");
	System.out.println("\n" + salariedEmployee + " earned " + salariedEmployee.earnings());
	System.out.println("\n" + hourlyEmployee + " earned " + hourlyEmployee.earnings());
	System.out.println("\n" + commissionEmployee + " earned " + commissionEmployee.earnings());
	System.out.println("\n" + basePlusCommissionEmployee + " earned " + basePlusCommissionEmployee.earnings());
	System.out.println("\n" + pieceWorker + " earned " + pieceWorker.earnings());
	
	// incializa os arrays do Employee
	Employee[] employees = new Employee[5];
	employees[0] = salariedEmployee;
	employees[1] = hourlyEmployee;
	employees[2] = commissionEmployee;
	employees[3] = basePlusCommissionEmployee;
	employees[4] = pieceWorker; 
	System.out.printf("Employees processed polymorphically:%n%n");
	
	
	//exibir suas representações de string e vencimentos
	
	System.out.println("earnings: "+ pieceWorker.earnings());
	System.out.println(pieceWorker.toString());


	// obter o nome do tipo de cada objeto na matriz de funcionários
	for (int j = 0; j < employees.length; j++) 
		System.out.printf("Employee %d is a %s%n", j,
				employees[j].getClass().getName()); 
	}
}
