
public class Car {
   
   private final String make; 
   private final int price;
   private final String year;
   private final String vinNum;

   public Car(String make, int price, String year, String vinNum){
       this.make = make;
       this.price = price;
       this.year = year;
       this.vinNum = vinNum;
   }

   // get
   public String getMake(){
       return make;
}
   public int getPrice(){
       return price;
}
   public String getYear(){
       return year;
   }
   public String getVinNum(){
       return vinNum;
   } 
//set
   public void setMake(String make){
       make = make;
   }
   public void setPrice(int price){
       price = price;
   }
   public void setYear(String year){
       year = year;
   }
   public void setVinNum(String vinNum){
       vinNum = vinNum;
   }
   // print to string
   @Override
   public String toString(){
       return "Make:"+ getMake() + " Price:" +getPrice() + " Year:" + getYear() + " Vin Number:" + getVinNum();
   }

   
}
