// import java.util.Scanner;

// public class MissingRollNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the total number of students (N): ");
//         int n = sc.nextInt();

//         int[] roll = new int[n - 1];

//         System.out.println("Enter the roll numbers present:");
//         for (int i = 0; i < n - 1; i++) {
//             roll[i] = sc.nextInt();
//         }

//         // Sum of numbers from 1 to N
//         int totalSum = n * (n + 1) / 2;

//         // Sum of entered roll numbers
//         int currentSum = 0;
//         for (int i = 0; i < n - 1; i++) {
//             currentSum += roll[i];
//         }

//         int missingRoll = totalSum - currentSum;

//         System.out.println("Missing Roll Number = " + missingRoll);

//         sc.close();
//     }
// }

public class MissingRollNumber {
    public static int findingMissing(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;
        }
        return (totalSum - currentSum);
    }
        public static void main(String[] args){
            int[] arr = {1, 2, 3, 4, 6};
            int n = 6;
            System.out.println("Missing Roll Number = " + findingMissing(arr, n));

        }
    }