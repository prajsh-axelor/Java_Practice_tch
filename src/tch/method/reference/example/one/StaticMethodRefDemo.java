package tch.method.reference.example.one;


interface StringFunc {
    String func(String n);
}

class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        int i;
        for(i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}

public class StaticMethodRefDemo {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;
        outStr = stringOp(MyStringOps::strReverse, inStr);
        //FOCUS HERE
        /*
            a reference to the static method strReverse( ), declared inside MyStringOps, is passed
            as the first argument to stringOp( ). This works because strReverse is compatible with the
            StringFunc functional interface. Thus, the expression MyStringOps::strReverse evaluates to
            a reference to an object in which strReverse provides the implementation of func( ) in
            StringFunc.
        */

        System.out.println("Original string : " + inStr);
        System.out.println("String reversed : " + outStr);
    }
}
