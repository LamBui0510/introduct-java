package kethua.demo;

public class AnThit extends Animal {
    //bên class con có thể tự tạo thêm các thuộc tính pthuc cho rieng mình ko ah đến cha
    private String loaiThit;

    public void san() {
        System.out.println("rình mò");
        super.eat(); //gọi đến pthuc ăn của cha
        eat();// gọi đến pthuc ăn của con do đã bị ghi đè ở dưới
        run();//gọi pthuc run() của cha
    }

    public AnThit(String loaiThit) {
        this.loaiThit = loaiThit;
    }

    public AnThit() {
        super("bao", 10);
    }

    @Override
    public void eat() {
        System.out.println("ăn thịt");
    }

    public String eat(String loaiThit) { //thì khi mà header khác cha chỉ cùng tên pt có nghĩa là tự tạo pt mới, nạp chồng chứ ko phải ghi đè
        System.out.println("ăn thịt");
        return "A";
    }
}
