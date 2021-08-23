import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class uri_1006
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        NumberFormat df = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)df).applyPattern("0.0");

        double A, B, C, media;

        A = Double.parseDouble(input.next());
        B = Double.parseDouble(input.next());
        C = Double.parseDouble(input.next());

        media = ((2 * A) + (3 * B) + (5 * C)) / 10;

        System.out.println("MEDIA = " + df.format(media));
    }
}