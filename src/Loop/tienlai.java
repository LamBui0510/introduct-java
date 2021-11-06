package Loop;
//Ứng dụng cho phép nhập vào 3 tham số: số lượng tiền cho vay, tỉ lệ lãi suất theo tháng,
// số tháng cho vay.
// Ứng dụng sẽ hiển thị tổng số tiền có được khi hết thời hạn cho vay.
// Cách tính tiền lãi:
// Tiền gửi có kỳ hạn là loại tiền gửi tiết kiệm chỉ có thể
// rút ra sau một khoảng thời gian nhất định người gửi tiền đã cam kết với ngân hàng.
// Bên ngân hàng sẽ đưa ra nhiều mức kỳ hạn khác nhau để khách hàng có thể chọn lựa theo
// tuần, tháng, quý, năm.
//        Công thức:
//        Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi

import java.util.Scanner;

public class tienlai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        double send = sc.nextDouble();
        System.out.println("Nhập tỷ lệ lãi suất");
        double interestRate = sc.nextDouble();
        System.out.println("Nhập số tháng gửi");
        double month = sc.nextDouble();

        double interestMoney = send * (interestRate/12*100)*month;
        System.out.println(interestMoney);
    }
}
