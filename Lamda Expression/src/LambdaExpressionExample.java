interface FunctionalInterface{
    public void draw();
}
public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width=10;

        FunctionalInterface obj= ()->{
            System.out.println("Drawing:  "+ width);
        };
        obj.draw();

    }
}
