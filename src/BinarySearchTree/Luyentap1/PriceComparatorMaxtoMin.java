package BinarySearchTree.Luyentap1;

import java.util.Comparator;

public class PriceComparatorMaxtoMin implements Comparator<ProductManagement> {
    @Override
    public int compare(ProductManagement o1, ProductManagement o2) {
        if (o1.getPrice() < o2.getPrice()) { //Max to min
            return 1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
