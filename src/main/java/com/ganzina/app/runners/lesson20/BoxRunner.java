package com.ganzina.app.runners.lesson20;

import com.ganzina.app.classwork.lesson20.Box;
import com.ganzina.app.classwork.lesson20.OrderPair;
import com.ganzina.app.classwork.lesson20.Pair;

/**
 * Created by evgeniya on 30.05.2017.
 */
public class BoxRunner {
    public static void main(String[] args) {
        //Box<String> numberBox = new Box<>("10"); compile error, because String does not extends Number; is not with its bounds

        Box<Integer> numberBox = new Box<>(10);
        Pair <String, Integer> p2 = new OrderPair<>("Odd",11);
        numberBox.inspect(p2);
        //numberBox.inspect(new Integer(10)); --> compile error incomp types, нужно передавать об]ект, который
        // унаследует Pair
    }
}
