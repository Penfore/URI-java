import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class uri_1009
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        NumberFormat df = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)df).applyPattern("0.00");

        String nome = input.next();
        double salario_fixo = Double.parseDouble(input.next());
        double total_vendas = Double.parseDouble(input.next());

        double salario_total_mes = salario_fixo + (total_vendas * 0.15);

        System.out.println("TOTAL = R$ " + df.format(salario_total_mes));
    }
}