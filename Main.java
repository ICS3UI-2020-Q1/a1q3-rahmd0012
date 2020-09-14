import java.util.Scanner;

/**
 * a program to tell me how many computer parts I will need to buy
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner used for input
    Scanner input = new Scanner(System.in);

    //declare and initialize a variable to store the price of the chromebook charger
    double charger = 34.99;

    //declare and initialize a variable to store the price of the motherboard
    double motherboard = 127.50;

    //declare and initialize a variable to store the price of the mouse
    double mice = 18.00;

    //declare and initialize a variable to store the amount of chargers we need
    int chargAmount = 3;

    //declare and initialize a variable to store the amount of motherboards we need
    int motherAmount = 2;

    //declare and initialize a variable to store the amount of mice we need
    int miceAmount = 5;

    //declare and calculate the amount of money it costs to buy the chargers
    double chargersCost = charger*chargAmount;

    //declare and calculate the amount of money it costs to buy the motherboards
    double motherCost = motherboard*motherAmount;

    //declare and calculate the amount of money it costs to buy the mice
    double miceCost = mice*miceAmount;

    //declare and calculate the subtotal
    double subtotal = chargersCost + motherCost + miceCost;
    
    //tell the user the subtotal
    System.out.println("The subtotal of these parts are $" + subtotal);

    //declare and calculate the tax of this costs
    double taxes = subtotal*0.13;

    //tell the user the cost of taxes
    System.out.println("The cost of the tax is $" + taxes);

    //declare and calculate the total cost
    double total = subtotal + taxes;

    //tell the user the total costs
    System.out.println ("The total cost of these parts are $" + total);
    
    
  }
}
