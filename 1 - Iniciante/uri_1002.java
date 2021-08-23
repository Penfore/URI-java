import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class uri_1002
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in); // Criando um objeto para input

        double raio, area;
        final double n = 3.14159;

        raio = Double.parseDouble(input.next()); // Recebendo um tipo String como entrada e convertendo para double para não causar erros

        area = Math.pow(raio, 2) * n;

        NumberFormat ponto_flutuante = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)ponto_flutuante).applyPattern("#.0000");

        System.out.println("A=" + ponto_flutuante.format(area));
    }
}