import java.util.Scanner;

public class uri_1004
{
    public static void main(String args[])
    {
        int A, B, PROD;

        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        B = input.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);
    }
}