package Warehouse;

public abstract class Weapons extends Item{
    public int bullets;
    public boolean used;

    public Weapons(String name, int weight, int bullets) {
        super(name,weight);
        this.bullets = bullets;
    }
    public Weapons(String name, int weight,boolean used){
        super(name,weight);
        this.used = used;
    }

    abstract void use();
}
