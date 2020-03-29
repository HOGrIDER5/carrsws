/*
 * Amer Stas
 * 3/9/2020
 * This program takes the data values from the Dog class and prints them out to the user 
 */
package dogtester;
import cartester101.Car;
import static cartester101.Car.honkHorn;
/**
 *
 * @author User
 */
public class cartester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Honda", "Accord", "Blue", 2013);
        Car car3 = new Car("Mercedes" , "Benz", "Black", 2018);
        Car car4 = new Car("Ferrari","812","red",2020);

        car1.setPrice(15679);
        System.out.println(car1.getPrice());
        System.out.println(car2.getPrice());
        System.out.println(car3.getPrice());

        //Print the details of each car
        System.out.println(car1.toString());
        System.out.println("--------------------------");

        System.out.println(car2.toString());
        System.out.println("--------------------------");

        //toString is called by default, no need to write it!
        System.out.println(car3);
        System.out.println("--------------------------");
        System.out.println(car4);
        System.out.println("--------------------------");

        //BEEP BEEP
        honkHorn(); 
    }
    }

