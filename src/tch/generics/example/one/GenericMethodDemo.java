package tch.generics.example.one;

public class GenericMethodDemo {
    static <T extends  Comparable<T>, V extends T> boolean isInn(T x, V [] y) {
        for( int i = 0; i < y.length; i++){
            if(x.equals(y[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1,2,3,4,5};
        if(isInn(2, nums))
            System.out.println("2 is in nums");
        if(!isInn(7,nums))
            System.out.println("7 is not in nums");

        System.out.println();

        String strs [] = {"one","two","three","four","five"};
        if(isInn("two", strs))
            System.out.println("two is in strs");
        if(!isInn("seven", strs))
            System.out.println("seven is not in strs");

//        if(isInn("two", nums))
//            System.out.println("two is in strs");
    }
}
