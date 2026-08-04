import java.util.*;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingCharacter(String s) {
        if (s == null || s.isEmpty()) {
            return '-';
        }

        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s.toCharArray()) {
            if (freq.get(ch) == 1) {
                return ch;
            }
        }

        return '-';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char ans = firstNonRepeatingCharacter(s);
        if (ans == '-') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + ans);
        }
        sc.close();
    }
}
