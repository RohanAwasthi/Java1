package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list);

        for(int n:list){
        System.out.println(n);
        }

        System.out.println(list.get(5));

        Set<Integer> set=new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(2);
       System.out.println(set);
       for(int n:set){
        System.out.println(n);
       }

     /*  Iterator<Integer> itr=set.iterator();
       while(itr.hasNext()){
        System.out.println(itr.hasNext());
       }*/

       
       Map<String, Integer> employeeWages = new HashMap<>();
       employeeWages.put("Thomas", 1000000); 
       employeeWages.put("nkdebug", 40000); 
       employeeWages.put("rkdebug", 20000); 
       employeeWages.put("pkdebug", 20000); 
       employeeWages.put("skdebug", 100000); 
       employeeWages.put("nkdebug", 60000); 

       System.out.println(employeeWages);
       System.out.println(employeeWages.get("Thomas"));

       System.out.println(employeeWages.keySet());

       for(String name: employeeWages.keySet()) {
           System.out.println(name + "--->" + employeeWages.get(name));
       }

       for(Integer salary: employeeWages.values()) {
           System.out.println(salary + "--->");
       }
    }}