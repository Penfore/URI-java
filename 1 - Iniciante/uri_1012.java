import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class uri_1012
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        NumberFormat df = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)df).applyPattern("0.000");

        final double PI = 3.14159;

        double a = Double.parseDouble(input.next());
        double b = Double.parseDouble(input.next());
        double c = Double.parseDouble(input.next());

        double triangulo = (a * c) / 2.0;
        double circulo = PI * Math.pow(c, 2);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.println("TRIANGULO: " + df.format(triangulo) + '\n'
        + "CIRCULO: " + df.format(circulo) + '\n'
        + "TRAPEZIO: " + df.format(trapezio) + '\n'
        + "QUADRADO: " + df.format(quadrado) + '\n'
        + "RETANGULO: " + df.format(retangulo));   
    }
}