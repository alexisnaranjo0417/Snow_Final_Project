package fal18;

// 25 pts total (15 points for correct implementation (3 pts per section below), 10 points code passes all unit test).
// Refer to the UML class diagram for naming of all methods in this class: SnowboardRentalUML.pdf

// 1. Create public class named SnowboardRental that inherits SportShopRental.
public class SnowboardRental extends SportShopRental{

// 2. a. Create a private integer member variable named size and initialized to 140.
//    a. Create a private boolean member variable named freestyle and initialized to true.
    private int size = 140;
    private boolean freestyle = true;
    
// 3. Implement the abstract method lateCharge which was declared in SportShopRental.
//    The method should only return 20% of the rental cost.
    public double lateCharge(){
        double charge;
        charge = (SportShopRental.getRentalCost()*(.2));
        return charge;
    }

// 4. Implement the toString method that returns a string in the following format:
//    "Rental #{s}, Cost: ${s}, New: {s}, size: {1} cm, {2}"
//    where:  {s} is the format specifier for integers from SportShopRental class toString method (hint: utilize the super keyword),
//            {s} is the format specifier for doubles with width of 7 characters and 2 decimal places of precision from 
//                SportShopRental class toString method (hint: utilize the super keyword),
//            {s} is the format specifier for boolean values from SportShopRental class toString method (hint: utilize the super keyword),
//            {1} is the format specifier for integer with a field width of 4 characters,
//            {2} is the format specifier for a string "freestyle" if freestyle member variable is true, other wise "alpine".
    @Override
    public String toString(){
        String torf;
        if(freestyle = false){
            torf = "alpine";
        }
        else{
            torf = "freestyle";
        }
        return String.format("Rental #%d, Cost: $%7.2f, New: %b, Size: %4d cm, %s", SportShopRental.getRentalNumber(), SportShopRental.getRentalCost(), this.isNewModel(), this.size, torf);
    }
    
// 5. Create all getters and setters for private member variables created in step #2. Note below is specifics for data validation 
//    in specified setter methods below:
//    a. In setter method for setting size, throw a new IllegalArgumentExcetion for
//       any size that is less than 50 or greater than 180, with the exception message: 
//       "Size out of range"
    public void setSize(int size){
        try{
            if(size < 50 | size > 180);
        }
        catch(Exception e){
            System.out.println("Size out of range");
        }
        this.size = size;
    }
    
    public int getSize(){
        return size;
    }
    
    public void setFreestyle(boolean freestyle){
        this.freestyle = freestyle;
    }
    public boolean isFreestyle(){
        return freestyle;
    }
}