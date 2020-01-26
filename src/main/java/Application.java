
import com.shell.recursion.Factorial;
import com.shell.sort.BubbleSort;
import com.shell.sort.InsertionSort;
import com.shell.sort.SelectionSort;

import java.util.Arrays;

public class Application {

    public static void main(String args[]){
        int[] arrayBubbleSort = {2,1,6,4,5,3};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arrayBubbleSort);

        Arrays.stream(bubbleSort.sort(arrayBubbleSort)).forEach(i -> System.out.println(i));

        int[] arraySelSort = {7,1,0,4,2,3};
        SelectionSort selectionSort = new SelectionSort();
        Arrays.stream(selectionSort.sort(arraySelSort)).forEach(i -> System.out.println(i));

        int[] arrayInsSort = {7,1,8,4,2,7};
        InsertionSort insertionSort = new InsertionSort();
        Arrays.stream(insertionSort.sort(arrayInsSort)).forEach(i -> System.out.println(i));

        Factorial factorial = new Factorial();
        System.out.println(factorial.factorialIterative(8));
        System.out.println(factorial.factorialRecursive(8));

    }
}
