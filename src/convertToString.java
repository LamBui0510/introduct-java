import java.util.Scanner;

//Giả sử bạn đang tham gia viết chương trình cho máy đo chiều cao cân nặng,
// hãy viết một chương trình có khả năng đọc các số nguyên không âm có tối đa 3 chữ số.
public class convertToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập cân nặng");
        int weight = sc.nextInt();
        String s = Integer.toString(weight); //convert to string
        String[] show = s.split("");   //tach chuoi
        for (String c : show) {              //duyet mang for(let c = 0; c<= show.length; c++
            readNumber(c);
        }
    }
    public static void readNumber(String c) { //static + void : la phuong thuc(static) khong co kieu du kieu tra ve
        switch (c) {
            case "0":
                System.out.print(" Không ");
                break;
            case "1":
                System.out.print(" Một ");
                break;
            case "2":
                System.out.print(" Hai ");
                break;
            case "3":
                System.out.print(" Ba ");
                break;
            case "4":
                System.out.print(" Bốn ");
                break;
            case "5":
                System.out.print(" Năm ");
                break;
            case "6":
                System.out.print(" Sáu ");
                break;
            case "7":
                System.out.print(" Bảy ");
                break;
            case "8":
                System.out.print(" Tám ");
                break;
            case "9":
                System.out.print(" Chín ");
                break;

        }
    }
}
