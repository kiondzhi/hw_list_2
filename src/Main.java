import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numsOne = new LinkedList<>();
        numsOne.add(1);
        numsOne.add(2);
        numsOne.add(3);
        numsOne.add(4);
        numsOne.add(5);
        SwapMethod swap = new SwapMethod();
        System.out.println(numsOne);
        swap.swapLastAndFirst(numsOne);
    }
}