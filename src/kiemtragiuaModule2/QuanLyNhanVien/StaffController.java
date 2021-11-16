package kiemtragiuaModule2.QuanLyNhanVien;

import java.util.Scanner;

public class  StaffController{
    static Scanner sc = new Scanner(System.in);
        public static Staff createStaff(){
            System.out.println("Nhập tên nhân viên");
            String name = sc.nextLine();
            System.out.println("Nhập sđt nhân viên");
            String phoneNumber = sc.nextLine();
            System.out.println("Nhập địa chỉ nhân viên");
            String address = sc.nextLine();
            return new Staff( name, phoneNumber, address);

        }

        public static Staff[] addStaff(Staff[] staffs) {
            Staff newStaffs = createStaff();
            Staff[] newStaff = new Staff[staffs.length+ 1];

            System.arraycopy(staffs, 0, newStaff, 0, staffs.length); //System.arraycopy ( mang goc, vi tri copy, mang moi, vi tri muon copy,do dai muon copy)
            newStaff[staffs.length] = newStaffs;
            return newStaff;
        }

    public static int checkId(int id,Staff[] staffs) {
            for (int i = 0; i < staffs.length; i++) {
            if (id == staffs[i].getId()) {
                return i;
            }
        }
        return -1;
    }
        public static Staff[] deleteStaff(Staff[] staffs){
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập id muốn xóa");
            int idInput = sc.nextInt();
          if(checkId(idInput,staffs)>-1){
             int index = checkId(idInput,staffs);
              Staff[] newstaffs = new Staff[staffs.length-1];
              int c=0;
              for (int i = 0; i < staffs.length; i++) {
                    if(i!=index){
                        newstaffs[c]=staffs[i];
                        c++;
                    }
              }
              return newstaffs;
            }
            return staffs;
        }
        public static void show(Staff[] staffs){
//            for (Staff staff : staffs) {
//                System.out.println(staff.toString());
//            }
            for (int i = 0; i < staffs.length; i++) {
                System.out.println(staffs.toString());

            }
        }
        public static Staff[] changeStaff(Staff[] staffs){
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap id muon chinh");
            int editId = sc.nextInt();
            for (int i = 0; i < staffs.length; i++) {
                if(checkId(editId,staffs)>-1) {
                    int index = checkId(editId, staffs);
                    staffs[index] = createStaff();
                }
            }return staffs;
        }
    }

