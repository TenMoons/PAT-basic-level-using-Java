import java.util.Scanner;

public class Solution_1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int step = 0;

        while (num != 1){
            if (num % 2 != 0){
                num = 3 * num + 1;
            }
            num /= 2;
            step++;
        }
        System.out.println(step);
    }
}
