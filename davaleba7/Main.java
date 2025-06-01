package davaleba7;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Luka");
        stringList.add("Java");
        stringList.add("C#");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");
        stringList.add("C");


        for (String string : stringList) {
            System.out.println(string);
        }



        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(5);
        list1.add(12);
        list1.add(3);

        list2.add(8);
        list2.add(20);
        list2.add(7);

        int max = findMaxFromTwoLists(list1, list2);
        System.out.println("largest num is " + max);





    }



    public static int findMaxFromTwoLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        int max = 0;


        for (int num : list1) {
            if (num > max) {
                max = num;
            }
        }


        for (int num : list2) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}

