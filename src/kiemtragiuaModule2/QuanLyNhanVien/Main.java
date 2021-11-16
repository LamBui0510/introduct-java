package kiemtragiuaModule2.QuanLyNhanVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Staff[] staff = new Staff[2];
        staff[0]=new Staff("Toan","123","Quang Ninh");
        staff[1]=new Staff("Quan","123","Quang Ninh");
        while (true){
            System.out.println("Menu");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Xoa nhan vien");
            System.out.println("3. Hien thi nhan vien");
            System.out.println("4. Sua thong tin nhan vien");
            System.out.println("0.Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    staff=StaffController.addStaff(staff);
                    break;
                case 2:
                    staff=StaffController.deleteStaff(staff);
                    break;
                case 3:
                    StaffController.show(staff);
                    break;
                case 4:
                    StaffController.changeStaff(staff);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Hay nhap lai");
            }
        }

    }
}
