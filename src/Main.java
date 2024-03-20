import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);

        int a = ac.nextInt();
        int b = ac.nextInt();

        if (a> b) {
            System.out.println("a가 더 큽니다.");
        } else if (a == b) {
            System.out.println("둘이 같습니다.");
        }else System.out.println("b가 더 큽니다.");
    }
}