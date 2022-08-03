package practiceproject;

class Bike {
    String bikeName;
    String bikeType;

    // assign values using constructor
    public Bike(String name, String type) {
        this.bikeName = name;
        this.bikeType = type;
    }

    // private method
    private String getBikeName() {
        return this.bikeName;
    }

// inner class
    class Engine {
        String engineType;
        
        void setEngine() {

           // Accessing the bikeType property of Bike
            if(Bike.this.bikeType.equals("flat four")){

                // Invoking method getBikeName() of Bike
                if(Bike.this.getBikeName().equals("Royal Enfield")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }

            }else{
                this.engineType = "Bigger";
            }
        }
        
        String getEngineType(){
            return this.engineType;
        }
    }
}

public class InnerClass_07 {
    public static void main(String[] args) {

// create an object of the outer class Car
        Bike bike1 = new Bike("Bajaj CT 100", "flat twin");

        // create an object of inner class using the outer class
        Bike.Engine engine = bike1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for flat twin= " + engine.getEngineType());

        Bike bike2 = new Bike("Royal Enfield", "flat four");
        Bike.Engine c2engine = bike2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for flat four = " + c2engine.getEngineType());
    }
}
