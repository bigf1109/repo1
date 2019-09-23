package demo02;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableTest {
    public static void main(String[] args) {
        String[] strings = {"1", "22", "333", "4444"};
        /*Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });*/

        Arrays.sort(strings, getComparator());
        System.out.println(Arrays.toString(strings));
        for(String s : strings){
            System.out.println(s);
        }
    }

    public static Comparator<String> getComparator(){
        return ((o1, o2) -> o2.length() - o1.length());
    }
}

