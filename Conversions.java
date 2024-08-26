import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println(x:"7. Hours to Minutes");
        System.out.println(x:"8. Minites to Hours");
        System.out.println(x:"9. Days to Years");
        System.out.println(x:"10. Years to Days");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println(x:"Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextdouble();
            keyboard.nextLine();
            double celsius = fahrenheit / (9.0 / 5.0) + 32;
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 3)
        {
            System.out.println(x:"Enter Feet: ");
            double feet = keyboard.nextdouble();
            keyboard.nextLine();
            double meters = feet * 3.28;
            System.out.println(feet + " feet is " + meters + " meters ");
        }   
        if (selection == 4)
        {
            System.out.println(x:"Enter Meters: ");
            double meters = keyboard.nextdouble();
            keyboard.nextLine();
            double feet = meters /3.28;
            System.out.println(meters + " meters is" + feet + " feet ");
        }
        if (selection == 5)
        {
            System.out.println(x:"Enter Ounces: ");
            double ounces = keyboard.nextdouble();
            keyboard.nextLine();
            double milliliters = ounces * 29.57;
            System.out.println(ounces + " ounces is" + milliliters + " milliliters ");
        }
        if (selection == 6)
        {
            System.out.println(x:"Enter Milliliters: ");
            double milliliters = keyboard.nextdouble();
            keyboard.nextLine();
            double ounces = milliliters / 29.57;
            System.out.println(milliliters + " milliliters is" + ounces + " ounces ");
        }
        if (selection == 7) 
        {
            System.out.println(x:"Enter Hours: ");
            double hours = keyboard.nextdouble();
            keyboard.nextLine();
            double minutes = hours * 60;
            System.out.println(ounces + " ounces is" + milliliters + " milliliters ");
            //add more if statements here.
    }
}