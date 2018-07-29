
public class Manager {
    
    private final String fName;
    private final String lName;
    private final String address;
    private final String dateOfHire;
        
    public Manager(String fName, String lName, String address, String dateOfHire){
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.dateOfHire = dateOfHire;
    }
 
    //get
    public  String getFirstName(){
        return fName;
    }
    public String getLastName(){
        return lName;
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
    public void setAddress(String address){
        address = address;
    }
    public void setDateOfHire(String dateOfHire){
        dateOfHire = dateOfHire;
    }
     
    //print
    @Override
    public String toString(){
        return "Manager Name: " + getFirstName() +" "+getLastName() + " Address: " + getAddress() + " Hire Date: " + getDateOfHire(); 
    }
    
    
}
