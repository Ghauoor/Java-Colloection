import java.util.*;

public class All_Collections {
    public static void main(String[] args) {

        /*
        Creating collection

        1) Type-Safe: Same type of Element(Object) are added to Collection

        2) Un-Type-Safe: Diff. types of Element(Objects) can be added

         */

        //TypeSafe Collection
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Naruto ");
        stringArrayList.add("Hinata ");
        stringArrayList.add("Luffy ");
        stringArrayList.add("Saitama ");
        stringArrayList.add("Name ");
        //stringArrayList.add(234); error can't be added

        System.out.println(stringArrayList);
        System.out.println(stringArrayList.get(2));
        System.out.println(stringArrayList.get(3));
        System.out.println(stringArrayList.get(4));
        //Un Type safe collection

        LinkedList linkedList = new LinkedList();
        linkedList.add("Hello");
        linkedList.add(123);
        linkedList.add(true);

        System.out.println(linkedList);

        Vector<String> names = new Vector<>();
        names.addAll(stringArrayList);
        System.out.println(names);

        System.out.println("_______________________________________________________");
        System.out.println("SETS");

        HashSet<Double> nums = new HashSet<>();

        //AutoBoxing and Boxing
        nums.add(12.12);
        nums.add(0.23);
        nums.add(23.333);
        nums.add(23.333);
        nums.add(1.34);
        System.out.println(nums);

        //Order wise sorting
        TreeSet<Double> treeSet = new TreeSet<>();
        treeSet.addAll(nums);
        System.out.println(treeSet);


    }


}
