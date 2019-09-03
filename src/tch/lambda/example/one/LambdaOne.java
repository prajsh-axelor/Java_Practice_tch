package tch.lambda.example.one;

interface MyNumber {
    double getValue();
}

public class LambdaOne {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println(myNum = () -> 123.45);
        //output : tch.lambda.example.one.LambdaOne$$Lambda$2/1096979270@404b9385

        System.out.println(myNum.getValue());
        //output : 123.45

        // Here, a more complex expression is used.
        myNum = () -> Math.random() * 100;

        // These call the lambda expression in the previous line.
        System.out.println("A random value: " + myNum.getValue());
        System.out.println("Another random value: " + myNum.getValue());

//        myNum = () -> "123.03"; // Error!
    }
}
