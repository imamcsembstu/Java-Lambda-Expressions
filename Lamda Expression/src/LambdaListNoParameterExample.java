interface InterfaceOfNoParameter{
    public String say(); //It also ok on Without public,
}

public class LambdaListNoParameterExample {
    public static void main(String[] args) {

        InterfaceOfNoParameter obj=()->{
            return "I have nothing to say";
    };
        System.out.println(obj.say());

}
}
