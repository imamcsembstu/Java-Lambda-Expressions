interface Sayable{
    String say(String message);
}
public class LambdaExpressionExampleSingleParameter {
    public static void main(String[] args){
        // Lambda expression with single parameter.
        Sayable obj=(messageNotHaveToSame)->{
            return "I am "+messageNotHaveToSame;
        };
        System.out.println(obj.say("MD.IMAM HASAN\n"));

        Sayable obj2=(message)->{
            return "Hello "+message;
        };
        System.out.println(obj.say("Arifin"));


    }
}
