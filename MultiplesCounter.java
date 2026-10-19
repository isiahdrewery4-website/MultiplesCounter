import java.util.Scanner;

public class MultiplesCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        int count2 = 0;
        int count4 = 0;

        int start = Math.min(firstNumber, secondNumber);
        int end = Math.max(firstNumber, secondNumber);

        for (int number = start; number <= end; number++) {
            if (number % 2 == 0) {
                count2++;
            }

            if (number % 4 == 0) {
                count4++;
            }
        }

        System.out.println("Number of multiples of 2: " + count2);
        System.out.println("Number of multiples of 4: " + count4);

        input.close();
    }
}
