package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test_Animals {
    public static void main(String[] args) {
        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(new Animals("Tommy", 2));
        animalsList.add(new Animals("Alpha", 6));
        animalsList.add(new Animals("koko", 3));
        animalsList.add(new Animals("Brace", 5));


        Set<Animals> animalsSet =
                new HashSet<>(animalsList);

        System.out.println();

//        for (Animals animal :
//                animalsSet) {
//            System.out.print(animal + ",");
//        }

        /**
         * EQUALS and HASHCODE methods from objet class
         * are not overridden in animals class
         * and I'm creating new object, so it give me false
         * even this object is preset in set, but it give false
         *
         * ######################################################
         * After override the hashCode and equals methods
         * it return true
         */
        System.out.println(animalsSet.contains(new Animals("Brace", 5)));

    }
}
