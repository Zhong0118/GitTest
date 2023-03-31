package Warehouse;

public class Bomb extends Weapons{

    public Bomb(String name,int weight,boolean used){
        super(name,weight,used);
    }
    @Override
    public void use() {
        if (!used){
            System.out.println("Boom!");
            used = true;
        }else {
            System.out.println("This bomb has been used.");
        }
    }

    @Override
    public String toString() {
        return "Bomb{" +
                "used=" + used +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
