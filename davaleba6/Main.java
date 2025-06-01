package davaleba6;
public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "dog", "elephant", "flower", "grape", "hat", "ice", "jungle"};

        for (String word : words) {
            System.out.println(word);
        }

        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};

        findIndex(numbers, 25);
        findIndex(numbers, 99);
    }

    public static void findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("ნაპოვნია ინდექსზე: " + i);
                return;
            }
        }
        System.out.println("ვერ ვიპოვე");
    }
}
