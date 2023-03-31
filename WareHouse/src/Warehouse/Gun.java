package Warehouse;

public class Gun extends Weapons{
    public Gun(String name,int weight,int bullets){
        super(name,weight,bullets);
    }
    @Override
    public void use() {
        if (this.bullets>0){
            System.out.println("Bang!");
            this.bullets--;
        }else {
            System.out.println("This gun has none bullets.");
        }
    }

    @Override
    public String toString() {
        return "Gun{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", bullets=" + bullets +
                '}';
    }
}
