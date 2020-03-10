import java.util.Scanner;

public class Solution_1002 {
    public static void main(String[] args) {
        String[] str = new String[]{
                "ling", "yi", "er", "san", "si",
                "wu", "liu", "qi", "ba", "jiu"
        };
        String num;
        Scanner in = new Scanner(System.in);
        num = in.next();
        int sum = 0;
        for (int i = 0; i < num.length(); i++){
            sum += (num.charAt(i) - '0');
        }
        String res = String.valueOf(sum);
        for (int i = 0; i < res.length(); i++){
            if (i == 0)
                System.out.print(str[res.charAt(i) - '0']);
            else
                System.out.print(" " + str[res.charAt(i) - '0']);
        }
    }
}
