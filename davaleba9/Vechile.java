package davaleba9;

public class Vechile {
    private String brand;
    private String modelName;
    private int releaseYear;


    public Vechile(String brand,String modelName,int releaseYear){
        this.brand = brand;
        this.modelName = modelName;
        this.releaseYear = releaseYear;
    }


    public String getBrand(){
        return brand;
    }


    public String getModelName(){
        return modelName;
    }


    public int getReleaseYear(){
        return releaseYear;
    }




    public void SetBrand(String brand){
        this.brand = brand;
    }

    public void SetModel(String model){
        this.modelName = model;
    }

    public void SetYear(int releaseYear){
        if(releaseYear > 0){
            this.releaseYear = releaseYear;
        }
        else {
            System.out.println("release year must be positive");
        }
    }


}
