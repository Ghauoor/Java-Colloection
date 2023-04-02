package Queues;

public class StudentMarks implements Comparable<StudentMarks> {
    private int maths;
    private int physics;

    public StudentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" + "maths=" + maths + ", physics=" + physics + '}';
    }

    @Override
    public int compareTo(StudentMarks o) {
        /*
         * current object < other object
         *   return -1; --> can return any -ive number
         *
         * current object > other object
         *   return 1; --> can return any +ive number
         *
         * current object == other object
         *  return 0;
         *
         * */

//        if (this.maths < o.maths) {
//            return -1;
//        }
//        if (this.maths > o.maths) {
//            return 1;
//        }
//
//        if (this.maths == o.maths) {
//            return 0;
//        }

        System.out.println("Compare to () method is Call ");

        //Ascending order sort the obj values
        return o.maths - this.maths;
    }
}
