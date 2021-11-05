import java.util.Scanner;
//Chỉ số khối cơ thể (Body mass index-BMI) là một thước đo sức khoẻ dựa trên cân nặng và chiều cao.
// Nó được tính bằng cách lấy cân nặng đơn vị tính kilogam chia cho bình phương của chiều cao
// đơn vị tính mét. Công thức:
public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập cân nặng: ");
        double weight = sc.nextDouble();

        System.out.println("Nhập chiều cao");
        double height = sc.nextDouble();

        System.out.println();
        double bmiindex = weight/(Math.pow(height,2));

       if (bmiindex < 18.5){
            System.out.println(bmiindex + "under weight");
        }else if (18.5 <= bmiindex && bmiindex < 25.0){
           System.out.println(bmiindex + "normal");
       }else if (25.0 <= bmiindex && bmiindex < 30.0){
           System.out.println(bmiindex +"over weight");
       }else {
        System.out.println(bmiindex + "obese");
       }
    }
}
