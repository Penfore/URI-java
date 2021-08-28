import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class uri_1017
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        NumberFormat df = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)df).applyPattern("0.000");

        int time_spent, average_speed;

        time_spent = input.nextInt();
        average_speed = input.nextInt();

        double liters_needed = (Double.valueOf(time_spent) * Double.valueOf(average_speed)) / 12;

        System.out.println(df.format(liters_needed));
    }
}