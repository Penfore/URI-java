import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class uri_1008
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int numero_funcionario, horas_trabalhadas;
        double salario_hora, salario;

        NumberFormat df = NumberFormat.getCurrencyInstance(Locale.US);
        ((DecimalFormat)df).applyPattern("0.00");

        numero_funcionario = input.nextInt();
        horas_trabalhadas = input.nextInt();
        salario_hora = Double.parseDouble(input.next());

        salario = horas_trabalhadas * salario_hora;

        System.out.println("NUMBER = " + numero_funcionario);
        System.out.println("SALARY = U$ " + df.format(salario));
    }
}