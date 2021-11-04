import java.util.Scanner;

//iết một chương trình tính số ngày trong tháng của một tháng cho trước.
// Trong một năm, tháng 2 có thể có 28 hoặc 29 ngày,
// các tháng 1, 3, 5, 7, 8, 10, 12 có 31 ngày, các tháng còn lại có 30 ngày.
public class Songaytrongthang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //khởi tạo hàm để nhập giá trị
        System.out.println("which month that you want to count days?");
        int month = sc.nextInt(); //gán gtri
        switch (month) {
            case 2 :
                System.out.println("tháng 2 có 28 hoặc 29 ngày");
                break;
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("Tháng "+ month + "có 30 ngày");
                break;
            default:
                System.out.println(" Hãy nhập lại");

        }

    }
}
