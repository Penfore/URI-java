import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class uri_1015
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        NumberFormat df = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)df).applyPattern("0.0000");

        double x1 = Double.parseDouble(input.next());
        double y1 = Double.parseDouble(input.next());

        double x2 = Double.parseDouble(input.next());
        double y2 = Double.parseDouble(input.next());

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println(df.format(distancia));
    }
}