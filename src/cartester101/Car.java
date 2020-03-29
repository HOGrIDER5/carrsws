/*
 * Amer Stas
 * 3/9/2020
 * This program creates constructors and methods of cars
 */
package cartester101;

/**
 *
 * @author User
 */
public class Car {
    //variables for characteristics

    private String make, model, color;
    private int price, year,maxspeed;
    private boolean led, nicetires;
    
    
//Constructor without paremeters

    public Car() {
        make = "Kia";
        model = "Picanto";
        color = "Grey";
        price = 0;
        year = 2010;
        led = true;
        nicetires = true;
    }
// constructor with parameters

    public Car(String company, String type, String colour, int date) {

        make = company;
        model = type;
        color = colour;
        year = date;
        int cost = (int) (Math.random() * 5000 + 10000);
        price = cost;
        int speed = (int)(Math.random()*200+100);
        maxspeed=speed;
        int choice = (int)(Math.random()*4 + 2);
        if (choice == 1 && choice ==4) {
            nicetires=true;
        }else{
            nicetires=false;
        }
        int choice1 = (int) (Math.random() * 2 + 1);
        if (choice1 == 1) {
            led = true;
        } else {
            led = false;
        }

    }
    /**
     * This method allows the user to set the price of the car pre: needs a
     * price value post: sets the price value
     * @return 
     */
    public int getPrice() {
        return price;
    }

    /**
     * This method allows the user to set the price of the car pre: needs a
     * price value post: sets the price value
     * @param pricee
     */
    public void setPrice(int pricee) {
        price = pricee;
    }

    /**
     * This method allows for a car to honk its horn
     */
    public static void honkHorn() {
        System.out.println("Beep! Beep!");
    }

    //method to display all info of the car
    public String toString() {
        String output = "Make: " + make + "\n";
        output += "Model: " + model + "\n";
        output += "Color: " + color + "\n";
        output += "Cost: " + price + "\n";
        output += "Year: " + year + "\n";
        output += "Max speed" + maxspeed + "\n";
        output += "Led lights: " + led + "\n";
        output += "Nice Tires:" + nicetires+"\n";
        //output string is complete, return it
        return output;
    }

}