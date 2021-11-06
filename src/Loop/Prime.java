package Loop;
//
//Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép kiểm tra một số xem có phải
// là số nguyên tố hay không.
//
// Số nguyên tố là một số nguyên dương chỉ chia hết cho 1 và chính nó.
//
// Ứng dụng cho phép người dùng nhập vào một số và hiển thị kết quả là số đó
// là số nguyên tố hoặc không phải là số nguyên tố.
//
// * Với một số nguyên dương A lớn hơn 1,
// kiểm tra từ  2 đến căn bậc 2 của A, nếu A chia hết cho một số trong khoảng đó thì
// A không phải là số nguyên tố, ngược lại A là số nguyên tố.
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra: ");
        int isPrime = sc.nextInt();
        System.out.println();
        boolean check = true;

        if (isPrime < 2) {
            check = false;
            System.out.println(isPrime + " Không phải là SNT ");
        } else {
            for (int i = 2; i < Math.sqrt(isPrime); i++) {
                if (isPrime % i == 0) {
                    check = false;
                    break;
                }

            }

        }
        if (check) {
            System.out.println(isPrime + " là snt");

        } else {
            System.out.println(isPrime + " không là snt");
        }
    }
}