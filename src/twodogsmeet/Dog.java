package twodogsmeet;

public class Dog {
    //variables for characteristics

    private String dogName, dogBreed;
    private int aggression, hunger,age;

    //Constructor
    public Dog() {
        dogName = "Snoop";
        dogBreed = "Unknown Breed";
        age = (int) (Math.random() * 10) + 1;
        aggression = (int) (Math.random() * 10) + 1;
        hunger = (int) (Math.random() * 10) + 1;
    }

    //Alternate constructor
    public Dog(String dgName, String dgBreed, int dgAge, int dgAggression) {
        dogName = dgName;
        dogBreed = dgBreed;
        age = dgAge;
        aggression = dgAggression;
        hunger = (int) (Math.random() * 10) + 1;
    }

    public int getAggression(){
        return aggression;
    }
    
    public int getHunger(){
        return hunger;
    }

    public void barkFriendly() {
        System.out.println("Arf! Arf!");
    }

    public void barkAngry() {
        System.out.println("GRR! RRRFFF!");
    }
    
    //method to display all info of the Dog
    public String toString() {
        String output = "Name: " + dogName + "\n";
        output += "Breed: " + dogBreed + "\n";
        output += "Aggression: " + aggression + "\n";
        output += "Hunger: " + hunger + "\n";
        output += "Age: " + age + "\n";
        output += "---------------------------------" + "\n";
        //output string is complete, return it
        return output;
    }
}
