package Day5_StreamsAPI;

import java.util.Arrays;

public class MethodReferencesMain {
    public static void main(String[] args) {
        String []a= {"GFG", "IDE", "COURSES"};
        String []b= {"gfg", "ide", "courses"};
        if(Arrays.equals(a, b, String::compareToIgnoreCase))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
