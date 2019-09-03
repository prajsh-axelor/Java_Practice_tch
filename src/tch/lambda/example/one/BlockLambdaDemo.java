package tch.lambda.example.one;

interface NumericFour{
    int func(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        //calculates the factorial of the given number
        NumericFour factorial = (n) -> {
            int result = 1;
            for(int i=1; i <= n; i++){
                result = i * result;
            }
            return result;
        };

        System.out.println("factorial of 3 is : " + factorial.func(3));
        System.out.println("factorial of 13 is : " + factorial.func(13));
    }
}
