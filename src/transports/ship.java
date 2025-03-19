package transports;

public class ship extends Transport{
    private int year;

    public ship(String type,String brand,int year){
        super(type,brand);
        this.year = year;
    }

    public String move(){
        return "Ship has moved. level of tank is"+super.getLevelOfTank()*0.2;
    }
    @Override
    public void feelTank(){
        super.feelTank();
        System.out.println("ship is feeled by oil");
    }
    
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
}
