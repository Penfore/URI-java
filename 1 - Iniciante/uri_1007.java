import java.util.Scanner;

public class uri_1007 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int A, B, C, D, diferença_produto;

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        diferença_produto = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + diferença_produto);
    }
}