import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Converters converters = new Converters();

        String s1 = "ahbhjkdhjd";
        int count = 0;
        for (int i=0; i<=s1.length()-1; i++) {
            if(s1.charAt(i) == 'h') {
                count++;
            }
        }
        String s2 = "mama";


        int arr[] = {10,22,565,66,75};
        Arrays.sort(arr);


        Integer array[] = {10,22,565,66,75};
        Arrays.sort(array, Collections.reverseOrder());

        int arrays[] = {15,2121,5654,65126,654};
        int sum = 0;
        for (int num: arrays){
            sum = sum+num;
        }

        //Create a method which return a list on numbers from 0 to 20.
        ArrayList<Integer> al = new ArrayList<Integer>();
        Collections.addAll(al, 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
       // System.out.println(al.toString());




        //Create a method that will return a set of numbers from 0 to 207
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(
                new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(
                new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println(union);

        //Create a treemap with 5 elements.

        Student o1 = new Student(1,"hjbehbhujb",25);
         Student o2 = new Student(2,"hjbehbhujb",25);
        Student o3 = new Student(3,"hjbehbhujb",25);
        Student o4 = new Student(4,"hjbehbhujb",25);
        Student o5 = new Student(5,"hjbehbhujb",25);
         Map<Integer,Student> treemap = new TreeMap<Integer,Student>();
        treemap.put(1, o1);
         treemap.put(2, o2);
        treemap.put(3, o3);
        treemap.put(4, o4);
        treemap.put(5, o5);
          TreeMap<Integer,Student> treemap3 = new TreeMap<Integer,Student>();
        System.out.println(treemap.get(3));

        treemap3.putAll(treemap);
         for(Integer id : treemap3.keySet()){
        System.out.println(treemap3.get(id));
        }




        //System.out.println(converters.convertStringToUpperCase("dbgkjbcjkjb"));
        //System.out.println(converters.convertStringToLowerCase("AADADadadfDSADF"));
        //System.out.println("Frequency of h is: "+count);
        //System.out.println(s2.replace('a','b'));
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(array));
        //System.out.println(sum);
       // System.out.println(al.size());
    }
}
