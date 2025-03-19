package transports;

public class car extends Transport{
    private String carType;

    public car(String carType,String type,String brand){
        super(type,brand);
        this.carType = carType;
    }

    public String crushTheCar(){
        return "car is crushed";
    }

    public String getCarType(){
        return carType;
    }
    public void setCarType(String carType){
        this.carType = carType;
    }
}
