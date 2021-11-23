package BinarySearchTree.Luyentap1;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true){
            System.out.println("Menu");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Xoa nhan vien");
            System.out.println("3. Hien thi nhan vien");
            System.out.println("4. Tim kiem thong tin nhan vien");
            System.out.println("5. Sắp xếp theo giá");
            System.out.println("0.Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    ProductController.add();
                    break;
                case 2:
                    ProductController.delete();
                    break;
                case 3:
                    ProductController.show();
                    break;
                case 4:
                    ProductController.search();
                    break;
                case 5:
                    System.out.println("1. sắp xếp theo thứ tụ từ nhỏ đến lớn");
                    System.out.println("2. sắp xếp theo thứ tụ từ lớn đến nhỏ");
                    choice = sc.nextInt();
                    switch (choice){
                        case 1: ProductController.range();
                        break;
                        case 2:ProductController.rangemin();
                        break;
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println(" Mời bạn nhập lại");
                    break;
            }
        }
    }
}
