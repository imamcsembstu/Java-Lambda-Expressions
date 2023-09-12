interface Addable{
    int add(int a,int b);
}
public class LambdaExpressionExampleMultipleParameters {
    public static void main(String[] args) {

        Addable obj=(a,b)-> (a+b);
        System.out.println(obj.add(13,43));

        Addable obj2=(a,b)-> (a+b);
        System.out.println(obj2.add(33,17));
    }

}
