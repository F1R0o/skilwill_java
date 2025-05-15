

public class lesson2 {

    public static void main(String[] args) {
        PrintAnimal("dog");
        PrintAnimal("ELEPHANT");
        Power(2, 2);
        
    }


    static void PrintAnimal(String animal)
    {

        

        if ("cat".equalsIgnoreCase(animal) || "dog".equalsIgnoreCase(animal) || "pig".equalsIgnoreCase(animal) || "lion".equalsIgnoreCase(animal)) {
            System.out.println("i am " + animal );
        }
        else{System.out.println("I am Animal");}


    }

    static void Power(int a, int b)
    {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        System.out.println(result);
    }



    
}
