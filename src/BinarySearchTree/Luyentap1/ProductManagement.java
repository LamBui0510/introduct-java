package BinarySearchTree.Luyentap1;

public class ProductManagement {
    private String name;
    private int price;
    private int id;
    private static int idNumber;

    public ProductManagement() {
    }

    public ProductManagement(String name, int price) {
        this.name = name;
        this.price = price;
        this.id = ++idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        ProductManagement.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
