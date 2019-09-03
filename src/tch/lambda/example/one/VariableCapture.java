package tch.lambda.example.one;

interface MyFunc {
    int func(int n);
}

public class VariableCapture {
    public static void main(String[] args) {
        int num = 10;

//        num = 12; //not allowed.. num is losing its final status
        MyFunc myLambda = (n) -> {
            int v = num + n;  //this use of num is okay as it doesn't modify enclosing scope varable
            // num++;
            // this gives error "Variables used in lambda should be final or effectively final" as lambda expression
            // is trying to modify that variable
            return v;
        };
//        num = 9; this is also not allowed... same reason
    }
}
