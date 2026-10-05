import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Declarations
        double cels = 0;
        double fahr = 0;
        String trash = "";

        System.out.println("Enter your Temp in Celsius");
        if (in.hasNextDouble())
        {
            cels = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Your Input is Invalid. \nTry again");
            System.exit(0);
        }

        fahr = cels * 1.8 + 32;
        System.out.println("Your Temp in Fahrenheit is "+fahr);


    }

}