import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class uri_1011
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        NumberFormat df = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)df).applyPattern("0.000");

        final double PI = 3.14159;

        double raio = Double.parseDouble(input.next());

        double volume = (4.0/3) * PI * Math.pow(raio, 3);

        System.out.println("VOLUME = " + df.format(volume));
    }
}