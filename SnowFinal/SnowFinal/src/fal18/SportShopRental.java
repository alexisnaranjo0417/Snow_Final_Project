package fal18;

// 25 pts total (15 points for correct implementation (3 pts per section below), 10 points code passes all unit test).
// Refer to the UML class diagram for naming of all methods in this class: SportShopRentalUML.pdf

// 1. Create abstract class named SportShotRental.
abstract class SportShopRental { 
    public static void main(String[] args) {
    
    }
// 2. a. Create private boolean member variable named newModel and initialize to false.
    private boolean newModel = false;
 
//    b. Create private double member variable named rentalCost and initialize to 25.0.
    private static double rentalCost = 25.0;
//    c. Create private long member variable named rentalNumber and initialize to 1.
    private static long rentalNumber = 1;

// 3. Create all getters and setters for private member variables created in step #2. Note below is specifics for data validation 
//    in specified setter methods below:

    public void setNewModel(boolean newModel){
        this.newModel = newModel;
    }
    
    public boolean isNewModel(){
        return newModel;
    }
    
//    a. In setter method for setting rental cost, throw a new IllegalArgumentExcetion for
//       any rental cost that is less than or equal to zero, with the exception message: 
//       "RentalCost out of range"
    public static void setRentalCost(double rentalCost){
        try{
            if(rentalCost <= 0);
        }
        catch(Exception e){
            System.out.println("RentalCost out of range");
        }
        SportShopRental.rentalCost = rentalCost;
    }
    
    public static double getRentalCost(){
        return rentalCost;
    }
    
//    b. In setter method for setting rental number, throw a new IllegalArgumentException for
//       any rental number that is less than 1 or greater than 999999999999, with the
//       exception message: "RentalNumber out of range"
    public static void setRentalNumber(long rentalNumber){
        try{
            if(rentalNumber < 1 | rentalNumber > 999999999);
        }
        catch(Exception e){
            System.out.println("RentalNumber out of range");
        }
        SportShopRental.rentalNumber = rentalNumber;
    }
    
    public static long getRentalNumber(){
        return rentalNumber;
    }

// 4. Create the overrided method named toString that returns a string in the format of:
//    "Rental #{1}, Cost: ${2}, New: {3}"
//    where:  {1} is the format specifier for integers,
//            {2} is the format specifier for doubles with width of 7 characters and 2 decimal places of precision,
//            {3} is the format specifier for boolean values.
    @Override
    public String toString(){
        return String.format("Rental #%d, Cost: $%7.2f, New: %b", rentalNumber, rentalCost, newModel);
    }

// 5. Create the abstract method lateCharge that takes no parameters and returns the late charge as a double.
    public abstract double lateCharge();
        
}