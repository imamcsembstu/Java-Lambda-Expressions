interface FunctionalInterfaceClass{
    public void draw();
}
public class WithoutLambdaExpression {
    public static void main(String[] args) {
        int width = 10;

        FunctionalInterfaceClass obj = new FunctionalInterfaceClass() {
            public void draw() {
                System.out.println("Drawing" + width);
            }
        };
        obj.draw();
    }
}