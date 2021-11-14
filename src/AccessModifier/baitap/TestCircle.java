package AccessModifier.baitap;

public class TestCircle {
    //    Hãy tạo lớp TestCircle, tạo đối tượng Circle và truy cập đến các phương thức getRadius() và getArea().
//
//    Thay đổi access modifier cho các phương thức getRadius() và getArea(), sau đó test lại.
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.print(circle.getRadius());
        System.out.print(circle.getArea());
    }
}
