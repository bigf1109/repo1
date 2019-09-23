package demo01;

public class FunMain {
    public static void main(String[] args) {
        demo01(new MyImpl());
        demo01(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类接口");
            }
        });
        demo01(()-> System.out.println("Lamda表达式接口"));

    }

    public static void demo01(MyFunctionalInterface my){
        my.method();
    }
}
