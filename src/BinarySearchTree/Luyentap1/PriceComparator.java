package BinarySearchTree.Luyentap1;

import BinarySearchTree.ThucHanh3.Student;

import java.util.Comparator;

public class PriceComparator implements Comparator<ProductManagement> {
    @Override
    public int compare(ProductManagement o1, ProductManagement o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }

}
