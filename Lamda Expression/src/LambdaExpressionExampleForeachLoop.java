import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExampleForeachLoop {
    public static void main(String[] args) {
        List<Integer> listIntObject= new ArrayList<>();

        for(int item=0; item<=50; item=item+10) {
            listIntObject.add(item);
        }

        listIntObject.forEach(
                (n)-> System.out.println(n)
        );
    }
}
