import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class uri_1010
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in); 

        NumberFormat df = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)df).applyPattern("0.00");

        int codigo_peca1, quantidade_peca1;
        double valorUnitario_peca1;

        int codigo_peca2, quanitdade_peca2;
        double valorUnitario_peca2;

        // Linha 1
        codigo_peca1 = input.nextInt();
        quantidade_peca1 = input.nextInt();
        valorUnitario_peca1 = Double.parseDouble(input.next());

        // Linha 2
        codigo_peca2 = input.nextInt();
        quanitdade_peca2 = input.nextInt();
        valorUnitario_peca2 = Double.parseDouble(input.next());

        double valor_total = (quantidade_peca1 * valorUnitario_peca1) + (quanitdade_peca2 * valorUnitario_peca2);

        System.out.println("VALOR A PAGAR: R$ " + df.format(valor_total));
    }
}