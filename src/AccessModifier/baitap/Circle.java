package AccessModifier.baitap;

public class Circle {
//    Hai thuộc tính có access modifier là private: radius (double) có giá trị khởi tạo là 1.0,
//    color (String) có giá trị khởi tạo là "red".
//    Hai hàm tạo: một không có tham số và một có tham số là radius.
//    Hai phương thức có access modifier là public: getRadius và getArea.
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){ //void thì ko đc return.
        return radius*radius*Math.PI;
    }


}
