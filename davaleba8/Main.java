package davaleba8;
import java.util.*;


public class Main {
    public static void main(String[] args){
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);


        HashSet<Integer> commonElements = FindSame(set1, set2);

        System.out.println("Same numbers: " + commonElements);


        Map<Integer, List<Car>> carData = new HashMap<>();


        carData.put(2020, Arrays.asList(new Car("Toyota", "Corolla"), new Car("Honda", "Civic")));
        carData.put(2021, List.of(new Car("Ford", "Focus")));
        carData.put(2022, Arrays.asList(
                new Car("BMW", "X5"),
                new Car("Audi", "A4"),
                new Car("Mercedes", "C-Class")
        ));



        int maxYear = findYearWithMostCars(carData);
        System.out.println("Year with most cars: " + maxYear);


    }

     public static HashSet<Integer> FindSame(HashSet<Integer> set1,HashSet<Integer> set2)
    {
        HashSet<Integer> set3 = new HashSet<>();
        for (Integer value : set1) {
            if (set2.contains(value)) {
                set3.add(value);
            }
        }





        return set3;



    };


    public static int findYearWithMostCars(Map<Integer, List<Car>> carMap) {
        int maxYear = 0;
        int maxCount = 0;

        for (Map.Entry<Integer, List<Car>> entry : carMap.entrySet()) {
            int year = entry.getKey();
            int carCount = entry.getValue().size();

            if (carCount > maxCount) {
                maxCount = carCount;
                maxYear = year;
            }
        }

        return maxYear;
    }

}


