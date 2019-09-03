package tch.method.reference.example.one;

//Invoking a Instance method on the object of the class

interface StringFun{
    String func(String n);
}

class MyStringOpss {
    String strReverse(String str) {
        String result = "";
        int i;
        for(i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}

public class InstanceMethodRefDemo {

    static String stringOp(StringFun sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;
        MyStringOpss stringOpss = new MyStringOpss();
        outStr = stringOp(stringOpss::strReverse, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
    }

}
