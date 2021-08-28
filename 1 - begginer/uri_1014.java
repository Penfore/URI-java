import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class uri_1014
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        NumberFormat df = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)df).applyPattern("0.000");

        double distancia_percorrida = Double.parseDouble(input.next()); // em KM
        double combustivel_gasto = Double.parseDouble(input.next()); // em litros

        double consumo_medio = distancia_percorrida / combustivel_gasto;

        System.out.println(df.format(consumo_medio) + " km/l");
    }
}