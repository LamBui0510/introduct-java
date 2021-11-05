import java.util.Scanner;
//cho phép nhập tên của người dùng từ bàn phím, sau đó hiển thị lời chào kèm theo tên của người đó.
//
//        Enter your name:
//        Bill Gates
//        Hello: Bill Gates
public class loichao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}
