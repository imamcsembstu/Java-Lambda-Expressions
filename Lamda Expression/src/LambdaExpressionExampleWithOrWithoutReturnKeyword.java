interface AddableReturnKeyword{
    int add(int a,int b);
}

public class LambdaExpressionExampleWithOrWithoutReturnKeyword {
    public static void main(String[] args) {

        // Lambda expression without return keyword.
        AddableReturnKeyword ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

        // Lambda expression with return keyword.
        AddableReturnKeyword ad2=(int a,int b)->{
            return (a+b);
        };
        System.out.println(ad2.add(100,200));
    }
}

