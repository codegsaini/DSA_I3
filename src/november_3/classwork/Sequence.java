package november_3.classwork;


import java.util.HashMap;
import java.util.Scanner;

public class Sequence {

    static int length;

    static int[] sequence;

    static HashMap<Integer, Integer> map = new HashMap<>();

    static int currentIndex = 1;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        sequence = new int[length];

        sequence[0] = 0;

        for (int i =1; i< length; i++) {
            insert();
            currentIndex++;
        }

        for (int i =0; i< length; i++) {
            System.out.print(" " + sequence[i] + " ");
        }
    }
    static void insert() {

        if (map.containsKey(sequence[currentIndex - 1])) {
            int lastOccurrence = map.get(sequence[currentIndex - 1]);
            int value = currentIndex - 1 - lastOccurrence;
            map.put(value, currentIndex);
            sequence[currentIndex] = value;
        } else {
            map.put(sequence[currentIndex - 1], map.get(sequence[currentIndex - 1]));
            sequence[currentIndex] = 0;
        }


    }

}
