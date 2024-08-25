import java.util.LinkedList;

public class SwapMethod {
    LinkedList<Integer> array;

    static LinkedList<Integer> swapLastAndFirst(LinkedList<Integer> array) {
        int temp = array.pollLast();
        int temp2 = array.pollFirst();
        array.addFirst(temp);
        array.addLast(temp2);
        System.out.println(array);
        return array;
    }
}
