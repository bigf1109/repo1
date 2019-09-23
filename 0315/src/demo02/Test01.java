package demo02;

public class Test01 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "java";

        show1(1, s1 + s1 + s3);

        show2(2, ()->{
            System.out.println("测试");
            return s1 + s2 + s3;
        });

    }

    public static void show1(int level, String log){
        if(level == 1){
            System.out.println(log);
        }
    }
    public static void show2(int level, Log log){
        if(level == 1){
            System.out.println(log.showLog());
        }
        //System.out.println("测试！");
    }
}
