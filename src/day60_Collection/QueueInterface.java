package day60_Collection;
import java.util.*;
public class QueueInterface { // queue does not have index number
    public static void main(String[] args) {
    Queue<Integer>q1=new ArrayDeque<>(); // FIFO -> first in first out
    q1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9) );
       int firstObject=q1.poll();
        System.out.println(q1); // 2,3,4,5,6,7,8,9

    }
}
