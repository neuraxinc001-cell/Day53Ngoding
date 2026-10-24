import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        do {
            System.out.println("angka : " + a);
            a++;
        }
        while (a <= b);

    }
}
