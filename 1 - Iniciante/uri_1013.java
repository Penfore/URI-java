import java.util.Scanner;
import java.util.Locale;

public class uri_1013
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maior_1 = (a + b + Math.abs(a - b)) / 2;
        int maior_final = (maior_1 + c + Math.abs(maior_1 - c)) / 2;

        System.out.println(maior_final + " eh o maior");
    }
}