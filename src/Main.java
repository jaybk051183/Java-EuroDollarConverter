import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which currency would you like to convert? Type 1 for dollar and 2 euro");

        int user = userInput.nextInt();

        if (user == 1) {
            System.out.println("How many dollars do you have?");

            double inputDollar = user.nextInt();

            double exchangeToEuro = inputDollar;

            exchangeToEuro = exchangeToEuro / 1.03;

            System.out.println("The amount is " + exchangeToEuro);



        }








        Scanner input = new Scanner(System.in);
        int guessA = input.nextInt();

    }
}



