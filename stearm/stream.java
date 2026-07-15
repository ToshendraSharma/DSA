package stearm;
import java .util.*;
public class stream {
    public static void main(String [] args){
        List<Integer>list=Arrays.asList(1,2,3,4,5,6);
        list.stream().filter(n ->n%2==0).forEach(p->System.out.println(p));
        list.stream().map(n->n%2==0).forEach(System.out::println);
        long count= list.stream().filter(n ->n%2==0).count();
        System.out.println(count);
    }
}
