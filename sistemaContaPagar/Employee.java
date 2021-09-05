package sistemaContaPagar;

public abstract class Employee implements Payable{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // cosntrutor
    public Employee(String first, String last, String ssn){
        setFirstName(first);
        setLastName(last);
        setSocialSecurityNumber(ssn);
    }
  
    // setters
    public void setFirstName(String first){
        this.firstName = first;
    }
    
    public void setLastName(String last){
        this.lastName = last;
    }
    
    public void setSocialSecurityNumber(String ssn){
        this.socialSecurityNumber = ssn;
    }
    
    // getters
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    
    // retorna a String do objeto da classe Employee sobrescrita
    @Override
    public String toString(){
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}