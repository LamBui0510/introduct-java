package kethua.demo;

public class Animal { //khai báo thuộc tính
    private String name;
    private int age = 10;
    private String gender;
    private float weight;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String gender, float weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void eat() { //khai báo phương thức
        System.out.println("ăn cỏ");
    }

    public void run() {
        System.out.println("chạy 4 chân");
    }

    public void say() {
        System.out.println("meow");
    }
    //vì các thuộc tính trên là private nên phải có getter setter, sau đó đi tạo lớp con để lấy các thuộc tính pthuc của lớp cha animal
    //vì lớp cha chưa có constructor nên sẽ có mặc định ko tham số

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {//đây là pt đc ghi đè của class tổng Object đc mặc định sẵn
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }
}
