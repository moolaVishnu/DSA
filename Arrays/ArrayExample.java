public class ArrayExample {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};

        System.out.println("Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        System.out.println("Total subjects: " + marks.length);
    }
}
