package com.godOfJavas.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args){
        Stream sts = new Stream();

        Integer[] values = {1,3,5};
        List<Integer> list = Arrays.stream(values).collect(Collectors.toList());

        sts.multiplyWithFor(list);
    }

    public void multiplyWithFor(List<Integer> list) {
        list.stream().map(x->x*3).forEach(System.out::println);
    }
}
