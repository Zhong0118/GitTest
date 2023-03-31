package Warehouse;

import java.time.LocalDate;

public class Food extends Consumables{
	public boolean eaten;
    public Food(){

    }
    public Food(String name, int weight, LocalDate date,boolean eaten){
        super(name,weight,date);
        this.eaten = eaten;
    }
    public void eat(){
        if (!eaten && this.isExpired()){
            System.out.println("Eating " + this.name);
        }else if (eaten && this.isExpired()) {
        	System.out.println("This food has been eaten.");
        }else {
            System.out.println("This food has been expired.");
        }
    }

    @Override
    public String toString() {
        return "Food{" +
                "eaten=" + eaten +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", expiration_date=" + expiration_date +
                '}';
    }
}
