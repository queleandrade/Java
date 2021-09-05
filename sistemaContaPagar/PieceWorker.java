package sistemaContaPagar;

public class PieceWorker extends Employee{
    private double wage;
    private double pieces;

    // construtor
    public PieceWorker(String first, String last, String ssn,
            double wage, double pieces){
        super(first, last, ssn);

        setWage(wage);
        setPieces(pieces);
    }
    
    // setters
    public void setWage(double w){
        if(w >= 0.0f)
            this.wage = w;
        else
            throw new IllegalArgumentException(
                    "Wage must be >= 0.0f");
    }
    
    public void setPieces(double p){
        if(p >= 0.0f)
            this.pieces = p;
        else
            throw new IllegalArgumentException(
                    "Pieces must be >= 0.0f");
    }
    // getters
    public double getWage(){
        return this.wage;
    }
    
    public double getPieces(){
        return this.pieces;
    }
    
    // calcula getPaymentAmount e sobrescreve no método abstrato Employee
    @Override
    public double getPaymentAmount(){
        return getPieces() * getWage();
    }
    
    // retorna String sobrescrita
    @Override
    public String toString(){
        return String.format("piece worker: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "wage", getWage(),
                "pieces produced", getPieces());
    }
}
