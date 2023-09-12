

// Sayable Interface is inside LambdaExpressionExampleSingleParameter class

/***
 If there is only one statement, you may or may not use return keyword.
 You must use return keyword when lambda expression contains multiple statements.
 */

public class LambdaExpressionExampleMultipleStatements {
    public static void main(String[] args) {

        // You can pass multiple statements in lambda expression
        Sayable person = (message)-> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("time is precious."));
    }
}
