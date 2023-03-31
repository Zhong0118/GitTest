package Warehouse;
import java.time.LocalDate;

public class Consumables extends Item {

    public LocalDate expiration_date;


    public Consumables() {}
    public Consumables(String name, int weight, LocalDate expiration_date) {
    	super(name,weight);
    	this.expiration_date = expiration_date;
        
    }

    public boolean isExpired(){
        return this.expiration_date.compareTo(LocalDate.now()) > 0;
    }

}