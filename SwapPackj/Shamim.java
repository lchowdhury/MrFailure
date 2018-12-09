package SwapPackj;

import java.sql.SQLOutput;

public class Shamim {
    public static void main(String[] args) {
        String x = "Automation";
        String y = "FrameWork";
        System.out.println("Before swapping ");
        System.out.println("value of x :"+ x);
        System.out.println("value of y:" + y);
       x= x+y;
       y=x.substring(0,x.length()-y.length());

       x=x.substring(y.length());
        System.out.println("After swapping ");
        System.out.println("value of x :"+ x);
        System.out.println("value of y:" + y);









    }



}
