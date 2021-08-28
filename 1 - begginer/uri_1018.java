import java.util.Scanner;

public class uri_1018
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int total_balance = input.nextInt();
        int total_balance_final = total_balance;

        int oneHundred_note = total_balance_final / 100;
        total_balance_final = total_balance_final - (oneHundred_note * 100);

        int fifty_note = total_balance_final / 50;
        total_balance_final = total_balance_final - (fifty_note * 50);

        int twenty_note = total_balance_final / 20;
        total_balance_final = total_balance_final - (twenty_note * 20);

        int ten_note = total_balance_final / 10;
        total_balance_final = total_balance_final - (ten_note * 10);

        int five_note = total_balance_final / 5;
        total_balance_final = total_balance_final - (five_note * 5);

        int two_note = total_balance_final / 2;
        total_balance_final = total_balance_final - (two_note * 2);

        int one_note = total_balance_final; // RIP :(

        System.out.println(total_balance);
        System.out.println(oneHundred_note + " nota(s) de R$ 100,00" + '\n'
        + fifty_note + " nota(s) de R$ 50,00" + '\n'
        + twenty_note + " nota(s) de R$ 20,00" + '\n'
        + ten_note + " nota(s) de R$ 10,00" + '\n'
        + five_note + " nota(s) de R$ 5,00" + '\n'
        + two_note + " nota(s) de R$ 2,00" + '\n'
        + one_note + " nota(s) de R$ 1,00");
    }
}