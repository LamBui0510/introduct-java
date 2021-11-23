package BinarySearchTree.Luyentap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Thêm sản phẩm
//       1 Sửa thông tin sản phẩm theo id
//        2Xoá sản phẩm theo id
//        3Hiển thị danh sách sản phẩm
//        4 Tìm kiếm sản phẩm theo tên
//        5 Sắp xếp sản phẩm tăng dần, giảm dần theo giá
public class ProductController {
     static Scanner sc = new Scanner(System.in);
     //1 tạo array list
    static ArrayList<ProductManagement> products = new ArrayList<>();
    public static void add(){
        products.add(createProduct());
    }

    private static ProductManagement createProduct() {
        System.out.println("input product name");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("input price");
        int price = sc.nextInt();
        return new ProductManagement(name,price);
    }

    public static void delete(){
        System.out.println("Nhap id ban muon xoa");
        int id = sc.nextInt();

        for (int i = 0; i < products.size(); i++) {
          if(products.get(i).getId() == id){
              products.remove(i);  // xóa theo index
          }

        }
    }
    public static void show(){
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }
    public static void search(){
        System.out.println("Nhập tên bạn muốn tìm");
        String name = sc.nextLine();
        for (int i = 0; i < products.size(); i++) {
        if(name == products.get(i).getName()){
            System.out.println(products.get(i).toString());
        }
        }
    }
    public static void range(){
        PriceComparator prices = new PriceComparator();
        Collections.sort(products,prices);
        System.out.println(" Sắp xếp từ lớn đến nhỏ");
        show();
    }
    public static void rangemin(){
        PriceComparatorMaxtoMin prices = new PriceComparatorMaxtoMin();
        Collections.sort(products,prices);
        System.out.println(" Sắp xếp từ lớn đến nhỏ");
        show();
    }

}
