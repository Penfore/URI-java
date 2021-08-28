import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;

public class uri_1005
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        NumberFormat df = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)df).applyPattern("0.00000");

        double A, B, media;

        A = Double.parseDouble(input.next());
        B = Double.parseDouble(input.next());

        media = ((3.5 * A) + (7.5 * B)) / 11;

        System.out.println("MEDIA = " + df.format(media));
    }
}