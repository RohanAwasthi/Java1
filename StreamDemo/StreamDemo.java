package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {


    private static Stream<Integer> stream;
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15,20,33,44,55,66);

        Stream<Integer> stream =list.stream();
        Stream<Integer> oddStream=stream.filter(k-> k%2!=0);
        Stream<Integer> transformedStream=oddStream.map(k->k-5);
    
        int sum=transformedStream.reduce(0, (p,q)->p+q);
        stream.forEach(n->System.out.println(n));

        System.out.println(sum);



        int result=list.stream()
        .filter(a->a%2!=0)
        .map(a->a-5)
        .reduce(1,(p,q)->p*q );
        System.out.println(result);

    }




}
