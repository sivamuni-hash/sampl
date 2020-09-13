package ssss;

import java.util.Vector;

public class ProfileTest {
     private ProfileTest(int w) { // line 3
        System.out.println(w);
    }
    public static ProfileTest() { // line 6
        System.out.println(5);
    }
    public static void main(String args[]) {
        ProfileTest obj = new ProfileTest(10);
}}
