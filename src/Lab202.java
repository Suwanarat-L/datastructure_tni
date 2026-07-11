import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        //2513110    6 5 6
        int lastNum = 6;
        int studyDate = 10;


        for (int num : initial_numbers) {
            numbers.add(num);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to append: ");
        int numAppend = scanner.nextInt();
        numbers.add(numAppend); //10
        //10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20

        System.out.print("Enter a number to insert: ");
        int numInsert = scanner.nextInt();
        numbers.add(lastNum, numInsert); //6
        //10, 11, 12, 13, 14, 15, 6, 16, 17, 18, 19, 20

        numbers.remove(lastNum-1); //5 ลบ15ออก
        //10, 11, 12, 13, 14, 6, 16, 17, 18, 19, 20

        numbers.set(lastNum, studyDate); //6
        //10, 11, 12, 13, 14, 6, 10, 17, 18, 19, 20

        System.out.println("\n--- Display ---");
        System.out.println("ArrayList: " + numbers);
    }
}
