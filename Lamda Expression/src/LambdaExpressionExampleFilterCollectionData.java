import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Products{
    int id;
    String name;
    float price;
    public Products(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;

    }
}
public class LambdaExpressionExampleFilterCollectionData {
    public static void main(String[] args) {
        List<Products> pList=new ArrayList<>();
        pList.add(new Products(1,"Samsung A5",17000f));
        pList.add(new Products(3,"Iphone 6S",65000f));
        pList.add(new Products(2,"Sony Xperia",25000f));
        pList.add(new Products(4,"Nokia Lumia",15000f));
        pList.add(new Products(5,"Redmi4 ",26000f));
        pList.add(new Products(6,"Lenevo Vibe",19000f));


        // using lambda to filter data
        Stream<Products> filterList=pList.stream().filter(p->p.price>18000);


        // using lambda to iterate through collection

        filterList.forEach(itr-> System.out.println("\nID: "+itr.id+":  "+itr.name+": "+itr.price));

    }

}
