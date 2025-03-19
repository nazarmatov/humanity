package transports;

public class airplan extends Transport{
    private String name;
    private boolean free = true;

    public airplan(String name,String brand,String type){
        super(brand,type);
        this.name = name;
    }

    public boolean isFree(){
        return free;
    }
    public void blastOff(){
        free = false;
        System.out.println(name+" has blasted off. status of freedom: "+free);
    }
    public void plant(){
        free = true;
        System.out.println(name+" has planted. status of freedom: "+free);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
