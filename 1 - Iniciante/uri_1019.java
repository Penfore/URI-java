import java.util.Scanner;

public class uri_1019
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int entry = input.nextInt();

        int timeInSeconds = (entry % 3600) % 60;
        int timeInMinutes = (entry % 3600) / 60;
        int timeInHours = entry / 3600;

        System.out.println(timeInHours + ":" + timeInMinutes + ":" + timeInSeconds);
    }   
}