package Question_16;
import java.util.*;

public class qustion_16 {
    public static void main(String[] args) {
        qustion_16 finder = new qustion_16();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        finder.searchSumOfOddNumbers(n);
        finder.searchEvenInSum(n);
    }


    private int searchSumOfOddNumbers(int n) {  // метод, определяющую сумму  n  -  значных чисел, содержащих только нечетные цифры.
        int first = (int) Math.pow(10, n - 1) + 1;
        int second = (first - 1) * 10 - 1;
        int sum = 0;
        if(n==1) {
            for (int i = first-1; i <= second; i += 2) {
                sum += i;
            }
        }
        if(n>1){
            for (int i = first; i <= second; i += 2) {
                sum += i;
            }
        }
        System.out.println("The sum of "+n+"-digit odd numbers is: " + sum);
        return sum;
    }

    private void searchEvenInSum(int n) { //метод, определяющий сколько четных цифр в найденной сумме
        int sum = searchSumOfOddNumbers(n);
        int count = 0;
        while (sum != 0) {
            int part = sum % 10;
            if ((part % 2 == 0))
                count++;
            sum /= 10;
        }
        System.out.println("The number of even numbers in the sum: " + count);









    }
}





