import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
    int id;
    String name;
    float cgpa;
    public Product(int id, String name, float cgpa){
        super();
        this.id=id;
        this.name= name;
        this.cgpa=cgpa;

    }
}
public class LambdaExpressionExampleComparator {


    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        //Adding Products
        list.add(new Product(1, "HP Laptop", 25000f));
        list.add(new Product(3, "Keyboard", 300f));
        list.add(new Product(2, "Dell Mouse", 150f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression

        Collections.sort(list,(p1, p2) -> {   //p1 and p2 are object in Object Class which receive the name
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.cgpa);
        }

    }
}


