
import java.util.*;

public class Assignment5 {
    public static void main(String[] args){
        

        // Creating a Manager and connecting it to the manager.java file
        Manager boss = new Manager("Zack", "Davis", "106 M st, Playa Del Beach","2017-06-12" );
        System.out.println(boss);
        
        // created the staff using an array and with the array I connected it the SalesPerson.java file
        SalesPerson[] staff = new SalesPerson[5];
        staff[0] = new SalesPerson("Joe", "Slow", 0, "Culver", "1991-8-8");
        staff[1] = new SalesPerson("Elisa", "M", 0, "Playa", "2015-06-22");
        staff[2] = new SalesPerson("James", "Beach", 0, "Venice", "2018-07-13");
        staff[3] = new SalesPerson("Joe", "Beach", 0, "Venice", "2018-07-14");
        staff[4] = new SalesPerson("Amy", "latigo", 0 , "Malibu", "1995-09-25");
        
        // Making a arrayList and displaying the employees 
        List<SalesPerson> staff1 = Arrays.asList(staff);
        ArrayList<SalesPerson> d1s = new ArrayList<>(staff1);
        d1s.forEach((SalesPerson) -> {
            System.out.println(SalesPerson); 
        }); 
        
        // created the car list using an array and with the array I connected it the car.java file
        Car[] listCar = new Car[11]; 
        listCar[0] = new Car ("Subaru", 25000, "2015", "zld12345");
        listCar[1] = new Car ("Audi", 50000, "2017", "wish12345");
        listCar[2] = new Car ("Porche", 100000, "2018", "need23456");
        listCar[3] = new Car ("Jeep", 15000, "2018", "off0987");
        listCar[4] = new Car ("Saab", 200, "1986", "junk1986");
        listCar[5] = new Car ("Ram 2500", 40000, "2018", "p1i2c3k4m5");
        listCar[6] = new Car ("Ford F-150", 35000, "2016", "workhorse5");
        listCar[7] = new Car ("Subaru Outback", 20000, "1991", "brewpnw");
        listCar[8] = new Car ("Lexus", 35000, "2017", "fastrocket");
        listCar[9] = new Car ("Rolls Royce", 2500, "1990", "70buthavea35");
        listCar[10] = new Car ("Lambo", 151000, "2015", "asd1234");
        
     // Making a arrayList and displaying the the cars 
        List<Car> list = Arrays.asList(listCar);
        ArrayList<Car> d1c = new ArrayList<>(list);
        d1c.forEach((Car) -> {
            System.out.println(Car);
        }); 
        
        System.out.println();
        
        /* 
        I am not really sure what to do and ended up just going in cirles. 
        below is the dealership. I passed the two arrays through and one Manager
        */
        
        Dealership deal = new Dealership(d1c, d1s, boss);
        
        deal.addSalesPerson(staff[3]); // Adds SalesPerson
        deal.addCar(listCar[10]); // Adds A car
        deal.removeCar(listCar[0]);// remove a car
        deal.removeSalesPerson(staff[2]);// removes staff member
        
        System.out.println(deal); // printing to string
        
        System.exit(0);
        
    }
    
}
