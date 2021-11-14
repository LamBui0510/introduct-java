package kethua.demo;

public class Main {
    public static void main(String[] args) {
        //tạo đối tượng ăn thịt để chạy chương trình
        AnThit bao = new AnThit();
        AnCo huou = new AnCo();
        Animal animal = new Animal();
        Animal ho = new AnThit("hổ");
////        animal.setAge(33);
////        System.out.println(animal.getAge());
////        bao.eat();
////        bao.setAge(12);
////        System.out.println(bao.getAge());
////        bao.san();
////        bao.eat();
////        huou.eat();
//        bao.san();
//
        ((AnThit) ho).eat("Hươu");




        //báo bây h là đối tượng trong class ăn thịt con của class animal
        // nên có thể chấm trực tiếp toàn bộ thuộc tính phương thức của cha, còn với thuộc tính private
        // thì vẫn kế thừa nhưng phải nhờ get set
    }
}
