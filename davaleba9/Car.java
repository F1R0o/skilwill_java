package davaleba9;

public class Car extends  Vechile{

    private int wheelCount;


    public Car(String brand, String modelName, int releaseYear,int wheelCount) {
        super(brand, modelName, releaseYear);
        this.wheelCount = wheelCount;
    }


    public int getWheelCount(){
        return  wheelCount;
    }


    public void SetWheel(int wheelCount){
        if(wheelCount > 0){
            this.wheelCount = wheelCount;
        }
        else {
            System.out.println("wheel must be more than 0");
        }
    }


    @Override
    public String toString() {
        return
                "brand='" + getBrand() + '\'' +
                ", modelName='" + getModelName() + '\'' +
                ", releaseYear=" + getReleaseYear() +
                ", wheelCount=" + wheelCount;

    }


}
