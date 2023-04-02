package Queues;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class StudentMarks_Test {
    public static void main(String[] args) {
        //Get Top 3 students according to maths marks
        List<StudentMarks> studentMarksList = new ArrayList<>();
        studentMarksList.add(new StudentMarks(70, 80));
        studentMarksList.add(new StudentMarks(38, 10));
        studentMarksList.add(new StudentMarks(100, 38));
        studentMarksList.add(new StudentMarks(40, 88));
        studentMarksList.add(new StudentMarks(97, 98));
        studentMarksList.add(new StudentMarks(20, 56));

        PriorityQueue<StudentMarks> studentMarksPriorityQueue =
                new PriorityQueue<>(studentMarksList);

        List<StudentMarks> topThree = new ArrayList<>();
        int index = 0;

        while (!studentMarksPriorityQueue.isEmpty()) {
            if (index == 3)
                break;

            topThree.add(studentMarksPriorityQueue.poll());
            index++;
        }

        System.out.println(topThree);

    }
}
