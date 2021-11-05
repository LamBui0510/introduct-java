import java.util.Scanner;
//tìm giá trị trung bình các số chia hết cho 3 và 4 trong từ 10-30
public class timavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 10; i <= 30 ; i++) {
            if (i % 3 == 0 || i % 4 == 0 ){
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
