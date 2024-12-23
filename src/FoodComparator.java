import java.util.Comparator;

class FoodComparator implements Comparator<Food> {
    public int compare(Food f1, Food f2) {
        return f1.toString().compareTo(f2.toString());
    }
}
