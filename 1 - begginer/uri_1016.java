import java.util.Scanner;

public class uri_1016
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int distancia = input.nextInt();

        int tempo_minutos = (60 * distancia) / 30;

        System.out.println(tempo_minutos + " minutos");
    }
}