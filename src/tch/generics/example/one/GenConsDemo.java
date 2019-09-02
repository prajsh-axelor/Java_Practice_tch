package tch.generics.example.one;

class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }

    void showval(){
        System.out.println("val : " + val);
    }
}

//class GenCons {
//    private Object val;
//
//    <T extends Object> GenCons(T arg) {
//        val = arg;
//    }
//
//    void showval(){
//        System.out.println("val : " + val);
//    }
//}

public class GenConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);
//        GenCons test3 = new GenCons("Prajjwal");

        test.showval();
        test2.showval();
//        test3.showval();
    }
}
