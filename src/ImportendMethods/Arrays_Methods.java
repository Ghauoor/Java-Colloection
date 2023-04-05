package ImportendMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrays_Methods {
    public static void main(String[] args) {
        Integer[] arr = {2, 9, 1, 0};
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(2);
        list.add(3);
        list.add(21);
        list.add(3);
        list.sort(Collections.reverseOrder());
        System.out.println(list);

        List<Integer> newArr = Arrays.asList(arr);

       // Collections.binarySearch(newArr, 2);
    }
}
