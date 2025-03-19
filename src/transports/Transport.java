package transports;

public class Transport{
    private String type;
    private String brand;
    private int levelOfTank = 100;

    public Transport(String brand, String type){
        this.type = type;
        this.brand = brand;
    }
    public Transport(){}

    public void feelTank(){
        levelOfTank = 100;
        System.out.println("Tank is full.\n level of tank is "+levelOfTank);
    }
    
    public String getType(){
        return type;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getLevelOfTank(){
        return levelOfTank;
    }
}