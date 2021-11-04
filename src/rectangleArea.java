import java.util.Scanner;

//Viết một ứng dụng để tính diện tích của hình chữ nhật dựa vào chiều rộng và chiều cao được nhập vào.
public class rectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //khoi tao doi tuong scanner de nhap lieu(in)
        System.out.println("Nhap canh a: ");
        int a = sc.nextInt(); //goi ham nhap lieu voi kieu du lieu integer

        System.out.println("Nhap canh b: ");
        int b = sc.nextInt();

        int area = a*b;
        System.out.println("Dien tich hinh chu nhat la " + area);
    }
}
