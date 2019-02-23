package cn.myfreecloud.demo;

import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {

        // create 3 BigDecimal objects
        BigDecimal bg1, bg2, bg3;

        bg1 = new BigDecimal("2.310");
        bg2 = new BigDecimal("4.620");

        // multiply bg1 with bg2 and assign result to bg3
        bg3 = bg1.multiply(bg2);

        String str = "Multiplication Result is " +bg3;

        // print bg3 value
        System.out.println( str );
    }
}