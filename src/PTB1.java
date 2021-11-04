import java.util.Scanner;

//Viết chương trình LinearEquationResolver cho phép tìm ra nghiệm của một phương trình bậc nhất
// từ các hệ số do người dùng nhập vào.
public class PTB1 {
    public static void main(String[] args) {
        System.out.println("Liner Equation Resolve");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants: ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so a");
        double a = sc.nextDouble();

        System.out.println("Nhap so b");
        double b = sc.nextDouble();

        System.out.println("Nhap so c");
        double c = sc.nextDouble();

        if ( a != 0){
            double x = (c-b)/a;
            System.out.print("Equation pass with x = %f!\n" + x); // \n space
        }else {
            if ( b == c){
                System.out.println("Solution is all x");
            }else {
                System.out.println("no solution");
            }
        }
    }
}

