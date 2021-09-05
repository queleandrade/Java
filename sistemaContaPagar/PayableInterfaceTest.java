package sistemaContaPagar;

public class PayableInterfaceTest{
    public static void main(String[] args){
        // criar um array
        Payable[] payableObjects = new Payable[6];

        // array jh� preenchido com os objetos que implemetam a classe Payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00f);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95f);
        payableObjects[2] = new SalariedEmployee(
                "John", "Smith", "111-11-1111", 800.0f);
        payableObjects[3] = new HourlyEmployee(
                "Lisa", "Barnes", "888-88-8888", 25.0f, 45.0f);
        payableObjects[4] = new CommissionEmployee(
                "Deez", "Nutz", "222-22-2222", 52.0f, 0.1f);
        payableObjects[5] = new BasePlusCommissionEmployee(
                "Scrooge", "McDuck", "333-33-3333", 25.0f, 0.25f, 100.0f);

        System.out.println("Invoices and Employee processed polymorphically:\n");

        // pega cada elemento do array
        for(Payable currentPayable : payableObjects){
            // verifica a calsse BasePlusCommissionEmployee para que fa�a o incremento correto no sal�rio
            // aumenta o sal�rio-base de BasePlusCommissionEmployee em 10%
            if(currentPayable instanceof BasePlusCommissionEmployee){
                ((BasePlusCommissionEmployee)currentPayable).setBaseSalary(
                    1.10f * ((BasePlusCommissionEmployee)currentPayable).getBaseSalary());
            }

            // sa�da do sal�rio atual  com seu valor apropriado de pagamento
            System.out.printf("%s \n%s: $%,.2f\n\n",
                    currentPayable.toString(),
                    "payment due", currentPayable.getPaymentAmount());
        }
    }
}
