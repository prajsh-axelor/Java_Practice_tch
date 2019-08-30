package tch.generics.example.one;

public class GenDemo {
    public static void main(String[] args) {
        //working with Integer type
        Gen<Integer> iOb = new Gen<Integer>(88);
        iOb.showType();

        int v = iOb.getob();
        System.out.println("value : " + v);

        System.out.println();

        //working with String type
        Gen<String> strOb = new Gen<String> ("Generics Test");
        strOb.showType();

        String str = strOb.getob();
        System.out.println("value : " + str);
    }
}

class Gen<T> {
    T ob; //declare an object of type T

    //constructor taking a refernce of type T
    Gen(T o) {
        ob = o;
    }

    //return ob
    T getob(){
        return ob;
    }

    //show type of T
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
