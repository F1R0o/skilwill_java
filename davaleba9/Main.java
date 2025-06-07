package davaleba9;

public class Main {
    public static void main(String[] args){
        Car car = new Car("mersedes","w221",2020,4);
        System.out.println(car);


        int x = stringToInteger("99");
        System.out.println(x);



    }



    public static int stringToInteger(String numberString) {
        return Integer.parseInt(numberString);
    }
}
