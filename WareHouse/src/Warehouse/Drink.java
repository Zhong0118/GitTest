package Warehouse;

import java.time.LocalDate;

public class Drink extends Consumables{
	public boolean drunk;
    public Drink(){

    }
    public Drink(String name, int weight, LocalDate date,boolean drunk){
        super(name,weight,date);
        this.drunk = drunk;
    }


    public void drink(){
        if (!drunk && this.isExpired()){
            System.out.println("Drinking " + this.name);
        } else if (drunk && this.isExpired()){
        	System.out.println("This drink has been drunk.");
        }else {
        	System.out.println("This drink has been expired.");
        }
    }
    @Override
    public String toString() {
        return "Drink{" +
                "drunk=" + drunk +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", expiration_date=" + expiration_date +
                '}';
    }
}
