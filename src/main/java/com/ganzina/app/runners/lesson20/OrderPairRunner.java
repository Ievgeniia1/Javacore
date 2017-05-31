package com.ganzina.app.runners.lesson20;

import com.ganzina.app.classwork.lesson20.*;

/**
 * Created by evgeniya on 30.05.2017.
 */
public class OrderPairRunner {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderPair<>("Even",8);
        Pair<String, Integer> p2 = new OrderPair<>("Odd", 11);
        Pair<Integer, Integer> p3 = new OrderPair<>(12, 11);
        Pair<Integer, Integer> p4 = new OrderPair<>(12, 11);
        boolean same = OrderUtil.<String,Integer>compare(p1,p2);
        System.out.println(same);

        boolean same1 = OrderUtil.compare(p3,p4);
        System.out.println(same1);

        System.out.println("__________________________________");

        // Interface Compare with child Class CompareData. Overload method compare()

        Compare<Integer> c1 = new CompareData<>(15);
        Compare<String> c2 = new CompareData<>("GO");
        Compare<Integer> c3 = new CompareData<>(45);
        Compare<String> c4 = new CompareData<>("GO");

        boolean result = OrderUtil.compare(c2,c4); //static method
        System.out.println(result);

        boolean result2 = OrderUtil.compare(c1,c3);
        System.out.println(result2);


    }
}
