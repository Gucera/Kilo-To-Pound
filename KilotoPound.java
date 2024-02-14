import java.util.Scanner;

public class KilotoPound
{

    public static void main(String[] args)
    {
        double kilo, pounds, litre, gallon;
        Scanner sc = new Scanner(System.in);
        System.out.println("***kilo to pound***");

        System.out.print("Enter kilo: ");
        kilo = sc.nextDouble();
        pounds= 2.2 * kilo;
        System.out.println("pounds: " + pounds);
        System.out.println("***Gallon to Litres***");
        System.out.print("Enter Gallons: ");
        gallon = sc.nextDouble();
        litre = 4.54609188 * gallon;
        System.out.print("Litres: " + litre);


    }

}
