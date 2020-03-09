/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodogsmeet;
import java.util.*;
/**
 *
 * @author wizwa9381
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        String dog1name = "";
        String dog1breed = "";
        int dog1age = 0;
        int dog1aggression = 0;
        int choice;
        Scanner userInput = new Scanner(System.in);
        //Getting the dog names
        System.out.println("What is your dog's name?");
        dog1name = userInput.next();
        System.out.println("What is the breed of your dog?");
        dog1breed = userInput.next();
        System.out.println("How old is your dog?");
        dog1age = userInput.nextInt();
        System.out.println("Woud you like to set the aggression of your dog? Or would you rather have them set for you randomly?");
        System.out.println("Input '1' if you would like to set the aggression of your dog.");
        System.out.println("Input '2' if you would like the aggression to be randomly set.");
        choice = userInput.nextInt();
        if(choice == 1){
            System.out.println("What would you like the aggression of your dog to be? (0-10)");
            dog1aggression = userInput.nextInt();
        } else{
            dog1aggression = (int) (Math.random() * 10) + 1;
        }
        //Using the dog constructers
        Dog dog1 = new Dog(dog1name,dog1breed,dog1age,dog1aggression);
        Dog dog2 = new Dog();
        //Making the dogs interact
        if(dog1.getAggression() > 5 || dog1.getHunger() > 5){
            if(dog2.getAggression() > 5 || dog2.getHunger() > 5){
                System.out.println("The dogs look ready to fight.");
                System.out.println("Your dog:");
                dog1.barkAngry();
                System.out.println("Other dog:");
                dog2.barkAngry();
            } else if(dog2.getAggression() <= 5 || dog2.getHunger() <= 5){
                System.out.println("Your dog wants to attack the friendly dog.");
                System.out.println("Your dog:");
                dog1.barkAngry();
                System.out.println("Other dog:");
                dog2.barkFriendly();
            }
        } else if(dog2.getAggression() > 5 || dog2.getHunger() > 5){
            System.out.println("The other dog wants to attack your friendly dog.");
            System.out.println("Your dog:");
            dog1.barkFriendly();
            System.out.println("Other dog:");
            dog2.barkAngry();
        } else {
            System.out.println("Your dogs greet each other like friends.");
            System.out.println("Your dog:");
            dog1.barkFriendly();
            System.out.println("Other dog:");
            dog2.barkFriendly();
        }
        System.out.println("---------------------------------");
        System.out.println("Your dog in numbers:");
        System.out.println(dog1.toString());
        System.out.println("The other dog in numbers:");
        System.out.println(dog2.toString());
    }
    
}
