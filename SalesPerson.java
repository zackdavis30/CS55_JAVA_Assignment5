
public class SalesPerson {
    
    private final String fName;
    private final String lName;
    private int bonus;
    private final String address;
    private final String dateOfHire;
        
    public SalesPerson(String fName, String lName, int bonus, String address, String dateOfHire){
        this.fName = fName;
        this.lName = lName;
        this.bonus = bonus;
        this.address = address;
        this.dateOfHire = dateOfHire;
    }
    //get
    public String getFirstName(){
        return fName;
    }
    public String getLastName(){
        return lName;
    }
    public int getBonus(){
        bonus = 0;
        return bonus;
    }
    public String getAddress(){
        return address;
    }
    public String getDateOfHire(){
        return dateOfHire;
    }
    
    //set
    public void setFName(String fName){
        fName = fName;
    }
    public void setLName(String lName){
        lName = lName;
    }
    public void setBonus(int bonus){
        bonus = bonus;
    }
    public void setAddress(String address){
        address = address;
    }
    public void setDateOfHire(String dateOfHire){
        dateOfHire = dateOfHire;
    }
     
    //print to string
    @Override
    public String toString(){
        return "Employee Name: " + getFirstName() +" "+getLastName() +" Bonus:" + getBonus() + " Address: " + getAddress() + " Hire Date: " + getDateOfHire(); 
    }
}
