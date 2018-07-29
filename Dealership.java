
import java.util.*;
public class Dealership {
        
// array for cars
private    ArrayList<Car> cars = new ArrayList<>();
// array for salesperson
private    ArrayList<SalesPerson> sales = new ArrayList<>();
// Manager
private Manager mg;

public Dealership(ArrayList<Car> cars, ArrayList<SalesPerson> sales, Manager mg){
    this.cars = cars;
    this.sales = sales;
    this.mg = mg;
}

// get
public ArrayList getCarArray(){
    return cars;
}
public ArrayList getSalesArray(){ 
    return sales;
}
public Manager getManager(){
    return mg;
}

//set
public void setCarArray(){
    cars = cars;
}
public void setSalesArray(){
    sales = sales;
}
public void setManager(){
    mg = mg;
}

 // got lost tried to follow your example but ended up no where  
public void addCar(Car another){
    cars.add(another);
}
public void addSalesPerson(SalesPerson s){
    sales.add(s);
}
public void removeSalesPerson(SalesPerson s){
    sales.remove(s);
}
public void carSold(SalesPerson s, Car another){
 
}
public void removeCar(Car aCar){
    cars.remove(aCar);
}

@Override
public String toString(){
   return "Welcome to the dealership" + "\n"+getManager() + "\n" + getSalesArray() + "\n" + getCarArray();
}


}